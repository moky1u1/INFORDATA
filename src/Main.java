import Pojos.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //producto
        Producto producto = new Producto("001","Teclado ASUS");
        System.out.println(producto);

        //alquilable
        Alquiler alquiler = new Alquiler("002", "Disco ASROCK", 10.50);
        System.out.println(alquiler);

        //tecnologico
        Empresa empresa = new Empresa("ABC","Avenida Principal",200);
        ProdTecnologico prodTecnologico = new ProdTecnologico("003","01","China", Calendar.getInstance().getTime(), empresa);
        System.out.println(prodTecnologico);

        //monitor
        Monitor monitor = new Monitor("004","ASUS oled", 10.50, "1081p");
        System.out.println(monitor);

        //Cpu
        Empresa samsung = new Empresa("Samsung","Av Chaco #213", 500);
        CPU cpu = new CPU("006","China","China", Calendar.getInstance().getTime(), samsung,254);
        System.out.println(cpu);
    }
}
