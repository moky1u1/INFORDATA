import Pojos.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        /* //producto
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



        //polimorfismo
        Producto producto = new Producto("1234","Logitech 01");

        Producto producto1234 = new Impresora("12345","Canon 2020", 100);
        //System.out.println(producto1234);

        Producto monitor1 = new Monitor("4321", "MonitorOled",7.50,"4 k");
        //System.out.println( monitor1);

        Producto disco1 = new DiscoDuro("0123","Disco Aorus1",15.50,2);
        //System.out.println( disco1);

        Impresora impresora = (Impresora) producto1234;
        //System.out.println(impresora);
        Monitor monitor =(Monitor) monitor1;
        //System.out.println(monitor);
        DiscoDuro discoDuro =(DiscoDuro) disco1;
        //System.out.println(disco1);


        Producto[] productos = new Producto[3];
        productos[0] = impresora;
        productos[1] = monitor;
        productos [2] = discoDuro;

        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i]);
            
        }
         */

        Monitor Asus4k = new Monitor("A123","Monitor Asus 4k",5.5,"4K");
        Asus4k.reset();

        Empresa DELL = new Empresa("DELL", "AV America #463",1400);
        CPU compu1 = new CPU("B456","DELL Rgb","USA", Calendar.getInstance().getTime(),DELL,2000 );
        compu1.reset();

        Impresora Aoc1 = new Impresora("C789","Impresora AOC full color",80);
        Aoc1.reset();

        DiscoDuro Disco1 = new DiscoDuro("A4321", "Disco Seagate Barracuda 8Tb",8.5,8);
        Disco1.reset();

        Empresa WesternDigital = new Empresa("Western Digital","Calle Bolivar #321",845);
        DiscoSolido Disco2 = new DiscoSolido("B987","SSD Western Digital Black 16Tb","China", Calendar.getInstance().getTime(),WesternDigital,16 );
        Disco2.reset();
    }
}
