import java.util.*;
/**
 * Write a description of class PruebaCircuito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pruebas
{
    public static void main(String[] args) {
        /*
        System.out.println("Hola");
        Organizacion organizacion;
        organizacion = Organizacion.getInstance(3,3);
        Escuderia e = new Escuderia("Seat");
        e.setListaPiloto(new PilotoNovato("Zac", Concentracion.ZEN));
        e.setListaPiloto(new PilotoEstrella("Ell", Concentracion.ZEN));
        
        e.setListaCoche(new Coche("CAR", Velocidad.NORMAL, Combustible.ELEFANTE));
        organizacion.inscripcionEscuderia(e);
        e.ordenarListaPilotos("DestrezaAsc");
        e.mostrarListaPiloto();
        organizacion.mostrarEscuderias();
        
        System.out.println(e.getListaPiloto().size());
        Coche cO1 = new CocheRapido("CAR", Velocidad.NORMAL, Combustible.ELEFANTE);
        e.setListaCoche(cO1);
        
        System.out.println(e.getListaCoche(0));
        //organizacion.mostrarEscuderias();
        
        
        
        Escuderia e=new Escuderia("Seat");
        e.setListaPiloto(new PilotoNovato("Zac", Concentracion.ZEN));
        e.setListaPiloto(new PilotoEstrella("Ell", Concentracion.ZEN));
        System.out.println(e.getPiloto(0));
        e.mostrarListaPiloto();
        
       
        Coche cO1 = new CocheRapido("CAR", Velocidad.NORMAL, Combustible.ELEFANTE);
        Coche cc = cO1;
        System.out.println(cc);
        System.out.println("--------------------------");
        Circuito c1 = new Circuitodec("Portugal",Complejidad.MEDIA,Distancia.INTERMEDIA);
        c1 = new Gravilla(c1);
        c1 = new Nocturno(c1);
        System.out.println(c1);
        System.out.println("--------------------------");
        
        Piloto p1 = new PilotoNovato("Zac", Concentracion.ZEN);
        System.out.println(p1);
        System.out.println("--------------------------");
        Coche cO1 = new CocheRapido("CAR", Velocidad.NORMAL, Combustible.ELEFANTE);
        System.out.println(cO1);
        List<Coche> listaCoches = new LinkedList<>();
        listaCoches.add(cO1);
        Coche cc1 = new Coche();
        cc1=listaCoches.get(0);
        listaCoches.remove(0);
        System.out.println(cc1);
        
        cO1.setVelocidadRealNitro();
        System.out.println(cO1.getNitro());
        System.out.println(cO1.getVelocidadReal());
        cO1.setVelocidadRealNitro();
        System.out.println(cO1.getNitro());
        System.out.println(cO1.getVelocidadReal());
        
        
            
        Piloto p = new PilotoEstrella("Loeb", Concentracion.CONCENTRADO);
        p.setCoche(new Coche("Seat Pi", Velocidad.TORTUGA, Combustible.ELEFANTE));
        Circuito c = new Circuitodec("Portugal",Complejidad.BAJA, Distancia.LARGA);
        c= new Gravilla(c);
        //if(p.getCoche().getNombre()!="Seat Pi"){
            //fail("No es su coche");
        
        //if(p.getCoche().getVelocidad().getValor()!=200)
            //fail("No es su Velocidad");
        //if(p.getCoche().getCombustible().getValor()!=480)
            //fail("No es su Combustible");
        p.getCoche().setVelocidadReal(p, c.getComplejidad());
        System.out.println(p.getCoche().getVelocidadReal());
        //if(p.getCoche().getVelocidadReal()!=177.14)
            //fail("No es su Velocidad Real");
        p.getCoche().tiempoCarrera(c.getDistancia());
        //if(p.getCoche().tiempoCarrera()!=96.53)
            //fail("No es su tiempo de carrera");
        System.out.println(p.getCoche().tiempoCarrera());
        System.out.println(p.funcionPilotoCircuito(c,2));
        System.out.println(p.carrerasRealizadas());
        p.mostrarPuntuacionCircuito();
        p.setResultadosPuntos("Portugal", 10);
        p.mostrarPuntuacionCircuito();
        */
       /*
       Escuderia e = new Escuderia("Peugeot");
        e.ordenarListaPilotos("PuntosDestrezaDesc");
        e.ordenarListaCoches("CombustibleDesc");
        e.setListaCoche(new CocheResistente("Peugeot 5008", Velocidad.LENTA, Combustible.GENEROSO));
        e.setListaCoche(new CocheRapido("Peugeot 3008", Velocidad.GUEPARDO, Combustible.NORMAL));
        e.setListaCoche(new Coche("Peugeot 2008", Velocidad.NORMAL, Combustible.ESCASO));
        e.setListaPiloto(new PilotoExperimentado("Kankunnen", Concentracion.CONCENTRADO));
        System.out.println(e.listaPilotosDescalificados());
        e.setListaPiloto(new PilotoEstrella("Sainz", Concentracion.ZEN));
        e.setListaPiloto(new PilotoNovato("Sordo", Concentracion.DESPISTADO));
        e.ordenarListaPilotos("PuntosDestrezaDesc");
        e.ordenarListaCoches("CombustibleDesc");
        System.out.println(e.getPiloto(0).getNombre());
        List<Piloto> pilotosCarrera = new LinkedList<>();
        //pilotosCarrera=e.repartirCochesEscuderia(2,"PuntosDestrezaDesc","CombustibleDesc");
        //e.mostrarPilotosConCoche();
        //e.mostrarListaCoche();
        //e.mostrarListaPiloto();
       // System.out.println(pilotosCarrera.size());
       // e.devolverPilotosCochesColocados(pilotosCarrera,2);
       // System.out.println(pilotosCarrera.size());
        //e.mostrarListaCoche();
       // e.mostrarListaPiloto();
       // e.mostrarPilotosConCoche();
       //e.mostrarPilotosConCoche();
       */
      /*
      Organizacion organizacion;
        organizacion = Organizacion.getInstance(2,2);
        
        Circuito c1 = new Circuitodec("Portugal", Complejidad.MEDIA, Distancia.CORTA);
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
        
        Escuderia e1 = new Escuderia("Peugeot");
        e1.ordenarListaPilotos("PuntosDestrezaDesc");
        e1.ordenarListaCoches("CombustibleDesc");
        organizacion.inscripcionEscuderia(e1);
        e1=null;
        e1 = new Escuderia("Citroen");
        e1.ordenarListaPilotos("PuntosDestrezaAsc");
        e1.ordenarListaCoches("CombustibleAsc");
        organizacion.inscripcionEscuderia(e1);
        e1=null;
        e1 = new Escuderia("Seat");
        e1.ordenarListaPilotos("PuntosDestrezaAsc");
        e1.ordenarListaCoches("CombustibleAsc");
        organizacion.inscripcionEscuderia(e1);
        e1=null;
        
        
        for(Escuderia escuderia: organizacion.getListaEscuderia()){
            if(escuderia.getNombre()=="Citroen"){
                escuderia.setListaCoche(new CocheResistente("Citroen C5", Velocidad.RAPIDA, Combustible.ELEFANTE));
                escuderia.setListaCoche(new CocheRapido("Citroen C4", Velocidad.RAPIDA, Combustible.ESCASO));
                escuderia.setListaCoche(new Coche("Citroen C3", Velocidad.RAPIDA, Combustible.ESCASO));
                escuderia.setListaPiloto(new PilotoExperimentado("Loeb", Concentracion.NORMAL));
                escuderia.setListaPiloto(new PilotoEstrella("Makinen", Concentracion.ZEN));
                escuderia.setListaPiloto(new PilotoNovato("Auriol", Concentracion.NORMAL));
            }
            if(escuderia.getNombre()=="Seat"){
                escuderia.setListaCoche(new CocheResistente("Seat Tarraco", Velocidad.TORTUGA, Combustible.GENEROSO));
                escuderia.setListaCoche(new CocheRapido("Seat Ateca", Velocidad.GUEPARDO, Combustible.GENEROSO));
                escuderia.setListaCoche(new Coche("Seat Arona", Velocidad.RAPIDA, Combustible.ESCASO));
                escuderia.setListaPiloto(new PilotoExperimentado("Ogier", Concentracion.NORMAL));
                escuderia.setListaPiloto(new PilotoEstrella("McRae", Concentracion.CONCENTRADO));
                escuderia.setListaPiloto(new PilotoNovato("Blomquist", Concentracion.DESPISTADO));
            }
            if(escuderia.getNombre()=="Peugeot"){
                escuderia.setListaCoche(new CocheResistente("Peugeot 5008", Velocidad.LENTA, Combustible.GENEROSO));
                escuderia.setListaCoche(new CocheRapido("Peugeot 3008", Velocidad.GUEPARDO, Combustible.NORMAL));
                escuderia.setListaCoche(new Coche("Peugeot 2008", Velocidad.NORMAL, Combustible.ESCASO));
                escuderia.setListaPiloto(new PilotoExperimentado("Kankunnen", Concentracion.CONCENTRADO));
                escuderia.setListaPiloto(new PilotoEstrella("Sainz", Concentracion.ZEN));
                escuderia.setListaPiloto(new PilotoNovato("Sordo", Concentracion.DESPISTADO));
            }
        }
        
     */   
    }
}
