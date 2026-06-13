public class PrioridadIterator implements Iterator {

    private Medicamento[] ordenados;
    private int posicion = 0;
    private int indice = 0;

    public PrioridadIterator(Medicamento[] medicamentos){
        ordenados =  new Medicamento[medicamentos.length];

    agregarPrioridad(medicamentos,"Alta");
    agregarPrioridad(medicamentos,"Media");
    agregarPrioridad(medicamentos,"Baja");


    }

    private void agregarPrioridad(Medicamento[] medicamentos, String prioridad){
        for (int i = 0; i < medicamentos.length; i++) {
            if (medicamentos[i]!= null && medicamentos[i].getPrioridad().equals(prioridad)){
                ordenados[indice] = medicamentos[i];
                indice ++;
            }
        }
    }


    @Override
    public boolean hasNext(){
        return posicion < ordenados.length && ordenados[posicion ] != null;
    }

    @Override
    public Object next(){
        Medicamento medicamento = ordenados[posicion];
        posicion++;

        return medicamento;
    }


}
