import java.util.Date;

public class Factura {
    int numeroEntrada;
    Date fecha;
    int numeroFactura;
    Proveedor proveedor;
    int totalBienes;
    int valorTotal;

    public Factura(int numeroEntrada, Date fecha, int numeroFactura, Proveedor proveedor, int totalBienes, int valorTotal) {
        this.numeroEntrada = numeroEntrada;
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
        this.proveedor = proveedor;
        this.totalBienes = totalBienes;
        this.valorTotal = valorTotal;
    }

    public int getNumeroEntrada() {
        return numeroEntrada;
    }

    public void setNumeroEntrada(int numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public int getTotalBienes() {
        return totalBienes;
    }

    public void setTotalBienes(int totalBienes) {
        this.totalBienes = totalBienes;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "numeroEntrada=" + numeroEntrada +
                ", fecha=" + fecha +
                ", numeroFactura=" + numeroFactura +
                ", proveedor=" + proveedor +
                ", totalBienes=" + totalBienes +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
