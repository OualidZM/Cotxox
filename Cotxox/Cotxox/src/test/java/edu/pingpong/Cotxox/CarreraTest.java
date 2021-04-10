package edu.pingpong.Cotxox;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import edu.pingpong.Cotxox.carrera.Carrera;
import edu.pingpong.Cotxox.conductor.Conductor;


public class CarreraTest 
{
    Carrera carrera;
    Conductor conductor;
    PoolConductoresTest poolConductoresTest;
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
        
	}


    @Test
	public void getCosteEsperadoTest() {

	}

	@Test
	public void asignarConductor() {

	}

	@Test
	public void realizarPagoTest() {

	}

	@Test
	public void liberarConductor() {

	}

	@Test
	public void setValoracion() {

	}
}
