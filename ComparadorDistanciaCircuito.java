import java.util.*;
public class ComparadorDistanciaCircuito implements Comparator<Circuito>
{
    public int compare(Circuito c1, Circuito c2){
        if(c1.getDistancia() == c2.getDistancia()){
            return (c1.getNombre().compareTo(c2.getNombre()));
        }
        else if(c1.getDistancia() > c2.getDistancia())
            return 1;
        else
            return -1;
    }
}
