package Pojos;

import Interfaces.IReseteable;

public class DiscoDuro extends Alquiler implements IReseteable {
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

    @Override
    public String toString() {
        return "DiscoDuro{" +
                "PrecioHora=" + PrecioHora +
                ", capacidadDisco=" + capacidadDisco +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("Formateando Disco Duro...");
    }
}
