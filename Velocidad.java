
/**
 * Enumeration class Velocidad - write a description of the enum class here
 * 
 * @author (ianillob)
 * @version (18/06/2021)
 */
public enum Velocidad
{
    TORTUGA ("TORTUGA",200.0),
    LENTA ("LENTA",210.0),
    NORMAL("NORMAL",220.0),
    RAPIDA("RAPIDA",230.0),
    GUEPARDO("GUEPARDO",240.0);
    
    private final String nombre;
    private final double valor;
    
    Velocidad(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }
    
    public String toString() {
        return getNombre() + "(original:"+getValor()+")";
    }
}
