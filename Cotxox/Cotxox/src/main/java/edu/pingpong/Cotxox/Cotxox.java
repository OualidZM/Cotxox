package edu.pingpong.Cotxox;
import edu.pingpong.Cotxox.carrera.Carrera;
import edu.pingpong.Cotxox.conductor.Conductor;
import edu.pingpong.Cotxox.conductor.PoolConductores;



/**
 * Hello world!
 *
 */
public class Cotxox 
{
    public static void main( String[] args )
    {


        String tarjetaCredito = "49161197911394546";
        String origen =  "Aeroport Son Sant Joan";
        String destino = "Magaluf";
        double distancia = 7.75;
        double costeTotal = 13.9625;


        
        Carrera carrera = new Carrera(tarjetaCredito);
        carrera.setOrigen(origen);
        carrera.setDestino(destino);
        carrera.setDistancia(distancia);
        carrera.setCosteTotal(costeTotal);

        String nombre = "Samantha";
        String modelo = "Chevy Malibu";
        String matricula = "4ABC123";
        double valoracionMedia = 4.0;

        boolean ocupado = false;

        Conductor conductor = new Conductor();
        conductor.setNombre(nombre);
        conductor.setModelo(modelo);
        conductor.setMatricula(matricula);
        conductor.setValoracionMedia(valoracionMedia);
        conductor.setOcupado(ocupado);

        System.out.println("#####" + "\t" + "Set Pickup:" + "\t" + "#####");

        System.out.println(
  

        "Visa: "+ carrera.getTarjetaCredito() +"\n"+
        "From: "+ carrera.getOrigen() + "\n"+
        "To: "+ carrera.getDestino() +"\n"+
        "Distancia:" + carrera.getDistancia()
        );



        System.out.println("#####" + "\t" + "See your Cost:" + "\t" + "#####");

        System.out.println(

        "Visa:"+ carrera.getTarjetaCredito() +"\n"+
        "From:"+ carrera.getOrigen()+ "\n"+
        "To:"+ carrera.getDestino() +"\n"+   
        "Distancia:"+ carrera.getDistancia() +"\n"+
        "Total: " + carrera.getCosteTotal()
        );





        // Conductor conductor = new Conductor();
        // conductor.getNombre();
        // conductor.



        System.out.println("#####" + "\t" + "Get a ride:Driver:" + "\t" + "#####");

        System.out.println(

            "Driver: "+ conductor.getNombre() +"\n"+
            "Type: "+ conductor.getNombre() +"\n"+
            "Matricula: "+ conductor.getMatricula() +"\n"+
            "Starts:"+ conductor.getValoracion() +"\n"+
            "From: "+ carrera.getOrigen() +"\n"+
            "To:"+ carrera.getDestino() +"\n"+
            "Disponible para ti"
        );


        // conductor.setNombre(nombre);
        // conductor.setModelo(modelo);
        // conductor.setMatricula(matricula);
        // conductor.setValoraciones(valoraciones);
        



        System.out.println("#####" + "\t" + "Pay and Tip:" + "\t" + "#####");
        
        System.out.println(
        "Driver: "+ conductor.getNombre()+"\n"+
        "TIP: "+ "\n"+
        "Visa: "+ carrera.getTarjetaCredito() + "\n"+
        "Total:"+ carrera.getCosteTotal() + "\n"+
        "Ocupado?:" + conductor.isOcupado()
        );


        System.out.println("#####" + "\t" + "Rate your drive:" + "\t" + "#####");

        System.out.println(

            "Driver: "+ conductor.getNombre()+"\n"+
            "Starts:" + conductor.getValoracionMedia()
        );
        
    }


}
