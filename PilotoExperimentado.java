import java.lang.*;
import java.util.*;
public class PilotoExperimentado extends AbstractPiloto {
    /**
     * PilotoExperimentado Constructor por defecto
     *
     */
    public PilotoExperimentado() {
        super();
    }
    
    /**
     * PilotoExperimentado Constructor parametrizado, calcula su destreza
     *
     * @param nombre Nombre del piloto
     * @param concentracion Concentracion del piloto
     */
    public PilotoExperimentado(String nombre, Concentracion concentracion) {
        super(nombre, concentracion);
        double d = ((concentracion.getValor()+3)/130)*1.03; 
        int r = (int) Math.round(d*100); 
        double f = r/100.0;
        setDestreza(f);
    }
}
