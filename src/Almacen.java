public class Almacen {
    Factura factura;
    SalidasAlmacen salidasAlmacen;

    public Almacen(Factura factura, SalidasAlmacen salidasAlmacen) {
        this.factura = factura;
        this.salidasAlmacen = salidasAlmacen;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public SalidasAlmacen getSalidasAlmacen() {
        return salidasAlmacen;
    }

    public void setSalidasAlmacen(SalidasAlmacen salidasAlmacen) {
        this.salidasAlmacen = salidasAlmacen;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "factura=" + factura +
                ", salidasAlmacen=" + salidasAlmacen +
                '}';
    }
}
