package SubClases;

public class Producto {

    public double _costoRenta;
    public int _dias, _renta, _tipoProducto;
    public  String _consola;
    public  String _nombre;
    public Producto(int tipoProducto, double costoRenta, int dias, int renta, String nombre) {
        _tipoProducto = tipoProducto;
        _costoRenta = costoRenta;
        _dias = dias;
        _renta = renta;
        _nombre = nombre;
    }
    //---------------
    // Getters
    //---------------
    public double get_costoRenta() {
        return _costoRenta;
    }

    public int get_dias(){
        return _dias;
    }

    public int get_renta(){
        return  _renta;
    }
    public int get_tipoProducto(){
        return _tipoProducto;
    }
    public String get_consola(){
        return  _consola;
    }
    public String get_nombre(){
        return _nombre;
    }
    //---------------
    // Setters
    //---------------
    public void set_costoRenta(double costoRenta) {
        this._costoRenta = costoRenta;
    }

    public void set_dias(int dias) {
        this._dias = dias;
    }

    public void set_renta(int renta){
        this._renta = renta;
    }
    public  void set_tipoProducto(int tipoProducto){
        this._tipoProducto = tipoProducto;
    }
    public void set_consola(String consola){
        this._consola =  consola;
    }
    public void set_nombre(String nombre){
        this._nombre = nombre;
    }

    //_______________________________

    public String PrintInfo(){
        return  " /costo de renta = " + _renta + " /dias de renta: " + _dias + " /rentado: " + _renta ;
    }
}
