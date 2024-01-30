import java.util.*;
/**
 * Write a description of class ComparadorCarrerasTotales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparadorCarrerasTotales implements Comparator<Escuderia>
{
    public int compare(Escuderia e1, Escuderia e2){
        if(e1.carrerasTerminadas() == e2.carrerasTerminadas()){
            return (e1.getNombre().compareTo(e2.getNombre()));
        }
        else if(e1.carrerasTerminadas() > e2.carrerasTerminadas())
            return 1;
        else
            return -1;
    }
}
