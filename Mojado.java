

public class Mojado extends CircuitoExtra{
    /**
     * Mojado Constructor
     *
     * @param circuito Un parámetro
     */
    public Mojado(Circuito circuito){
        super(circuito);
    }
    /**
     * Método getComplejidad
     *
     * @return El valor de retorno
     */
    public double getComplejidad(){
        double d = decoratedCircuito.getComplejidad() * 1.15; 
        int r = (int) Math.round(d*100); 
        double f = r/100.0;
        return f;
    }
    /**
     * Método getDistancia
     *
     * @return El valor de retorno
     */
    public double getDistancia(){
        double d = decoratedCircuito.getDistancia() * 0.85; 
        int r = (int) Math.round(d*100); 
        double f = r/100.0;
        return f;
    }
}
