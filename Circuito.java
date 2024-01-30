
/**
 * Write a description of interface Circuito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Circuito
{
    public String getNombre();
    public double getComplejidad();
    public double getDistancia();
    public Complejidad getCompInicial();
    public Distancia getDistInicial();
    public void setNombre(String nombre);
    public void setComplejidad(double complejidad);
    public void setDistancia(double distancia);
    public String getCondiciones();
}
