package Pojos;

public class Cilente {
    private String Dni;
    private int telefono;
    private String domicilio;

    public Cilente(String dni, int telefono, String domicilio) {
        Dni = dni;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
