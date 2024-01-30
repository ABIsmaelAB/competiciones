import java.util.*;
//ascendente por Puntos del Piloto, en caso de empate por Destreza, en caso de empate por nombre
public class ComparadorPuntosDestrezaPiloto implements Comparator<Piloto>
{
    public int compare(Piloto p1, Piloto p2){
        if(p1.getPuntosAcumulados() == p2.getPuntosAcumulados()){
            return new ComparadorDestrezaPiloto().compare(p1,p2);
        }
        else if(p1.getPuntosAcumulados() > p2.getPuntosAcumulados())
            return 1;
        else
            return -1;
    }
}
