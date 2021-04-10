package edu.pingpong.Cotxox;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.Cotxox.carrera.Carrera;
import edu.pingpong.Cotxox.tarifa.Tarifa;

public class TarifaTest 
{
    double COSTE_MILLA = 1.35;
    double COSTE_MINUTO = 0.35;
    double COSTE_MINIMO = 5;
    byte PORCENTAJE_COMISION = 20;
    Carrera carrera;


    @Test
    public void getCosteDistanciaTest()
    {
        assertEquals(40.5, Tarifa.getCosteDistancia(30),0);
        assertEquals(33.75, Tarifa.getCosteDistancia(25),0);
        assertEquals(13.5, Tarifa.getCosteDistancia(10),0);
        assertEquals(27.0,Tarifa.getCosteDistancia(20),0);
        assertEquals(67.5, Tarifa.getCosteDistancia(50),0);
    }

    
    @Test
    public void getCosteTiempoTest()
    {
        assertEquals(8.0,Math.round(Tarifa.getCosteDistancia(6)) ,0);
        assertEquals(15.0,Math.round(Tarifa.getCosteDistancia(11)) ,0);
        assertEquals(23.0,Math.round(Tarifa.getCosteDistancia(17)) ,0);
        assertEquals(30.0,Math.round(Tarifa.getCosteDistancia(22)) ,0);
        assertEquals(35.0,Math.round(Tarifa.getCosteDistancia(26)) ,0);

    }

    
    @Test
    public void getCosteTotalEsperadoTest()
    {
        Carrera carrera = new Carrera("231421234");
        double distancia = 20;
		int minutos = 15;
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(minutos);
        assertEquals(32.25,Tarifa.getCosteTotalEsperado(carrera),0);

    }

}
