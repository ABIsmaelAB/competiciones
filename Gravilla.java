

public class Gravilla extends CircuitoExtra{
    /**
     * Gravilla Constructor
     *
     * @param circuito Un parámetro
     */
    public Gravilla(Circuito circuito){
        super(circuito);
    }
    /**
     * Método getComplejidad
     *
     * @return f
     */
    public double getComplejidad(){
        double d = decoratedCircuito.getComplejidad() * 1.05; 
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
        double d = decoratedCircuito.getDistancia() * 0.95; 
        int r = (int) Math.round(d*100); 
        double f = r/100.0;
        return f;
    }
}
