package SubClases;

public class Pelicula extends  Producto{
    public  int _tipoProducto, _genero, _anio, _dias, _rentado;
    public double _costoRenta;
    public String _nombre;

    public Pelicula(int tipoProducto, int genero, int anio, double costoRenta,  int dias, int rentado, String nombre){
        super(tipoProducto, costoRenta, dias, rentado, nombre);
        _genero = genero;
        _anio = anio;
    }
    //---------------
    // Getters
    //---------------

    public  int get_tipoProducto(){
        return  _tipoProducto;
    }
    public  int get_genero(){
        return  _genero;
    }

    public  int get_anio(){
        return  _anio;
    }

    public  int get_dias(){
        return _dias;
    }

    public  int get_rentado(){
        return _rentado;
    }
    public String get_nombre(){
        return _nombre;
    }
    public  double get_costoRenta(){
        return  _costoRenta;
    }

    //---------------
    public  String PrintInfo(){
        return " /Tipo Producto: "+ super._tipoProducto + " /Peliculas: " + super._nombre + " /Genero: " + _genero + " /Año de publicación: " + _anio;
    }
}
