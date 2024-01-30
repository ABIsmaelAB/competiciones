/**
 * Abstract class CircuitoExtra - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class CircuitoExtra extends Circuitodec
{
    protected Circuito decoratedCircuito;
    
    /**
     * CircuitoExtra Constructor decorator
     *
     * @param circuito Un parámetro
     */
    public CircuitoExtra(Circuito circuito){
        super(circuito.getNombre(),circuito.getComplejidad(),circuito.getDistancia());
        decoratedCircuito=circuito;
    }
    
    /**
     * Método getCompInicial
     *
     * @return El valor de retorno
     */
    public Complejidad getCompInicial() {
        return decoratedCircuito.getCompInicial();
    }
    
    /**
     * Método getDistInicial
     *
     * @return El valor de retorno
     */
    public Distancia getDistInicial() {
        return decoratedCircuito.getDistInicial();
    }
    
    /**
     * Método getCondiciones
     *
     * @return El valor de retorno
     */
    public String getCondiciones(){
        return decoratedCircuito.getCondiciones() + getClass().getSimpleName() + " ";
    }
    
    /**
     * Método toString
     *
     * @return El valor de retorno
     */
    public String toString() {
        return "<circuito: " + getNombre() + "> <cond: " + getCondiciones() + 
        "> <comp: " + getCompInicial().toString() + 
        "(actual: " + getComplejidad() +
        ")> <dist: " + getDistInicial().toString() +
        "(actual: " + getDistancia() + ")>";
    }
}
