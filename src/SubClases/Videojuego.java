package SubClases;

public class Videojuego extends Producto {
    public int _estilo;
    public String _consola;

    public Videojuego(int tipoProducto, int estilo, String consola, double costoRenta, int dias, int rentado, String nombre) {
        super(tipoProducto, costoRenta, dias, rentado, nombre);
        _estilo = estilo;
        _consola = consola;
    }

    /// _________________
    /// Getters
    /// _________________
    public int get_estilo() {
        return _estilo;
    }

    public String get_consola() {
        return _consola;
    }

    public String PrintInfo() {
        return " /Videojuego: " + super._nombre + " /Estilo: " + _estilo + " /Consola: " + _consola + super.PrintInfo();
    }
}
