
/**
 * Write a description of class CocheResistente here.
 * 
 * @author (ianillob) 
 * @version (18/06/2021)
 */
public class CocheResistente extends Coche
{
    private double reserva;
    /**
     * CocheResistente Constructor
     *
     */
    public CocheResistente(){
        super();
        reserva=100;
    }
    
    /**
     * CocheResistente Constructor
     *
     * @param nombre Nombre del Coche
     * @param velocidad Velocidad del coche
     * @param combustible Combustible del coche
     */
    public CocheResistente(String nombre, Velocidad velocidad, Combustible combustible){
        super(nombre,velocidad,combustible);
        reserva=100;
    }
    
    /**
     * Método getReserva
     *
     * @return reserva
     */
    public double getReserva(){
        return reserva;
    }
    
    /**
     * Hace lo mismo que en su clase padre, reduciendo el combustible a la cantidad de tiempo que se haya utilizado, pero sumandole la
     * reserva si lo necesita, solo se puede utilizar una vez por coche resistente
     * 
     * @param cantidad La cantidad que se le resta al combustible
     */
    @Override
    public void setCombustibleRestante(double cantidad){
        
        if(reserva>0 && cantidad>combustibleRestante){
            combustibleRestante+=reserva;
            reserva=0;
            System.out.println("+++ El " + nombre + 
            " tiene que recurrir al depósito de reserva para poder correr +++");
        }
        super.setCombustibleRestante(cantidad);
        
    }
    /**
     * Método toString
     *
     * @return El valor de retorno
     */
    @Override
    public String toString(){
        return "<coche: " + getNombre() + "> <tipo: " +
        getClass().getSimpleName() + "> <vel_teó: " +
        getVelocidad().getValor() + "> <comb: " +
        getCombustible().toString() + "(actual:" +
        getCombustibleRestante() + ")> <reserva: "
        + getReserva() + ">";
    }
}
