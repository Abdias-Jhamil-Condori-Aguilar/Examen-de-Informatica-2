public class Empleado extends Persona{
    public Empleado(String nombre, String primerApellido, String segundoApellido, int telefono, String cedula) {
        super(nombre, primerApellido, segundoApellido, telefono, cedula);
    }

    @Override
    public String toString() {
        return "Empleado{}";
    }
}
