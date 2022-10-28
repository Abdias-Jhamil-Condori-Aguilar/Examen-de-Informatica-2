public class Inventario {
    Bien bien;

    public Inventario(Bien bien) {
        this.bien = bien;
    }

    public Bien getBien() {
        return bien;
    }

    public void setBien(Bien bien) {
        this.bien = bien;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "bien=" + bien +
                '}';
    }
}
