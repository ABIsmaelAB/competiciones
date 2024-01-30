
/**
 * Write a description of class Nocturno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nocturno extends CircuitoExtra{
    /**
     * Nocturno Constructor
     *
     * @param circuito Un parámetro
     */
    public Nocturno(Circuito circuito){
        super(circuito);
    }
    /**
     * Método getComplejidad
     *
     * @return f
     */
    public double getComplejidad(){
        double d = decoratedCircuito.getComplejidad() * 1.2; 
        int r = (int) Math.round(d*100); 
        double f = r/100.0;
        return f;
    }
    /**
     * Método getDistancia
     *
     * @return f
     */
    public double getDistancia(){
        double d = decoratedCircuito.getDistancia() * 0.8; 
        int r = (int) Math.round(d*100); 
        double f = r/100.0;
        return f;
    }
}
