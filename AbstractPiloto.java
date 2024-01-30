

import java.util.*;
import java.lang.*;
/**
 * Clase abstracta de Piloto donde se crean todos los metodos que van a utilizar cada uno de sus diferentes tipos de piloto
 * 
 * @author (ianillob) 
 * @version (18/06/2021)
 */
public abstract class AbstractPiloto implements Piloto{
    private String nombre;
    private Coche vehiculo;
    private Concentracion concentracion;
    private double concent;
    private List<PuntuacionPiloto> resultados;
    private boolean descalificado;
    private double destreza;
    
    
    
    /**
     * Constructor por defecto
     *
     */
    protected AbstractPiloto(){
        nombre=null;
        vehiculo = null;
        concentracion=null;
        resultados= new ArrayList<>();
        descalificado=false;
        destreza=0.0;
    }
    //Constructor parametrizado
    
    /**
     * Constructor parametrizado de la clase abstracta de piloto, solo se puede crear los tres tipos de piloto, no puedes crear un piloto sin más
     *
     * @param nombre como el nombre del piloto
     * @param concentracion como la concentracion del piloto
     */
    protected AbstractPiloto(String nombre, Concentracion concentracion) {
        this.nombre=nombre;
        this.vehiculo = null;
        this.concentracion=concentracion;
        this.resultados= new ArrayList<>();
        this.descalificado=false;
        destreza=0.0;
    }
    
    /**
     * Devuelve la destreza del piloto
     *
     * 
     * @return     destreza
     */
    public double getDestreza() {
        return destreza;
    }
    
    /**
     * Introduce la destreza del piloto segun el tipo de piloto que tenga, es llamado en los hijos de la super clase(esta clase) y lo calcula
     *
     * @param  destreza El valor de la destreza del piloto
     */
    public void setDestreza(double destreza) {
        this.destreza=destreza;
    }
    
    /**
     * Devuelve el nombre del piloto
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Introduce el nombre del piloto
     *
     * @param  nombre Como el nombre del piloto
     */
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
    
    /**
     * Introduce el coche que va a utilizar el piloto al principio de la carrera
     *
     * @param  vehiculo Es el coche utilizado por el piloto
     * 
     */
    public void setCochePrincipio(Coche vehiculo) {
        this.vehiculo= vehiculo;
        //if()vehiculo==null
        //se pone las salidas de los coches de cada piloto
    }
    
    /**
     * Le quita el coche al piloto al finalizar la carrera poniendolo a null
     */
    public void setCocheFin(){
        this.vehiculo=null;
    }
    /**
     * Devuelve el coche del piloto
     *
     * @return vehiculo
     */
    public Coche getCoche(){
        return vehiculo;
    }
    
    /**
     * Devuelve la concentracion que tiene el piloto
     *
     * @return concentracion La concentracion en valor
     */
    public double getConcentracion() {
        return concentracion.getValor();
    }
    
    /**
     * Introduce la concentracion del piloto
     *
     * @param  concentracion
     */
    public void setConcentracion(Concentracion concentracion) {
        this.concentracion=concentracion;
    }
    
    /**
     * Pasa el numero dado por parametro a un numero con dos decimales (este metodo es creado ya que con otra forma no se ponía 
     * con dos decimale)
     * 
     * @param numero Es el numero que se pasará a un numero con dos decimales
     * @return f siendo cualquier número pasado por parametro
     */
    public double convertirADosDecimales(double numero){
        int r = (int) Math.round(numero*100); 
        double f = r/100.0;
        return f;
    }
    
    /**
     * Devuelve los resultados del piloto en una carrera en concreto
     *
     * @param  circuito
     * @return puntuacion
     */
    public PuntuacionPiloto getResultados(Circuito circuito) {
        PuntuacionPiloto puntuacion = null;
        for(PuntuacionPiloto pilot : resultados){
            if(pilot.getCircuito().getNombre().equals(circuito.getNombre()))
                puntuacion=pilot;
        }
        return puntuacion;
    }
        
