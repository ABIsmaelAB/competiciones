
/**
 * Enumeration class Combustible - write a description of the enum class here
 * 
 * @author (ianillob)
 * @version (18/06/2021)
 */
public enum Combustible
{
    ESCASO("ESCASO",350.0), 
    NORMAL("NORMAL",440.0), 
    GENEROSO("GENEROSO",460.0), 
    ELEFANTE("ELEFANTE",480.0);
        
    private final String nombre;
    private final double valor;
    
    Combustible(String nombre, double valor) {
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
