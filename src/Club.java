import SubClases.Generales;
import SubClases.Pelicula;
import SubClases.Producto;
import SubClases.Videojuego;

import java.util.ArrayList;
import java.util.Scanner;

public class Club {
    static ArrayList<Producto> _arrayProducto = new ArrayList<Producto>();

    public static void main(String[] args) {
        String opcion = "";
        Scanner _scanner = new Scanner(System.in);

        Pelicula _pelicula = new Pelicula(1, 1, 2010, 200, 20, 0,"Harry Potter");
        Pelicula _pelicula2 = new Pelicula(1, 1, 2022, 20, 20, 0, "Harry Potter 2");
        Videojuego _videojuego = new Videojuego(2, 1, "XBOX9", 30, 1, 0, "Metal Gear Solid");

        // Agregando a la lista
        _arrayProducto.add(_pelicula);
        _arrayProducto.add(_pelicula2);

        _arrayProducto.add(_videojuego);
        //
        Generales _generales = new Generales();
        _generales.ImprimeEncabezado();

        do {

            opcion = _scanner.next().toLowerCase(); // convierte la entrada a minuscula por lo que no importa el tipo de input.
            switch (opcion) {
                // Leer todos
                case "t":
                    for (Producto producto : _arrayProducto) {
                        System.out.println(producto.PrintInfo() + "");
                    }
                    break;
                    // Devuelve películas
                case "p":
                    for (Producto producto : _arrayProducto) {
                        if (producto.get_tipoProducto() == 1) {
                            System.out.println(producto.PrintInfo() + "");
                        }
                    }
                    break;
                    // Devuelve videojuegos
                case "v":
                    for (Producto producto : _arrayProducto) {
                        if (producto.get_tipoProducto() == 2) {
                            System.out.println(producto.PrintInfo() + "");
                        }
                    }
                    break;
            }
        }
        while (opcion.toLowerCase()== "u");
    }
}