    /**
     * Introduce los resultados del piloto en una carrera en concreto
     *
     * @param circuito El circuito donde ha corrido
     * @param tiempo El tiempo realizado
     * @param puntos Los puntos obtenidos
     */
    public void setResultados(Circuito circuito, double tiempo, int puntos) {
        resultados.add(new PuntuacionPiloto(tiempo,puntos, circuito));
    }
    
    /**
     * Pone una puntuacion en una carrera en concreto
     * 
     * @param circuito El circuito donde ha corrido
     * @param puntos Los puntos que ha obtenido
     */
    public void ponerPuntuacionEnCircuito(Circuito circuito, int puntos){
        int i=0;
        while(i<resultados.size()){
            if(resultados.get(i).getCircuito().getNombre().equals(circuito.getNombre())){
                resultados.get(i).setPuntos(puntos);
            }
            i++;
        }
    }
    
    /**
     * Devuelve true or false si el piloto está descalificado de la competicion
     *
     * @return descalificado
     */
    public boolean getDescalificado() {
        return descalificado;
    }
    
    /**
     * Pone descalificado a un piloto
     *
     * @param  descalificado
     * 
     */
    public void setDescalificado(boolean descalificado) {
        this.descalificado=descalificado;
    }
    
    /**
     * Devuelve los puntos acumulados que tiene un piloto
     *
     * @return     puntosAcumulados
     */
    public int getPuntosAcumulados() {
        int puntos=0;
        for(PuntuacionPiloto pilot : resultados){
            puntos+=pilot.getPuntos();
        }
        return puntos;
    }
    
    /**
     * Devuelve el total de carreras que ha participado
     *
     * @return  numTotalCarreras
     */
    public int getNumTotalCarreras() {
        return resultados.size();
    }
    
    /**
     * Devuelve el numero total de carreras acabadas
     *
     * @return   numTotalAcabadas
     */
    public int getNumTotalAcabadas() {
        int puntos=0;
        for(PuntuacionPiloto pilot : resultados){
            if(pilot.getPuntos()!=0)
                puntos++;
        }
        return puntos;
    }
    
    /**
     * Devuelve el numeros de abandonos totales
     *
     * @return   numTotalAbandonos
     */
    public int getNumTotalAbandonos() {
        int puntos=0;
        for(PuntuacionPiloto pilot : resultados){
            if(pilot.getTiempo()<0)
                puntos++;
        }
        return puntos;
    }
    
    /**
     * Devuelve el ultimo tiempo obtenido por el piloto de todas las carreras realizadas
     * 
     * return tiempo
     */
    public double getUltimoTiempo(){
        return resultados.get(resultados.size()-1).getTiempo();
    }
    
    /**
     * Devuelve el ultimo punto obtenido por el piloto de todas las carreras realizadas
     * 
     * return puntos
     */
    public int getUltimoPunto(){
        return resultados.get(resultados.size()-1).getPuntos();
    }
    
    /**
     * Muestra los resultados de piloto en cada circuito
     *
     */
    public void mostrarPuntuacionCircuito(){
        for(PuntuacionPiloto pilot : resultados){
            System.out.println("Carrera(" + pilot.getCircuito().getNombre() + 
                ") - Puntos: " + pilot.getPuntos() + 
                " - Tiempo: " + pilot.getTiempo() + " minutos");
            
        }
    }
    
    /**
     * Muestra la puntuacion de una carrera en concreto
     * 
     */
    public void mostrarPuntuacionConcreta(int posicion, int limiteAbandonos){
        if(getUltimoTiempo()>= 0.00){
            System.out.println("@@@ Posición(" + posicion + "): " + nombre + " - Tiempo: " 
                + getUltimoTiempo() + " minutos - Puntos: " + getUltimoPunto() + " @@@");
        }
        if(getUltimoTiempo()<0.00){
            System.out.println("¡¡¡ Ha abandonado " + nombre + 
                " - Tiempo: " + getUltimoTiempo() + " - Puntos: 0");
            if(getNumTotalAbandonos()==limiteAbandonos){
                System.out.println("- Además ha sido descalificado para el resto del Campeonato !!!");
            }
        }
    }
    
