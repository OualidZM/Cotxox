package edu.pingpong.Cotxox;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import edu.pingpong.Cotxox.conductor.Conductor;
import edu.pingpong.Cotxox.conductor.PoolConductores;


public class PoolConductoresTest 
{

    List<Conductor> poolConductores = new ArrayList<Conductor>();
    Conductor conductor;
    PoolConductores poolConductoress;

    @Test
    public void Constructor()
    {
        assertNull(poolConductoress);
    }

}
