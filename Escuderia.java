
import java.util.*;
public class Escuderia
{
    private String nombre;
    private List<Piloto> listaPilotos;
    private List<Coche> listaCoches;
    private Comparator comparadorPiloto;
    private Comparator comparadorCoche;
    
    /**
     * Constructor por defecto
     */
    public Escuderia(){
        nombre=null;
        listaPilotos = new LinkedList<>();
        listaCoches = new LinkedList<>();
    }
    
    /**
     * Constructor parametrizado
     * 
     * @param nombre El nombre de la escuderia
     * @param comparadorPiloto El comparador que va a utilizar para la lista de pilotos
     * @param comparadorCoche El comparador que va a utilizar para la lista de coches
     */
    public Escuderia(String nombre, Comparator comparadorPiloto, Comparator comparadorCoche){
        this.nombre = nombre;
        listaPilotos = new LinkedList<>();
        listaCoches = new LinkedList<>();
        this.comparadorPiloto = comparadorPiloto;
        this.comparadorCoche = comparadorCoche;
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
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    /**
     * Devuelve piloto de una posicion determinada
     *
     * @param index 
     * @return piloto
     */
    public Piloto getPiloto(int index){
        return listaPilotos.get(index);
    }

    /**
     * Devuelve la lista de piloto
     *
     * @return listaPilotos
     */
    public List<Piloto> getListaPiloto(){
        return listaPilotos;
    }

    /**
     * Añade un piloto a la lista de pilotos
     *
     * @param piloto 
     */
    public void setListaPiloto(Piloto piloto){
        listaPilotos.add(piloto);
    }
    
    /**
     * Muestra la escudería con sus coches y pilotos
     *
     */
    public void mostrarEscuderia()
    {
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("%%%" + nombre + "%%%");
        mostrarListaPiloto();
        mostrarListaCoche();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    /**
     * Muestra los pilotos de la lista de pilotos
     *
     */
    public void mostrarListaPiloto(){
        Iterator<Piloto> it = listaPilotos.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        /*
        for(Piloto piloto: listaPilotos){
        System.out.println(piloto);
        }
         */
    }

    /**
     * Devuelve un coche de la lista de coches
     *
     * @param index 
     * @return coche
     */
    public Coche getListaCoche(int index){
        return listaCoches.get(index);
    }

    /**
     * Introduce un coche en la lista de coches
     *
     * @param coche 
     */
    public void setListaCoche(Coche coche){
        listaCoches.add(coche);
    }

    /**
     * Muestra la lista de coches
     *
     */
    public void mostrarListaCoche(){
        Iterator<Coche> it = listaCoches.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    /**
     * Muestra los pilotos con coche
     *
     */
    public void mostrarPilotosConCoche(){
        for(Piloto piloto: listaPilotos){
            if(piloto.getCoche()!=null)
                System.out.println(piloto);
        }
    }
    
    /**
     * Cambia el comparador de la lista de coches
     * 
     * @param comparadorCoche
     */
    public void cambiarComparadorListaCoches(Comparator comparadorCoche){
        this.comparadorCoche = comparadorCoche;
    }
    
    /**
     * Ordena la lista de coches segun el orden dicho por el comparadorCoche
     *
     */
    public void ordenarListaCoches(){
        Collections.sort(listaCoches, comparadorCoche);
    }
    
    /**
     * Cambia el comparador de la lista de pilotos
     * 
     * @param comparadorPilotos
     */
    public void cambiarComparadorListaPilotos(Comparator comparadorPiloto){
        this.comparadorPiloto = comparadorPiloto;
    }
    
    /**
     * Ordena la lista de pilotos segun el orden dicho por comparadorPilotos
     *
     */
    public void ordenarListaPilotos(){
        Collections.sort(listaPilotos, comparadorPiloto);
    }

    /**
     * Devuelve los puntos totales de los pilotos de cada escudería que no esten descalificados
     *
     * @return puntosTotal
     */
    public int puntosEscuderia(){
        int puntosTotal=0;
        for(Piloto piloto: listaPilotos){
            if(!piloto.getDescalificado())
                puntosTotal+= piloto.getPuntosAcumulados();
        }
        return puntosTotal;
    }

    /**
     * Devuelve el numero total de carreras realizadas por todos los pilotos de cada escuderia
     *
     * @return carrerasTotal
     */
    public int carrerasTerminadas(){
        int carrerasTotal=0;
        for(Piloto piloto: listaPilotos){
            carrerasTotal+=piloto.getNumTotalCarreras();
        }
        return carrerasTotal;
    }

    /**
     * Da los coches de la lista de coches a los pilotos de la listade pilotos en orden, es decir, el primero va para el primero, siempre que el piloto
     * no esté descalificado y que el coche tenga combustible.
     *
     * @param limitePilotos El limite de pilotos que debe pasar cada escuderia
     * @return lista
     */
    public List<Piloto> repartirCochesEscuderia(int limitePilotos){
        int indexCoche=0;
        int indexMax=0;
        int indexPiloto=0;
        ordenarListaPilotos();
        ordenarListaCoches();
        
        List<Piloto> lista = new LinkedList<>();
        
        while(indexPiloto<listaPilotos.size() && indexMax<limitePilotos && indexCoche<listaCoches.size()){
            if(!getPiloto(indexPiloto).getDescalificado() && getListaCoche(indexCoche).getCombustibleRestante()>0.0 && getPiloto(indexPiloto).getCoche()==null){
                getPiloto(indexPiloto).setCochePrincipio(getListaCoche(indexCoche));
                lista.add(getPiloto(indexPiloto));
                listaCoches.remove(indexCoche);
                listaPilotos.remove(indexPiloto);
                indexMax++;
            }
            if(listaPilotos.size()>indexPiloto){
                if(getPiloto(indexPiloto).getDescalificado())
                    indexPiloto++;
            }
            if(listaCoches.size()!=0 && indexCoche<listaCoches.size()){
                if(getListaCoche(indexCoche).getCombustibleRestante()<=0.0)
                    indexCoche++;
            }
            
        }
        indexPiloto=0;
        boolean existe=false;
        while(listaPilotos.size()>indexPiloto && indexMax<limitePilotos){
            if(getPiloto(indexPiloto).getCoche()==null && !getPiloto(indexPiloto).getDescalificado()){
                existe=true;
                System.out.println("¡¡¡ " + getPiloto(indexPiloto).getNombre() + " NO ES ENVIADO A LA CARRERA porque su escudería(" +
                    getNombre() + ") no tiene más coches con combustible disponibles !!!");
                indexMax++;
            }
            indexPiloto++;
        }
        if(existe==false)
            System.out.println("********************************************************************************************************");
        return lista;
    }

    /**
     * Devuelve en una lista todos los pilotos de la lista de pilotos
     *
     * @return lista
     */
    public List<Piloto> devolverTodosLosPilotos(){
        return listaPilotos;
    }

    /**
     * Devuelve los pilotos y los coches a las listas de escudería
     *
     * @param piloto Es el piloto a devolver, con su coche
     * 
     */
    public void devolverPilotoYCoche(Piloto piloto){
        setListaCoche(piloto.getCoche());
        piloto.setCocheFin();
        setListaPiloto(piloto);
    }
    
    /**
     * Devuelve true o false si en la lista de pilotos solo hay descalificados
     *
     * @return existe
     */
    public boolean listaPilotosDescalificados(){
        boolean existe=false;
        int index=0;
        for(Piloto piloto: listaPilotos){
            if(listaPilotos.get(index).getDescalificado())
                index++;
        }
        if(index==listaPilotos.size())
            existe=true;
        
        return existe;
    }

    /**
     * Devuelve el número de pilotos que hay en una escuderia
     *
     * @return Numero de pilotos en escuderia
     */
    public int numPilotosEscuderia(){
        return listaPilotos.size();
    }

    /**
     * Devuelve cuantos pilotos descalificados hay en la lista
     *
     * @return cont
     */
    public int cuantosPilotosDescalificados(){
        int cont=0;
        for(Piloto piloto: listaPilotos){
            if(piloto.getDescalificado())
                cont++;
        }
        return cont;
    }
    
    /**
     * Devuelve el numero de pilotos que no estan descalificado en una escuderia
     * 
     * @return cont
     */
    public int cuantosPilotosSinDescalificar(){
        int cont=0;
        for(Piloto piloto: listaPilotos){
            if(!piloto.getDescalificado())
                cont++;
        }
        return cont;
    }
    
    /**
     * Devuelve true o false si todos los pilotos de la escuderia estan descalificados
     * 
     * @return existe
     */
    public boolean todosDescalificados(){
        boolean existe=false;
        if(cuantosPilotosDescalificados()==listaPilotos.size())
            existe=true;
        return existe;
    }
    
    /**
     * Devuelve escrito los pilotos descalificados con sus respectiva puntuacion
     *
     */
    public void mostrarPuntuaciosDescalificados(){
        for(Piloto piloto: listaPilotos){
            if(piloto.getDescalificado()){
                System.out.println("--- Piloto Descalificado: " + piloto.getNombre() + " - Puntos Totales Anulados: " + piloto.getPuntosAcumulados() + " ---");
                piloto.mostrarPuntuacionCircuito();
                System.out.println();
            }
        }
    }
    
    public void mostrarCocheMasPorcentaje(){
        Coche c = null;
        for(Coche coche: listaCoches){
            if(c==null)
                c=coche;
            else{
                if(coche.porcentajeCombustible()>c.porcentajeCombustible()){
                    c = coche;
                }
            }
        }
        System.out.println(c + "<(porcentaje combustible restante: " + c.porcentajeCombustible() + "%)>");
        
    }
}
