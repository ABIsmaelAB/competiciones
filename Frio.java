

public class Frio extends CircuitoExtra{
    /**
     * Frio Constructor
     *
     * @param circuito Un parámetro
     */
    public Frio(Circuito circuito){
        super(circuito);
    }
    /**
     * Método getComplejidad
     *
     * @return f
     */
    public double getComplejidad(){
        double d = decoratedCircuito.getComplejidad() * 1.1; 
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
        double d = decoratedCircuito.getDistancia() * 0.9; 
        int r = (int) Math.round(d*100); 
        double f = r/100.0;
        return f;
    }
}
