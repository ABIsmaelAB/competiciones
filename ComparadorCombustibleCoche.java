import java.util.*;
//ascendente por Combustible restante del Coche , en caso de empate por nombre
public class ComparadorCombustibleCoche implements Comparator<Coche>
{
    public int compare(Coche c1, Coche c2){
        if(c1.getCombustibleRestante() == c2.getCombustibleRestante()){
            return (c1.getNombre().compareTo(c2.getNombre()));
        }
        else if(c1.getCombustibleRestante() > c2.getCombustibleRestante())
            return 1;
        else
            return -1;
    }
}
