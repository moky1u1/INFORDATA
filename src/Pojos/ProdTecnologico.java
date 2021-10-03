package Pojos;

import java.util.Date;

public class ProdTecnologico extends Producto{
    protected String paisOrigen;
    protected Date fechaFabricacion;
    protected Empresa fabricante;

    public ProdTecnologico(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante) {
        super(codigo, modelo);
        this.paisOrigen = paisOrigen;
        this.fechaFabricacion = fechaFabricacion;
        this.fabricante = fabricante;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Empresa getFabricante() {
        return fabricante;
    }

    public void setFabricante(Empresa fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "ProdTecnologico{" +
                "paisOrigen='" + paisOrigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricante=" + fabricante +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
