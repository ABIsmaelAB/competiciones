
public enum Complejidad {
    BAJA("BAJA",1.0),
    MEDIA("MEDIA",1.25),
    ALTA("ALTA",1.5);
    
    private final String nombre;
    private final double valor;
    
    Complejidad(String nombre, double valor){
        this.nombre=nombre;
        this.valor=valor;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getValor() {
        return valor;
    }
    
    public String toString() {
        return getNombre() + "(original: " + getValor() + ")";
    }
}
