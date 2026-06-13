public class Medicamento {
    private String Nombre;
    private String prioridad;

    public Medicamento(String nombre, String prioridad){
        this.Nombre=nombre;
        this.prioridad=prioridad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPrioridad() {
        return prioridad;
    }
}
