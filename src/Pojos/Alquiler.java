package Pojos;

public abstract class Alquiler extends Producto{
    protected double PrecioHora;

    public Alquiler(String codigo, String modelo, double PrecioHora){
        super(codigo, modelo);

        this.PrecioHora = PrecioHora;
    }

    public double getPrecioHora() {
        return PrecioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.PrecioHora = precioHora;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "PrecioHora=" + PrecioHora +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
