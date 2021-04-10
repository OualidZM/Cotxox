package edu.pingpong.Cotxox;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import edu.pingpong.Cotxox.conductor.Conductor;


public class ConductorTest 
{

    Conductor conductor;
    
    @Before
    public void before(){
        conductor = new Conductor("Antonio");
        conductor = new Conductor("Lucas");
        conductor = new Conductor("Daniel");
        conductor = new Conductor("Paula");
        conductor = new Conductor("Pablo");

    }

    @Test
    public void getNombreTest()
    {
        String primerNombre = "Antonio" ;
        conductor = new Conductor(primerNombre);
        assertEquals(primerNombre, conductor.getNombre());

    }


    @Test
    public void setModeloTest()
    {
        String modelo = "volkswagen caddy";
        conductor.setModelo(modelo);
        assertEquals(modelo, conductor.getModelo());
    }


    @Test
    public void getMatriculaTest()
    {
        String matricula = "KQ9C1S";
        conductor.setMatricula(matricula);
        assertEquals(matricula, conductor.getMatricula());
    }

    @Test
    public void getValoracionTest()
    {
        byte valoracion = 55;
        conductor.setValoracion(valoracion);
        assertEquals(valoracion, conductor.getValoracion(),0);
    } 
    
    @Test
    public void getNumeroValoracionTest()
    {
        byte PrimeraValoracion = 55;
        byte SegundaValoracion = 65;
        byte TerceraValoracion = 75;
        byte CuartaValoracion = 85;
        byte QuintaValoracion = 85;
        
        conductor.setValoracion(PrimeraValoracion);
        conductor.setValoracion(SegundaValoracion);
        conductor.setValoracion(TerceraValoracion);
        conductor.setValoracion(CuartaValoracion);
        conductor.setValoracion(QuintaValoracion);

        assertEquals(5, conductor.getNumeroValoracion());



    }

    @Test
    public void setOcupadoTest()
    {
        conductor.setOcupado(true);
        assertTrue(true);

        conductor.setOcupado(false);
        assertFalse(false);
    }

    @Test
    public void isOcupadoTest()
    {
        conductor.isOcupado();
        assertTrue(true);
    }

}
