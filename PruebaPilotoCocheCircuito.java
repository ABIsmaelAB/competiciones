

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PruebaPiloto.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PruebaPilotoCocheCircuito
{
    /**
     * Default constructor for test class PruebaPiloto
     */
    public PruebaPilotoCocheCircuito()
    {
        
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        
    }
    @Test
    public void testDestreza(){
        Piloto p = new PilotoEstrella("Loeb", Concentracion.CONCENTRADO);
        if(p.getDestreza()!=0.93){
            System.out.println(p.getDestreza());
            fail("No es su destreza");
        }
        
    }
    
    /**
     * Comprueba los metodos que calcula todo lo relacionado con el circuito y coche dado en un piloto, es decir,
     * un piloto con un coche corre en un circuito y lo que se ha comprobado es que de los resultdados correcto para ese circuito.
     *
     * Called before every test case method.
     */
    @Test
    public void testcocheYSusFuncionesSobreCircuito(){
        Piloto p = new PilotoEstrella("Loeb", Concentracion.CONCENTRADO);
        p.setCochePrincipio(new Coche("Seat Pi", Velocidad.TORTUGA, Combustible.ELEFANTE));
        Circuito c = new Circuitodec("Portugal",Complejidad.BAJA, Distancia.LARGA);
        c= new Gravilla(c);
        if(p.getCoche().getNombre()!="Seat Pi"){
            fail("No es su coche");
        }
        if(p.getCoche().getVelocidad().getValor()!=200)
            fail("No es su Velocidad");
        if(p.getCoche().getCombustible().getValor()!=480)
            fail("No es su Combustible");
        p.getCoche().setVelocidadReal(p, c);
        if(p.getCoche().getVelocidadReal()!=177.14)
            fail("No es su Velocidad Real");
        p.getCoche().tiempoCarrera(p,c);
        if(p.getCoche().tiempoCarrera()!=96.53)
            fail("No es su tiempo de carrera");
        p.getCoche().setCombustibleRestante(p.getCoche().tiempoCarrera());
        if(p.getCoche().getCombustibleRestante()!=383.47)
            fail("No es su Combustible restante");
        
        p.funcionPilotoCircuito(c, 2);
        
        if(p.getNumTotalCarreras()!=1)
            fail("No son todas sus carreras");
        p.ponerPuntuacionEnCircuito(c, 10);
        if(p.getNumTotalCarreras()!=1)
            fail("No son todas sus carreras");
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
