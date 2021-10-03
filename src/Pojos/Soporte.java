package Pojos;

public class Soporte {
    private Empresa empresa;
    private ProdTecnologico producto;
    private double precio;

    public Soporte(Empresa empresa, ProdTecnologico producto, double precio) {
        this.empresa = empresa;
        this.producto = producto;
        this.precio = precio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ProdTecnologico getProducto() {
        return producto;
    }

    public void setProducto(ProdTecnologico producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
