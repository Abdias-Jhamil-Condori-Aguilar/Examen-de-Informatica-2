public class Bienes {
    String nombre;
    String  unidadMedida;
    int valorUnitario;
    int valorTotal;
    String codigoUniversal;

    public Bienes(String nombre, String unidadMedida, int valorUnitario, int valorTotal, String codigoUniversal) {
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.codigoUniversal = codigoUniversal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getCodigoUniversal() {
        return codigoUniversal;
    }

    public void setCodigoUniversal(String codigoUniversal) {
        this.codigoUniversal = codigoUniversal;
    }

    @Override
    public String toString() {
        return "Bienes{" +
                "nombre='" + nombre + '\'' +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", valorUnitario=" + valorUnitario +
                ", valorTotal=" + valorTotal +
                ", codigoUniversal='" + codigoUniversal + '\'' +
                '}';
    }
}
