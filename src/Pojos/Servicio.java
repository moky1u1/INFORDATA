package Pojos;

public class Servicio {
    private Cilente cilente;
    private Impresora impresora;
    private String detalle;
    private double totalFacturado;

    public Servicio(Cilente cilente, Impresora impresora, String detalle, double totalFacturado) {
        this.cilente = cilente;
        this.impresora = impresora;
        this.detalle = detalle;
        this.totalFacturado = totalFacturado;
    }

    public Cilente getCilente() {
        return cilente;
    }

    public void setCilente(Cilente cilente) {
        this.cilente = cilente;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getTotalFacturado() {
        return totalFacturado;
    }

    public void setTotalFacturado(double totalFacturado) {
        this.totalFacturado = totalFacturado;
    }
}
