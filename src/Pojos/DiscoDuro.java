package Pojos;

public class DiscoDuro extends Alquiler{
    private int capacidadDisco;

    public DiscoDuro(String codigo, String modelo, double precioHora, int capacidadDisco){
        super(codigo, modelo, precioHora);

        this.capacidadDisco = capacidadDisco;
    }

    public int getCapacidadDisco() {
        return capacidadDisco;
    }

    public void setCapacidadDisco(int capacidadDisco) {
        this.capacidadDisco = capacidadDisco;
    }
}
