import java.util.*;
/**
 * Write a description of class ComparadorPuntosYCarrerasTotales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComparadorPuntosYCarrerasTotales implements Comparator<Escuderia>
{
    public int compare(Escuderia e1, Escuderia e2){
        if(e1.puntosEscuderia() == e2.puntosEscuderia()){
            return new ComparadorCarrerasTotales().compare(e1,e2);
        }
        else if(e1.puntosEscuderia() > e2.puntosEscuderia())
            return 1;
        else
            return -1;
    }
}
