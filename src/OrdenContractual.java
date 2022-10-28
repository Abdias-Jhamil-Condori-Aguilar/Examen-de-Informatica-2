import java.util.Date;

public class OrdenContractual {
    int numeroContractual;
    int nit;
    Proveedor proveedor;
    Date fechaOrden;
    Date fechaEntrega;

    public OrdenContractual(int numeroContractual, int nit, Proveedor proveedor, Date fechaOrden, Date fechaEntrega) {
        this.numeroContractual = numeroContractual;
        this.nit = nit;
        this.proveedor = proveedor;
        this.fechaOrden = fechaOrden;
        this.fechaEntrega = fechaEntrega;
    }

    public int getNumeroContractual() {
        return numeroContractual;
    }

    public void setNumeroContractual(int numeroContractual) {
        this.numeroContractual = numeroContractual;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "OrdenContractual{" +
                "numeroContractual=" + numeroContractual +
                ", nit=" + nit +
                ", proveedor=" + proveedor +
                ", fechaOrden=" + fechaOrden +
                ", fechaEntrega=" + fechaEntrega +
                '}';
    }
}
