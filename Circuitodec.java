

public class Circuitodec implements Circuito
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Complejidad compInicial;
    private double complejidad;
    private Distancia distInicial;
    private double distancia;
    

    /**
     * Constructor for objects of class Circuito
     */
    public Circuitodec(){
        // initialise instance variables
        nombre = null;
        complejidad=0.0;
        distancia=0.0;
    }
    
    /**
     * Circuitodec Constructor
     *
     * @param nombre Un parámetro
     * @param complejidad Un parámetro
     * @param distancia Un parámetro
     */
    public Circuitodec(String nombre,Complejidad complejidad, Distancia distancia){
        // initialise instance variables
        this.nombre = nombre;
        this.compInicial=complejidad;
        this.complejidad=complejidad.getValor();
        this.distInicial=distancia;
        this.distancia=distancia.getValor();
    }
    
    /**
     * Circuitodec Constructor
     *
     * @param nombre Un parámetro
     * @param complejidad Un parámetro
     * @param distancia Un parámetro
     */
    public Circuitodec(String nombre,double complejidad, double distancia){
        // initialise instance variables
        this.nombre = nombre;
        this.complejidad=complejidad;
        this.distancia=distancia;
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
     * Método getComplejidad
     *
     * @return complejidad
     */
    public double getComplejidad() {
        return complejidad;
    }
    
    /**
     * Método getDistancia
     *
     * @return distancia
     */
    public double getDistancia() {
        return distancia;
    }   

    /**
     * Método getCompInicial
     *
     * @return compInicial
     */
    public Complejidad getCompInicial() {
        return compInicial;
    }
    
    /**
     * Método getDistInicial
     *
     * @return distInicial
     */
    public Distancia getDistInicial() {
        return distInicial;
    }
    
    /**
     * Método setNombre
     *
     * @param nombre Un parámetro
     */
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    
    /**
     * Método setComplejidad
     *
     * @param complejidad Un parámetro
     */
    public void setComplejidad(double complejidad) {
        this.complejidad=complejidad;
    }
    
    /**
     * Método setDistancia
     *
     * @param distancia Un parámetro
     */
    public void setDistancia(double distancia) {
        this.distancia=distancia;
    }
    
    /**
     * Método getCondiciones
     *
     * @return 
     */
    public String getCondiciones(){
        return " ";
    }
    
    /**
     * Método toString
     *
     * @return El valor de retorno
     */
    public String toString() {
        return "<circuito: " + getNombre() + "> <cond: " + 
         " " +
        "> <comp: " + getCompInicial().toString() + 
        "(actual: " + getComplejidad() +
        ")> <dist: " + getDistInicial().toString() +
        "(actual: " + getDistancia() + ")>";
    }
}