    /**
     * Como se ve el piloto cuando quieres imprimirlo
     *
     */
    public String toString(){
        return "<piloto: " + getNombre() + "> <tipo: " +
        getClass().getSimpleName() + "> <dest: " +
        getDestreza() + "> <conc: " + concentracion.getNombre() +
        "> <descalificado: " + getDescalificado() + ">";
    }
      
    /**
     * Piloto corriendo en un circuito, realiza la funcion de darle el resultado de tiempo dependiendo de como acabe la carrera, además
     * de que si ha abandonado el limite de veces, pone al piloto como descalificado de la competicion. Para saber que funcion realiza el piloto
     * en el circuito hay varios resultados:
     * 1:Carrera completada
     * 2:Abandona Carrera
     * 3:Abandona competicion
     * 4: Combustible insuficiente
     *
     * @param circuito Siendo el circuito donde se realiza dicha carrera
     * @param limiteAbandonos para saber si tal piloto debe ser o no ser descalificado
     * 
     */
    public void funcionPilotoCircuito(Circuito circuito, int limiteAbandonos) {
        
        //Caso en el que la carrera esté completa
        vehiculo.tiempoCarrera(this, circuito);
        if(concentracion.getValor()>vehiculo.tiempoCarrera() && vehiculo.getCombustibleRestante()>vehiculo.tiempoCarrera()) { 
            vehiculo.setCombustibleRestante(vehiculo.tiempoCarrera());
            setResultados(circuito, vehiculo.tiempoCarrera(), 0);
            System.out.println("+++ " + nombre + " termina la carrera en " +
                vehiculo.tiempoCarrera() + " minutos +++");
            
        }
        else {
            double combustible=vehiculo.getCombustibleRestante();
            if(concentracion.getValor()<vehiculo.tiempoCarrera() && concentracion.getValor()<vehiculo.getCombustibleRestante()) {
                setResultados(circuito,concentracion.getValor()-vehiculo.tiempoCarrera(),0);
                vehiculo.setCombustibleRestante(concentracion.getValor());

                System.out.println("¡¡¡ " + nombre + " perdió la concentración a falta de "
                    + (convertirADosDecimales(vehiculo.tiempoCarrera()-concentracion.getValor())) + 
                    " minutos para terminar !!!");
                System.out.println("¡¡¡ En el momento del despiste llevaba en carrera "
                    + concentracion.getValor() + " minutos !!!");
            }
            
            if(vehiculo.getCombustibleRestante()<vehiculo.tiempoCarrera() && concentracion.getValor()>=combustible) {
                setResultados(circuito,combustible-vehiculo.tiempoCarrera(),0);
                vehiculo.setCombustibleRestante(vehiculo.tiempoCarrera());

                System.out.println("¡¡¡ El " + vehiculo.getNombre() + 
                    " se quedó sin combustible a falta de " + (convertirADosDecimales(vehiculo.tiempoCarrera()-combustible)) +
                    " minutos para terminar !!!");
                System.out.println("¡¡¡ En el momento de quedarse sin combustible llevaba en carrera " +
                    combustible + " minutos !!!");
                
            }
            
        }
        System.out.println("+++ El combustible del " + vehiculo.getNombre() +
            " tras la carrera es " + vehiculo.getCombustibleRestante()
            + " +++");
        System.out.println("@@@");
        if(getNumTotalAbandonos()==limiteAbandonos){
            descalificado=true;
            System.out.println("@@@");
            System.out.println("¡¡¡ " + nombre + " es DESCALIFICADO del campeonato por alcanzar el límite de abandonos(" + 
                limiteAbandonos + ") !!!");
            System.out.println("@@@");
        }
    }
}
