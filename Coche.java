import java.util.*;
import java.lang.*;
/**
 * Write a description of class Coche here.
 * 
 * @author (ianillob) 
 * @version (18/06/2021)
 */
public class Coche
{
    protected String nombre;
    protected Velocidad velocidad;
    protected Combustible combustible;
    protected double velocidadReal;
    protected double combustibleRestante;
    protected double tiempo;
    
    /**
     * Coche Constructor
     *
     */
    public Coche(){
        this.nombre = null;
        this.velocidad = null;
        this.combustible = null;
        this.velocidadReal = 0.0;
        this.combustibleRestante = 0.0;
        this.tiempo = 0.0;
    }
    /**
     * Coche Constructor
     *
     * @param nombre Un parámetro
     * @param velocidad Un parámetro
     * @param combustible Un parámetro
     */
    public Coche(String nombre, Velocidad velocidad, Combustible combustible) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.combustible = combustible;
        this.velocidadReal = velocidad.getValor();
        this.combustibleRestante = combustible.getValor();
        this.tiempo = 0.0;
    }

    /**
     * Método getNombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre
     *
     * @param nombre Un parámetro
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getVelocidad
     *
     * @return velocidad
     */
    public Velocidad getVelocidad() {
        return velocidad;
    }

    /**
     * Método setVelocidad
     *
     * @param velocidad Un parámetro
     */
    public void setVelocidad(Velocidad velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Método getCombustible
     *
     * @return combustible
     */
    public Combustible getCombustible() {
        return combustible;
    }

    /**
     * Método setCombustible
     *
     * @param combustible Un parámetro
     */
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    
    /**
     * Método getVelocidadReal
     *
     * @return VelocidadReal
     */
    public double getVelocidadReal(){
        return velocidadReal;
    }
    public double convertirADosDecimales(double numero){
        int r = (int) Math.round(numero*100); 
        double f = r/100.0;
        return f;
    }
    /**
     * Método setVelocidadReal
     *
     * @param piloto Un parámetro
     * @param complejidad Un parámetro
     */
    //Mejor si devolvemos directamente la velocidad real
    public double setVelocidadReal(Piloto piloto, Circuito circuito) {
        double d = (getVelocidad().getValor() * piloto.getDestreza())/circuito.getComplejidad(); 
        velocidadReal = convertirADosDecimales(d);
        System.out.println("+++ Con estas condiciones es capaz de correr a "
            + velocidadReal + " km/hora +++");
        return velocidadReal;
    }
    
    /**
     * Método tiempoCarrera
     *
     * @param distancia Un parámetro
     */
    public void tiempoCarrera(Piloto piloto, Circuito circuito) {
        
        double tiemp = (circuito.getDistancia()/ setVelocidadReal(piloto, circuito)) * 60; 
        tiempo = convertirADosDecimales(tiemp);
        
    }
    
    public double tiempoCarrera(){
        return tiempo;
    }
    
    /**
     * Método setCombustibleRestante
     *
     * @param combustible Un parámetro
     */
    public void setCombustibleRestante(double cantidad) {
        combustibleRestante -= cantidad;
    }
    
    /**
     * Método getCombustibleRestante
     *
     * @return combustibleRestante
     */
    public double getCombustibleRestante(){
        return convertirADosDecimales(combustibleRestante);
    }
    
    public double porcentajeCombustible(){
        return ((getCombustibleRestante()/combustible.getValor())*100);
    }
    
    /**
     * Método toString
     *
     * @return El valor de retorno
     */
    public String toString(){
        return "<coche: " + getNombre() + "> <tipo: " +
        getClass().getSimpleName() + "Normal> <vel_teó: " +
        getVelocidad().getValor() + "> <comb: " +
        getCombustible().toString() + "(actual:" +
        getCombustibleRestante() + ")>";
    }
}
    
