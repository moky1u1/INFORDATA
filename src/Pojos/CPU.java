package Pojos;

import Interfaces.IReseteable;

import java.util.Date;

public class CPU extends ProdTecnologico implements IReseteable {
    private int memoriaPrincipal;

    public CPU(String codigo, String modelo, String paisOrigen, Date fechaFabricacion, Empresa fabricante, int memoriaPrincipal) {
        super(codigo, modelo, paisOrigen, fechaFabricacion, fabricante);
        this.memoriaPrincipal = memoriaPrincipal;
    }

    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "memoriaPrincipal=" + memoriaPrincipal +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", fabricante=" + fabricante +
                ", codigo='" + codigo + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public void reset() {
        System.out.println("Restableciendo CPU a valores de fabrica...");
    }
}
