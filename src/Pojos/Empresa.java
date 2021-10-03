package Pojos;

public class Empresa {
    private String nombre;
    private String direccion;
    private int nuemroEmpleados;

    public Empresa(String nombre, String direccion, int nuemroEmpleados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nuemroEmpleados = nuemroEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNuemroEmpleados() {
        return nuemroEmpleados;
    }

    public void setNuemroEmpleados(int nuemroEmpleados) {
        this.nuemroEmpleados = nuemroEmpleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nuemroEmpleados=" + nuemroEmpleados +
                '}';
    }
}
