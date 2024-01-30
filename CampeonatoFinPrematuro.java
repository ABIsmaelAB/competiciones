import java.util.*;
/**
 * Write a description of class CampeonatoFinPrematuro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CampeonatoFinPrematuro
{
    public CampeonatoFinPrematuro(){
        Organizacion organizacion;
        organizacion = Organizacion.getInstance(1,3, Collections.reverseOrder(new ComparadorComplejidadCircuito()));
        
        Circuito c1 = new Circuitodec("Portugal", Complejidad.MEDIA, Distancia.INTERMEDIA);
        c1 = new Gravilla(c1);
        c1 = new Nocturno(c1);
        organizacion.insertarCircuitos(c1);
        c1=null;
        c1 = new Circuitodec("Cerdeña", Complejidad.ALTA, Distancia.CORTA);
        c1 = new Gravilla(c1);
        c1 = new Mojado(c1);
        organizacion.insertarCircuitos(c1);
        c1=null;
        c1 = new Circuitodec("Australia", Complejidad.BAJA, Distancia.LARGA);
        c1 = new Gravilla(c1);
        organizacion.insertarCircuitos(c1);
        c1=null;
        c1 = new Circuitodec("Corcega", Complejidad.MEDIA, Distancia.INTERMEDIA);
        c1 = new Nocturno(c1);
        c1 = new Gravilla(c1);
        organizacion.insertarCircuitos(c1);
        c1=null;
        c1 = new Circuitodec("Finlandia", Complejidad.ALTA, Distancia.CORTA);
        c1 = new Nocturno(c1);
        c1 = new Frio(c1);
        c1 = new Mojado(c1);
        organizacion.insertarCircuitos(c1);
        c1=null;
        c1 = new Circuitodec("Alemania", Complejidad.MEDIA, Distancia.INTERMEDIA);
        c1 = new Mojado(c1);
        organizacion.insertarCircuitos(c1);
        c1=null;
        c1 = new Circuitodec("Chile", Complejidad.ALTA, Distancia.CORTA);
        c1 = new Gravilla(c1);
        organizacion.insertarCircuitos(c1);
        
        Escuderia e1 = new Escuderia("Peugeot", Collections.reverseOrder(new ComparadorPuntosDestrezaPiloto()), Collections.reverseOrder(new ComparadorCombustibleCoche()));
        e1.setListaCoche(new CocheResistente("Peugeot 5008", Velocidad.LENTA, Combustible.GENEROSO));
        e1.setListaCoche(new CocheRapido("Peugeot 3008", Velocidad.GUEPARDO, Combustible.NORMAL));
        e1.setListaCoche(new Coche("Peugeot 2008", Velocidad.NORMAL, Combustible.ESCASO));
        e1.setListaPiloto(new PilotoExperimentado("Kankunnen", Concentracion.CONCENTRADO));
        e1.setListaPiloto(new PilotoEstrella("Sainz", Concentracion.ZEN));
        e1.setListaPiloto(new PilotoNovato("Sordo", Concentracion.DESPISTADO));
        organizacion.inscripcionEscuderia(e1);
        e1=null;
        e1 = new Escuderia("Citroen", new ComparadorPuntosDestrezaPiloto(), new ComparadorCombustibleCoche());
        e1.setListaCoche(new CocheResistente("Citroen C5", Velocidad.RAPIDA, Combustible.ELEFANTE));
        e1.setListaCoche(new CocheRapido("Citroen C4", Velocidad.RAPIDA, Combustible.ESCASO));
        e1.setListaCoche(new Coche("Citroen C3", Velocidad.RAPIDA, Combustible.ESCASO));
        e1.setListaPiloto(new PilotoExperimentado("Loeb", Concentracion.NORMAL));
        e1.setListaPiloto(new PilotoEstrella("Makinen", Concentracion.ZEN));
        e1.setListaPiloto(new PilotoNovato("Auriol", Concentracion.NORMAL));
        organizacion.inscripcionEscuderia(e1);
        e1=null;
        e1 = new Escuderia("Seat", Collections.reverseOrder(new ComparadorPuntosDestrezaPiloto()), Collections.reverseOrder(new ComparadorCombustibleCoche()));
        e1.setListaCoche(new CocheResistente("Seat Tarraco", Velocidad.TORTUGA, Combustible.GENEROSO));
        e1.setListaCoche(new CocheRapido("Seat Ateca", Velocidad.GUEPARDO, Combustible.GENEROSO));
        e1.setListaCoche(new Coche("Seat Arona", Velocidad.RAPIDA, Combustible.ESCASO));
        e1.setListaPiloto(new PilotoExperimentado("Ogier", Concentracion.NORMAL));
        e1.setListaPiloto(new PilotoEstrella("McRae", Concentracion.CONCENTRADO));
        e1.setListaPiloto(new PilotoNovato("Blomquist", Concentracion.DESPISTADO));        
        organizacion.inscripcionEscuderia(e1);
        
        
        
        
        System.out.println("*********************************************************************************************************");
        System.out.println("****ESTA SIMULACIÓN CONCLUYE ANTES DE FINALIZAR EL CAMPEONATO CON UN ÚNICO PILOTO SIN DESCALIFICAR****");        
        System.out.println("*********************************************************************************************************\n");
        
        organizacion.rallyFinal();
    }
}
