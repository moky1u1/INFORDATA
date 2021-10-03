package Pojos;

public class Monitor extends Alquiler{
    private String resolucionMaxima;

    public Monitor(String codigo, String modelo,double precioHora, String resolucionMaxima){
        super(codigo, modelo, precioHora);

        this.resolucionMaxima = resolucionMaxima;
    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "PrecioHora=" + PrecioHora +
                ", resolucionMaxima='" + resolucionMaxima + '\'' +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
