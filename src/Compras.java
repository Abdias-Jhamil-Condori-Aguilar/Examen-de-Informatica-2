public class Compras {
    Solicitud solicitudes;
    Bien bien;

    public Compras(Solicitud solicitudes, Bien bien) {
        this.solicitudes = solicitudes;
        this.bien = bien;
    }

    public Solicitud getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(Solicitud solicitudes) {
        this.solicitudes = solicitudes;
    }

    public Bien getBien() {
        return bien;
    }

    public void setBien(Bien bien) {
        this.bien = bien;
    }

    @Override
    public String toString() {
        return "Compras{" +
                "solicitudes=" + solicitudes +
                ", bien=" + bien +
                '}';
    }
}
