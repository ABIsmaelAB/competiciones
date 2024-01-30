
/**
 * Write a description of class PruebasPiloto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebasPiloto
{
    public PruebasPiloto(){}
  
    public void testDestreza(){
        Piloto p = new PilotoEstrella("Loeb", Concentracion.CONCENTRADO);
        if(p.getDestreza()!=0.93){
            System.out.println(p.getDestreza());
            System.out.println("No es su destreza");
        }
        System.out.println(p.getDestreza());
    }
}
