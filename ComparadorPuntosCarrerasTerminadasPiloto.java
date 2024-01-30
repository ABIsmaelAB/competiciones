import java.util.*;
public class ComparadorPuntosCarrerasTerminadasPiloto implements Comparator<Piloto>
{
    public int compare(Piloto p1, Piloto p2){
        if(p1.getPuntosAcumulados() == p2.getPuntosAcumulados()){
            return new ComparadorCarrerasTerminadasPiloto().compare(p1,p2);
        }
        else if(p1.getPuntosAcumulados() > p2.getPuntosAcumulados())
            return 1;
        else
            return -1;
    }
}
