import java.lang.*;
import java.util.*;
public class PilotoEstrella extends AbstractPiloto {
    
    /**
     * PilotoEstrella Constructor por defecto
     *
     */
    public PilotoEstrella() {
        super();
    }
    
    /**
     * PilotoEstrella Constructor parametrizado, calcula su destreza
     *
     * @param nombre Nombre del piloto
     * @param concentracion Concentracion del piloto
     */
    public PilotoEstrella(String nombre, Concentracion concentracion) {
        super(nombre, concentracion);
        double d = (((concentracion.getValor()+6)/140)*1.06)+0.05; 
        int r = (int) Math.round(d*100); 
        double f = r/100.0;
        setDestreza(f);
    }
}
