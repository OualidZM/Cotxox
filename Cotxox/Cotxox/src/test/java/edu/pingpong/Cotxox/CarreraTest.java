package edu.pingpong.Cotxox;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import edu.pingpong.Cotxox.carrera.Carrera;
import edu.pingpong.Cotxox.conductor.Conductor;
import edu.pingpong.Cotxox.conductor.PoolConductores;


public class CarreraTest 
{
    Carrera carrera;
    Conductor conductor;
    PoolConductores poolConductores;
    final List<Conductor> conductores = new ArrayList<Conductor>();
    
    @Before
    public void before(){
        carrera = new Carrera("4024007198786385");
        carrera = new Carrera("4417129513323481");
        carrera = new Carrera("4532121888937144");
        carrera = new Carrera("4916119711304546");
    }

    @Test
	public void setOrigenTest() {
        String origen = "Carrer de Sant Miquel";
        carrera.setOrigen(origen);
        assertEquals(origen, carrera.getOrigen());

	}

	@Test
	public void setDestinoTest() {
        String destino = "Carrer de Murillo";
        carrera.setDestino(destino);
        assertEquals(destino, carrera.getDestino());
	}

	@Test
	public void setDistanciaTest() {
        double distancia = 500;
        carrera.setDistancia(distancia);
        assertEquals(distancia, carrera.getDistancia(),0);
	}


    @Test
	public void setTiempoEsperadoTest() {
        int tiempoEsperado = 6;
        carrera.setTiempoCarrera(tiempoEsperado);
        assertEquals(tiempoEsperado, carrera.getTiempoCarrera());

    }


	@Test
	public void setTiempoCarreraTest() {
        int tiempoCarrera = 10;
        carrera.setTiempoCarrera(tiempoCarrera);
        assertEquals(tiempoCarrera, carrera.getTiempoCarrera());
	}

	@Test
	public void setConductorTest() {
        conductor = new Conductor("Francina");
        conductor = new Conductor("Maria");
        conductor = new Conductor("Adriá");
        conductor = new Conductor("Arnau");
        conductor = new Conductor("Joan");
        carrera.setConductor(conductor);

        assertEquals(conductor, carrera.getConductor());

	}


    @Test
	public void getCosteEsperadoTest() {
		double distancia = 7.75;
		int minutos = 10;
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(minutos);
        double total = distancia * 1.35 + minutos * 0.35;
        assertEquals(total, carrera.getCosteEsperado(),0);
	}

	@Test
	public void asignarConductor() {
        List<Conductor> poolConductores = new ArrayList<Conductor>();
        conductor = new Conductor("Francina");
        conductor = new Conductor("Maria");
        conductor = new Conductor("Adriá");
        conductor = new Conductor("Arnau");
        conductor = new Conductor("Joan");
        poolConductores.add(conductor);
		PoolConductores conductores = new PoolConductores(poolConductores);
        carrera.asignarConductor(conductores);
        assertTrue(carrera.getConductor().isOcupado());

	}

	@Test
	public void realizarPagoTest() {
        double pago = 5;
        carrera.realizarPago(pago);
        assertEquals(pago, carrera.getCosteTotal(),0);
	}

	@Test
	public void liberarConductor() {
        conductor = new Conductor("Francina");
        conductor = new Conductor("Maria");
        conductor = new Conductor("Adriá");
        conductor = new Conductor("Arnau");
        conductor = new Conductor("Joan");
        carrera.setConductor(conductor);
        carrera.liberarConductor();
        assertFalse(conductor.isOcupado());
    }
}
