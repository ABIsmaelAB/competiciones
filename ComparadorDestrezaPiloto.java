import java.util.*;
//por Destreza, en caso de empate por nombre
public class ComparadorDestrezaPiloto implements Comparator<Piloto>
{
    public int compare(Piloto p1, Piloto p2){
        if(p1.getDestreza() == p2.getDestreza()){
            return (p1.getNombre().compareTo(p2.getNombre()));
        }
        else if(p1.getDestreza() > p2.getDestreza())
            return 1;
        else
            return -1;
    }
}
