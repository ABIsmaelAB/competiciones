import java.util.*;
public class ComparadorComplejidadCircuito implements Comparator<Circuito>
{
    public int compare(Circuito c1, Circuito c2){
        if(c1.getComplejidad() == c2.getComplejidad()){
            return (c1.getNombre().compareTo(c2.getNombre()));
        }
        else if(c1.getComplejidad() > c2.getComplejidad())
            return 1;
        else
            return -1;
    }
}
