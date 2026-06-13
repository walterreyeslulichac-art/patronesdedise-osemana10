public class ColeccionMedicamentos implements Agregado {

    private Medicamento[] medicamentos;
    private int indice = 0;

    public ColeccionMedicamentos(){
        medicamentos = new Medicamento[7];
    addMedicamento(new Medicamento("Vitamina C", "Baja"));
    addMedicamento(new Medicamento("Insulina", "Alta"));
    addMedicamento(new Medicamento("Paracetamol", "Media"));
    addMedicamento(new Medicamento("Ibuprofeno", "Media"));
    addMedicamento(new Medicamento("Calcio", "Alta"));
    addMedicamento(new Medicamento("Panadol", "Baja"));
    addMedicamento(new Medicamento("Amoxicila", "Media"));
    addMedicamento(new Medicamento("Omeprazol", "Alta"));
    }
    public void addMedicamento(Medicamento medicamento){
        if (indice< medicamentos.length){
            medicamentos[indice] = medicamento;
            indice++;
        }



    }



    @Override
    public Iterator createIterator() {
        return new PrioridadIterator(medicamentos);
    }
}
