
/**
 * Write a description of class PuntuacionPiloto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PuntuacionPiloto
{
    private double tiempo;
    private int puntos;
    private Circuito circuito;
    
    /**
     * Constructor por defecto
     */
    public PuntuacionPiloto(){
        tiempo=0;
        puntos=0;
        circuito = null;
    }
    
    /**
     * Constructor parametrizado
     * 
     * @param tiempo El tiempo del piloto
     * @param puntos Los puntos del piloto
     * @param circuito El circuito de esa puntuacion
     */
    public PuntuacionPiloto(double tiempo, int puntos, Circuito circuito){
        this.tiempo=tiempo;
        this.puntos=puntos;
        this.circuito=circuito;
    }  
    
    /**
     * Modifica el tiempo
     * 
     * @param tiempo
     */
    public void setTiempo(double tiempo){
        this.tiempo=tiempo;
    }
    
    /**
     * Devuelve el tiempo
     * 
     * @return tiempo
     */
    public double getTiempo(){
        return tiempo;
    }
    
    /**
     * Modifica los puntos
     * 
     * @param puntos
     */
    public void setPuntos(int puntos){
        this.puntos=puntos;
    }
    
    /**
     * Devuelve los puntos
     * 
     * @return puntos
     */
    public int getPuntos(){
        return puntos;
    }
    
    /**
     * Modifica el circuito
     * 
     * @param circuito
     */
    public void setCircuito(Circuito circuito){
        this.circuito=circuito;
    }
    
    /**
     * Devuelve el circuito
     * 
     * @return circuito
     */
    public Circuito getCircuito(){
        return circuito;
    }
}
