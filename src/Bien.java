import java.util.Date;

public class Bien {
    Responsable responsable;
    Date fechaEntrega;
    String direccion;

    public Bien(Responsable responsable, Date fechaEntrega, String direccion) {
        this.responsable = responsable;
        this.fechaEntrega = fechaEntrega;
        this.direccion = direccion;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Bien{" +
                "responsable=" + responsable +
                ", fechaEntrega=" + fechaEntrega +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
