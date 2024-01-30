import java.util.*;
public class ComparadorCarrerasTerminadasPiloto implements Comparator<Piloto>
{
    public int compare(Piloto p1, Piloto p2){
        if(p1.getNumTotalCarreras() == p2.getNumTotalCarreras()){
            return (p1.getNombre().compareTo(p2.getNombre()));
        }
        else if(p1.getNumTotalCarreras() > p2.getNumTotalCarreras())
            return 1;
        else
            return -1;
    }
}
