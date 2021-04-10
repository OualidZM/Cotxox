package edu.pingpong.Cotxox;

import static org.junit.Assert.assertEquals;
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
        assertTrue( true );
    } 
    
    @Test
    public void getNumeroValoracionTest()
    {
        assertTrue( true );
    }

    @Test
    public void getOcupadoTest()
    {
        assertTrue( true );
    }

    @Test
    public void isOcupadoTest()
    {
        assertTrue( true );
    }

}
