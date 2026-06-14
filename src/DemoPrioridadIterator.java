public class DemoPrioridadIterator {
    public static void main(String[] args) {
        Agregado coleccionMedicamentos= new ColeccionMedicamentos();

        Iterator iterator = coleccionMedicamentos.createIterator();

        System.out.println("Medicamentos por Prioridad");

        System.out.println("Recorrido mediante PrioridadIterator");

        while (iterator.hasNext()){
            Medicamento medicamento = (Medicamento) iterator.next();

            System.out.println("-> "+medicamento.getNombre()+" ("+ medicamento.getPrioridad()+ " )" );
        }

    }
}
