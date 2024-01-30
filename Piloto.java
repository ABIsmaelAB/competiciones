

/**
 * La interfaz de Piloto
 * 
 * @author (ianillob) 
 * @version (18/06/2021)
 */
public interface Piloto
{
    public double getDestreza();
    public void setDestreza(double destreza);
    public String getNombre();
    public void setNombre(String nombre);
    public Coche getCoche();
    public void setCochePrincipio(Coche vehiculo);
    public void setCocheFin();
    public double getConcentracion();
    public void setConcentracion(Concentracion concentracion);
    public void setResultados(Circuito circuito, double tiempo, int puntos);
    public void ponerPuntuacionEnCircuito(Circuito circuito, int puntos);
    public PuntuacionPiloto getResultados(Circuito circuito);
    public boolean getDescalificado();
    public void setDescalificado(boolean descalificado);
    public int getPuntosAcumulados();
    public int getNumTotalCarreras();
    public int getNumTotalAcabadas();
    public int getNumTotalAbandonos();
    public double getUltimoTiempo();
    public int getUltimoPunto();
    public void mostrarPuntuacionCircuito();
    public void mostrarPuntuacionConcreta(int posicion, int limiteAbandonos);
    public void funcionPilotoCircuito(Circuito circuito, int limiteAbandonos);
    
}
