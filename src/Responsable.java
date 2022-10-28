public class Responsable extends Persona{
    public Responsable(String nombre, String primerApellido, String segundoApellido, int telefono, String cedula) {
        super(nombre, primerApellido, segundoApellido, telefono, cedula);
    }

    @Override
    public String toString() {
        return "Responsable{}";
    }
}
