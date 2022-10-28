public class Item extends Bienes{
    int cantidad;

    public Item(String nombre, String unidadMedida, int valorUnitario, int valorTotal, String codigoUniversal, int cantidad) {
        super(nombre, unidadMedida, valorUnitario, valorTotal, codigoUniversal);
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Item{" +
                "cantidad=" + cantidad +
                '}';
    }
}
