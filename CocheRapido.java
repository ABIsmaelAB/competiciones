
/**
 * Write a description of class CocheRapido here.
 * 
 * @author (ianillob) 
 * @version (18/06/2021)
 */
public class CocheRapido extends Coche
{
    private double nitro;
    /**
     * CocheRapido Constructor
     *
     */
    public CocheRapido(){
        super();
        nitro=80.0;
    }
    
    /**
     * CocheRapido Constructor
     *
     * @param nombre Nombre del coche
     * @param velocidad Velocidad del coche
     * @param combustible Combustible del coche
     */
    public CocheRapido(String nombre, Velocidad velocidad, Combustible combustible){
        super(nombre,velocidad,combustible);
        nitro=80.0;
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
        getCombustibleRestante() + ")> <nitroPendiente: " +
        getNitro() + ">";
    }
    
    /**
     * Método getNitro, devuelve el nitro
     *
     * @return nitro El nitro del coche
     */
    public double getNitro(){
        return nitro;
    }
    
    /**
     * Hace lo mismo que en su clase padre, pero si tiene nitro disponible lo utiliza, siendo el 20% de su velocidad, y si no tiene
     * suficiente nitro para utilizar ese 20%, utiliza todo el nitro restante
     * 
     * @param piloto siendo el piloto que utiliza el coche
     * @param circuito siendo el circuito donde corre
     * 
     * @return velocidadReal la velocidad utilizada por el coche en dicho circuito
     */
    @Override
    public double setVelocidadReal(Piloto piloto, Circuito circuito) {
        super.setVelocidadReal(piloto, circuito);
        double i=0.00;
        if(nitro>0.0){
            i=velocidadReal*0.2;
            if(i<nitro){
                velocidadReal+=i;
                nitro=nitro-i;
            }
            else{
                i=nitro;
                velocidadReal+=nitro;
                nitro=0;
            }
            velocidadReal=Math.round((velocidadReal*100d)/100d);
            System.out.println("El " + nombre + 
                " usa " + Math.round((i*100d)/100d) + " de nitro para alcanzar " +
                velocidadReal + " km/hora y el nitro restante es " +
                nitro + " +++");
        }
        return velocidadReal;
    }
}
