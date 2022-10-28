import java.util.Date;

public class Solicitud {
    Responsable responsable;
    int numeroSolicitud;
    Date fecha;
    String centroCostos;
    String rubroPresupuestal;
    DirectorFinanciero directorFinanciero;

    public Solicitud(Responsable responsable, int numeroSolicitud, Date fecha, String centroCostos, String rubroPresupuestal, DirectorFinanciero directorFinanciero) {
        this.responsable = responsable;
        this.numeroSolicitud = numeroSolicitud;
        this.fecha = fecha;
        this.centroCostos = centroCostos;
        this.rubroPresupuestal = rubroPresupuestal;
        this.directorFinanciero = directorFinanciero;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public int getNumeroSolicitud() {
        return numeroSolicitud;
    }

    public void setNumeroSolicitud(int numeroSolicitud) {
        this.numeroSolicitud = numeroSolicitud;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCentroCostos() {
        return centroCostos;
    }

    public void setCentroCostos(String centroCostos) {
        this.centroCostos = centroCostos;
    }

    public String getRubroPresupuestal() {
        return rubroPresupuestal;
    }

    public void setRubroPresupuestal(String rubroPresupuestal) {
        this.rubroPresupuestal = rubroPresupuestal;
    }

    public DirectorFinanciero getDirectorFinanciero() {
        return directorFinanciero;
    }

    public void setDirectorFinanciero(DirectorFinanciero directorFinanciero) {
        this.directorFinanciero = directorFinanciero;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "responsable=" + responsable +
                ", numeroSolicitud=" + numeroSolicitud +
                ", fecha=" + fecha +
                ", centroCostos='" + centroCostos + '\'' +
                ", rubroPresupuestal='" + rubroPresupuestal + '\'' +
                ", directorFinanciero=" + directorFinanciero +
                '}';
    }
}
