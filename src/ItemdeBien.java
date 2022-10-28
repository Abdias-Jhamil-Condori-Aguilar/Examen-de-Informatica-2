public class ItemdeBien extends Bienes{
    int cantidadSolicitudes;
    int cantidadDespachado;

    public ItemdeBien(String nombre, String unidadMedida, int valorUnitario, int valorTotal, String codigoUniversal, int cantidadSolicitudes, int cantidadDespachado) {
        super(nombre, unidadMedida, valorUnitario, valorTotal, codigoUniversal);
        this.cantidadSolicitudes = cantidadSolicitudes;
        this.cantidadDespachado = cantidadDespachado;
    }

    public int getCantidadSolicitudes() {
        return cantidadSolicitudes;
    }

    public void setCantidadSolicitudes(int cantidadSolicitudes) {
        this.cantidadSolicitudes = cantidadSolicitudes;
    }

    public int getCantidadDespachado() {
        return cantidadDespachado;
    }

    public void setCantidadDespachado(int cantidadDespachado) {
        this.cantidadDespachado = cantidadDespachado;
    }

    @Override
    public String toString() {
        return "ItemdeBien{" +
                "cantidadSolicitudes=" + cantidadSolicitudes +
                ", cantidadDespachado=" + cantidadDespachado +
                '}';
    }
}
