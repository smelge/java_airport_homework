import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(AircraftType.BORING11,"CryinAir",0);
    }

    @Test
    public void planeIsEmpty(){
        assertEquals(0,plane.getPassengers());
    }

    @Test
    public void add20Passengers(){
        plane.addPassengers(20);
        assertEquals(20,plane.getPassengers());
    }

    @Test
    public void planeOverCapacity(){
        plane.addPassengers(120);
        assertEquals(100,plane.getPassengers());
    }

    @Test
    public void emptyPlane(){
        plane.addPassengers(45);
        plane.emptyPlane();
        assertEquals(0,plane.getPassengers());
    }

    @Test
    public void getAirline(){
        assertEquals("CryinAir",plane.getAirline());
    }
}
