import java.util.Date;

public class SalidasAlmacen {
    int numeroSalida;
    Empleado empleado;
    Date fechaSalida;
    Date fechaEntrega;

    public SalidasAlmacen(int numeroSalida, Empleado empleado, Date fechaSalida, Date fechaEntrega) {
        this.numeroSalida = numeroSalida;
        this.empleado = empleado;
        this.fechaSalida = fechaSalida;
        this.fechaEntrega = fechaEntrega;
    }

    public int getNumeroSalida() {
        return numeroSalida;
    }

    public void setNumeroSalida(int numeroSalida) {
        this.numeroSalida = numeroSalida;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "SalidasAlmacen{" +
                "numeroSalida=" + numeroSalida +
                ", empleado=" + empleado +
                ", fechaSalida=" + fechaSalida +
                ", fechaEntrega=" + fechaEntrega +
                '}';
    }
}
