package Pojos;

import java.util.Date;

public class Venta {
    private Cilente cilente;
    private Impresora impresora;
    private Date fecha;

    public Venta(Cilente cilente, Impresora impresora, Date fecha) {
        this.cilente = cilente;
        this.impresora = impresora;
        this.fecha = fecha;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "cilente=" + cilente +
                ", impresora=" + impresora +
                ", fecha=" + fecha +
                '}';
    }
}
