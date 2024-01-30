import java.util.*;
/**
 * Write a description of class Organizacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Organizacion
{
    private static Organizacion instance;
    
    private int limiteAbandonos;
    private int limitePilotos;
    private TreeSet<Circuito> circuitos;
    private List<Escuderia> escuderias;
    private List<Piloto> pilotosCarrera;
    private Map<String, String> mapaPilotos;
    
    //Singleton
    /**
     * Organizacion Constructor, hay que destacar que es un patron de diseño llamado singleton, que solo permite crear una unica instancia
     *
     * @param limiteAbandonos Un parámetro
     * @param limitePilotos Un parámetro
     */
    private Organizacion(int limiteAbandonos, int limitePilotos, Comparator comparadorCircuito){
        this.limiteAbandonos=limiteAbandonos;
        this.limitePilotos=limitePilotos;
        circuitos = new TreeSet<>(comparadorCircuito);
        escuderias = new LinkedList<>();
        pilotosCarrera = new LinkedList<>();
        mapaPilotos = new HashMap<>();
    }
    
    /**
     * Método getInstance parte del singleton
     *
     * @param limiteAbandonos Un parámetro
     * @param limitePilotos Un parámetro
     * @return El valor de retorno
     */
    public synchronized static Organizacion getInstance(int limiteAbandonos, int limitePilotos, Comparator comparadorCircuito){
        if(instance == null){
            instance = new Organizacion(limiteAbandonos,limitePilotos, comparadorCircuito);
        }
        return instance;
    }
    
    /**
     * La inscripcion de escuderia
     *
     * @param e Un parámetro
     */
    public void inscripcionEscuderia(Escuderia e){
        escuderias.add(e);
    }
    
    /**
     * Inserta en el mapa los nombres de los pilotos con el nombre de sus escuderias para saber que piloto corresponde a cada escuderia
     * 
     */
    public void insertarPilotosEnMapaPilotos(){
        List<Piloto> listaAux = new LinkedList<>();
        for(int i=0; i<escuderias.size(); i++){
            listaAux=escuderias.get(i).getListaPiloto();
            for(int j=0; j<listaAux.size(); j++){
                mapaPilotos.put(listaAux.get(j).getNombre(), escuderias.get(i).getNombre());
            }
        }
    }
    
    /**
     * Añadir piloto a la lista pilotosCarrera
     *
     * @param piloto Un parámetro
     */
    public void setPilotosCarrera(Piloto piloto){
        pilotosCarrera.add(piloto);
    }
    
    /**
     * Obtener piloto de la lista de una determinada posicion
     *
     * @param index Un parámetro
     * @return piloto
     */
    public Piloto getPilotoCarrera(int index){
        return pilotosCarrera.get(index);
    }
    
    /**
     * Muestra los pilotos de la lista
     *
     */
    public void mostrarPilotosCarrera(){
        for(Piloto piloto: pilotosCarrera){
            System.out.println(piloto);
        }
    }
    
    /**
     * Devuelve escuderia de una determinada posicion de la lista escuderias
     *
     * @param index Un parámetro
     * @return escuderia
     */
    public Escuderia getEscuderia(int index){
        return escuderias.get(index);
    }
    
    /**
     * Devuelve la lista de escuderias
     *
     * @return escuderias
     */
    public List<Escuderia> getListaEscuderia(){
        return escuderias;
    }
    
    /**
     * Insertar circuitos al treeset de circuito
     *
     * @param circuito Un parámetro
     */
    public void insertarCircuitos(Circuito circuito){
        circuitos.add(circuito);
    }
    
    /**
     * Mostrar los circuitos de la organizacion
     *
     */
    public void mostrarCircuitos(){
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||||||||||||||||| CIRCUITOS DEL CAMPEONATO |||||||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        for(Circuito circuito: circuitos){
            System.out.println(circuito);
        }
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println();
    }
    
    
    /**
     * Mostrar las escuderias que van a competir
     *
     */
    public void mostrarEscuderias(){
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("%%%%%%%% ESCUDERÍAS DEL CAMPEONATO %%%%%%%%");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for(Escuderia escuderia: escuderias){
            escuderia.mostrarEscuderia();
        }
        System.out.println();
    }
    
    
    /**
     * Comprueba que si están todos los pilotos descalificados
     *
     * @return existe
     */
    public boolean piltosDescalificados(){
        boolean existe=false;
        int cont=0;
        
        for(Escuderia e: escuderias){
            if(e.listaPilotosDescalificados())
                cont++;
        }
        if(cont==escuderias.size())
            existe=true;
        return existe;
    }
    
    /**
     * Comprueba si hay algun piloto descalificado
     * 
     */
    public boolean algunPilotoDescalificado(){
        boolean existe=false;
        int cont=0;
        
        for(Escuderia e: escuderias){
            cont+=e.cuantosPilotosDescalificados();
        }
        if(cont>0)
            existe=true;
        return existe;
    }
    
    /**
     * Comprueba si hay algun piloto sin descalificar
     * 
     */
    public boolean algunPilotoSinDescalificar(){
        boolean existe=false;
        int cont=0;
        
        for(Escuderia e: escuderias){
            cont+=e.cuantosPilotosSinDescalificar();
        }
        if(cont>0)
            existe=true;
        return existe;
    }
    
    /**
     * Comprueba si hay alguna escuderia descalificada
     */
    public boolean algunaEscuderiaDescalificada(){
        boolean existe=false;
        for(Escuderia e: escuderias){
            if(e.todosDescalificados())
                existe=true;
        }
        return existe;
    }
    
    /**
     * Comprueba si solo queda un piloto para competir
     *
     * @return existe
     */
    public boolean soloUnPiloto(){
        boolean existe=false;
        int cont=0;
        int todosLosPilotos=0;
        for(Escuderia e: escuderias){
            todosLosPilotos+=e.numPilotosEscuderia();
            cont+=e.cuantosPilotosDescalificados();
        }
        todosLosPilotos--;
        if(todosLosPilotos==cont)
            existe=true;
        return existe;
    }
    
    /**
     * Se finaliza la competicion cuando se da los dos metodos anteriores
     *
     * @return true or false
     */
    public boolean CondicionFinalizacion(){
        return (piltosDescalificados() || soloUnPiloto());
    }
    
    /**
     * Muestra la puntuacion final si hay ganadores
     *
     */
    public void mostrarPuntuacionFinal(){
        int index=1;
        System.out.println("****************************************************");
        System.out.println("********** CLASIFICACIÓN FINAL DE PILOTOS **********");
        System.out.println("****************************************************");
        for(Piloto piloto: pilotosCarrera){
            if(!piloto.getDescalificado()){
                System.out.println("@@@ Posición(" + index + "): " + piloto.getNombre() + " - Puntos Totales: " + piloto.getPuntosAcumulados() + " @@@");
                piloto.mostrarPuntuacionCircuito();
                System.out.println();
                index++;
            }
        }
    }
    
    /**
     * Muestra todas las puntuaciones de los pilotos descalificados
     *
     */
    public void mostrarPuntuacionPilotosDescalificados(){
        System.out.println("****************************************************");
        System.out.println("************** PILOTOS DESCALIFICADOS **************");
        System.out.println("****************************************************");
        for(Piloto piloto: pilotosCarrera){
            if(piloto.getDescalificado()){
                System.out.println("--- Piloto Descalificado: " + piloto.getNombre() + " - Puntos Totales Anulados: " + piloto.getPuntosAcumulados() + " ---");
                piloto.mostrarPuntuacionCircuito();
                System.out.println();
            }
        }
        System.out.println();
    }
    
    /**
     * Muestra las escuderias descalificadas por no tener ningun piloto sin descalificar
     *
     */
    public void mostrarEscuderiasDescalificadas(){
        System.out.println("****************************************************");
        System.out.println("************ ESCUDERIAS DESCALIFICADAS *************");
        System.out.println("****************************************************");
        for(Escuderia e: escuderias){
            if(e.listaPilotosDescalificados()){
                System.out.println("¡¡¡ Escudería Descalificada: " + e.getNombre() + " con 0.0 puntos !!!");
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                System.out.println("%%% " + e.getNombre() + " %%%");
                e.mostrarListaPiloto();
                e.mostrarListaCoche();
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            }
        }
    }
    
    /**
     * Muestra la clasificacion de las escuderias sin descalificar
     * 
     */
    public void mostrarEscuderiasSinDescalificar(){
        System.out.println("****************************************************");
        System.out.println("******** CLASIFICACIÓN FINAL DE ESCUDERÍAS *********");
        System.out.println("****************************************************");
        int posicion=1;
        for(Escuderia e: escuderias){
            if(!e.todosDescalificados()){
                System.out.println("@@@ Posición(" + posicion + ") " + e.getNombre() + 
                    " con " + e.puntosEscuderia() + " puntos @@@");
                e.mostrarEscuderia();
                posicion++;
            }
        }
    }
    
    /**
     * Clasificacion de los pilotos por carrera
     *
     * @param circuito Un parámetro
     */
    
    public void clasificacionFinalPorCarrera(Circuito circuito){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+++++++++++++++++ Clasificación final de la carrera en " + circuito.getNombre() + " ++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int posicion=1;
        int posicionesConPuntos=4;
        int puntos=10;
        Collections.sort(pilotosCarrera, new ComparadorTiempo());
        for(int i=0; i<pilotosCarrera.size(); i++){
            if(pilotosCarrera.get(i).getUltimoTiempo()>0.00){
                pilotosCarrera.get(i).ponerPuntuacionEnCircuito(circuito, puntos);
                if(posicion<=posicionesConPuntos)
                    puntos-=2;
                posicion++;
            }
        }
    }
    
    /**
     * Muestra la clasificacion de cada carrera
     * 
     */
    public void mostrarClasificacionFinalPorCarrera(){
        int posicion=1;
        for(Piloto pilot : pilotosCarrera){
            pilot.mostrarPuntuacionConcreta(posicion, limiteAbandonos);
            if(pilot.getUltimoTiempo()>0.00)
                posicion++;
        }
    }
    
    /**
     * La gestion de la carrera
     *
     * @param c Circuito de la carrera en la competicion
     * @param indexCarrera La posicion de cada carrera dentro de la competicion
     */
    public void gestionDeCarreras(Circuito c,int indexCarrera){
        
        
        List<Piloto> listaPilotoAux = new LinkedList<>();
        
        System.out.println("********************************************************************************************************");
        System.out.println("*** CARRERA<" + indexCarrera + "> EN " + c + " ***");
        System.out.println("********************************************************************************************************");
        for(int i=0; i<escuderias.size(); i++){
            listaPilotoAux=escuderias.get(i).repartirCochesEscuderia(limitePilotos);
            for(int j=0; j<listaPilotoAux.size(); j++){
                setPilotosCarrera(listaPilotoAux.get(j));
            }
        }
        if(pilotosCarrera.size()>1){
            int indexPosicion=1;
            System.out.println("********************************************************************************************************");
            System.out.println("******************************** Pilotos que van a competir en " + c.getNombre() + " *******************************");
            System.out.println("********************************************************************************************************");
            Collections.sort(pilotosCarrera, new ComparadorPuntosCarrerasTerminadasPiloto());
            mostrarPilotosCarrera();
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("+++++++++++++++++++++++++ Comienza la carrera en " + c.getNombre() + " ++++++++++++++++++++++++++");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            for(int j=0; j<pilotosCarrera.size(); j++){
                System.out.println("@@@ Piloto " + indexPosicion + " de " + pilotosCarrera.size());
                System.out.println(pilotosCarrera.get(j) + " con");
                System.out.println(pilotosCarrera.get(j).getCoche());
                pilotosCarrera.get(j).funcionPilotoCircuito(c, limiteAbandonos);
                indexPosicion++;
            }
            
        }
    }
    
    /**
     * Devuelve los pilotos a sus respectivas escuderias
     * 
     */
    public void devolverPilotosAEscuderia(){
        int index=0;
        while(pilotosCarrera.size()!=0){
            if(escuderias.get(index).getNombre().equals(mapaPilotos.get(pilotosCarrera.get(0).getNombre()))){
                escuderias.get(index).devolverPilotoYCoche(pilotosCarrera.get(0));
                pilotosCarrera.remove(0);
                index=0;
            }
            else
                index++;
        }
    }
    public void mostrarEscuderiasConCochesCombustiblePorcentaje(){
        System.out.println("*************COCHES CON MÁS PORCENTAJE COMBUSTIBLE RESTANTE DE CADA ESCUDERÍA*************");
        for(Escuderia escuderia: escuderias){
            System.out.println("%%%" + escuderia.getNombre() + "%%%");
            escuderia.mostrarCocheMasPorcentaje();
        }
    }
    /**
     * RALLY el juego, aqui se realiza lo que debe hacer la organizacion para ejecutar su competicion en todas las carreras, y al finalizar dichas
     * carreras se realizara las clasificaciones dependiendo de sus resultados finales
     *
     */
    public void rallyFinal(){
        mostrarCircuitos();
        mostrarEscuderias();
        int index=1;
        boolean existe=false;
        insertarPilotosEnMapaPilotos();
        for(Circuito c: circuitos){
            if(!CondicionFinalizacion()){
                gestionDeCarreras(c,index);
                clasificacionFinalPorCarrera(c);
                mostrarClasificacionFinalPorCarrera();
                devolverPilotosAEscuderia();
                index++;
            }
            else
                existe=true;
            
        }
        
        
        List<Piloto> listaPilotAux = new LinkedList<Piloto>();
        pilotosCarrera=listaPilotAux;
        for(int i=0; i<escuderias.size(); i++){
            listaPilotAux=escuderias.get(i).devolverTodosLosPilotos();
            for(int j=0; j<listaPilotAux.size(); j++){
                pilotosCarrera.add(listaPilotAux.get(j));
            }
        }
            
        if(soloUnPiloto() || piltosDescalificados()){
            System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
            System.out.println("¡¡¡ No se celebra esta carrera ni la(s) siguiente(s) por no haber pilotos para competir !!!!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        System.out.println("****************************************************");
        System.out.println("**************** FIN DEL CAMPEONATO ****************");
        System.out.println("****************************************************");
        
        if(!piltosDescalificados()){
            Collections.sort(pilotosCarrera, Collections.reverseOrder(new ComparadorPuntosCarrerasTerminadasPiloto()));
            mostrarPuntuacionFinal();
        }
        if(algunPilotoDescalificado()){
            if(piltosDescalificados()){
                System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
                System.out.println("¡¡¡ Campeonato de pilotos queda desierto por haber sido descalificados todos los pilotos !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            Collections.sort(pilotosCarrera, Collections.reverseOrder(new ComparadorPuntosCarrerasTerminadasPiloto()));
            mostrarPuntuacionPilotosDescalificados();
        }
        if(algunPilotoSinDescalificar()){
            Collections.sort(escuderias, Collections.reverseOrder(new ComparadorPuntosYCarrerasTotales()));
            mostrarEscuderiasSinDescalificar();
        }
        if(algunaEscuderiaDescalificada()){
            if(piltosDescalificados()){
                System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
                System.out.println("¡¡¡ Campeonato de escuderías queda desierto por haber sido descalificados todos los pilotos !!!");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            Collections.sort(escuderias, Collections.reverseOrder(new ComparadorPuntosYCarrerasTotales()));
            mostrarEscuderiasDescalificadas();
        }
        mostrarEscuderiasConCochesCombustiblePorcentaje();
    }
}
