package Pojos;

public class CPU extends Producto {
    private int memoriaPrincipal;

    public CPU (String codigo, String modelo, int memoriaPrincipal){
        super(codigo, modelo);

        this.memoriaPrincipal= memoriaPrincipal;
    }


    public int getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(int memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }
}
