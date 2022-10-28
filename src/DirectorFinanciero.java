public class DirectorFinanciero {
    String aprobado;

    public DirectorFinanciero(String aprobado) {
        this.aprobado = aprobado;
    }

    public String getAprobado() {
        return aprobado;
    }

    public void setAprobado(String aprobado) {
        this.aprobado = aprobado;
    }

    @Override
    public String toString() {
        return "DirectorFinanciero{" +
                "aprobado='" + aprobado + '\'' +
                '}';
    }
}
