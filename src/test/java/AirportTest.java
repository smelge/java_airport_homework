import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Plane plane;
    Plane plane1;
    Plane plane2;
    Plane plane3;
    Plane plane4;
    Airport airport;
    Flight flight;

    @Before
    public void before(){
        plane = new Plane(AircraftType.BORING11,"CryinAir",0);
        plane1 = new Plane(AircraftType.CESPITMICRO,"CryinAir",0);
        plane2 = new Plane(AircraftType.EREBUS666,"CryinAir",0);
        plane3 = new Plane(AircraftType.BORING11,"CryinAir",0);
        plane4 = new Plane(AircraftType.BORINGBEDLINER,"LazyJet",0);
        airport = new Airport("Geneva International","GVA");
        flight = new Flight(AircraftType.BORING747,"Berlin",airport.getAirportCode());

    }

    @Test
    public void canGetAirportName(){
        assertEquals("Geneva International",airport.getAirportName());
    }

    @Test
    public void canGetAirportCode(){
        assertEquals("GVA",airport.getAirportCode());
    }

    @Test
    public void hasEmptyHangar(){
        assertEquals(0,airport.countPlanesInHangar());
    }

    @Test
    public void canAddPlaneToHanger(){
        airport.putPlaneInHangar(plane);
        assertEquals(1,airport.countPlanesInHangar());
    }

    @Test
    public void canRemovePlaneFromHanger(){
        airport.putPlaneInHangar(plane);
        airport.getPlaneFromHanger(plane);
        assertEquals(0,airport.countPlanesInHangar());
    }

    @Test
    public void canRemovePlaneFromHangerLeavingSome(){
        airport.putPlaneInHangar(plane1);
        airport.putPlaneInHangar(plane2);
        airport.putPlaneInHangar(plane3);
        airport.getPlaneFromHanger(plane2);
        assertEquals(2,airport.countPlanesInHangar());
    }

    @Test
    public void canGetFlight(){
        assertEquals("Berlin",flight.getFlightDestination());
    }

    @Test
    public void getPlaneCapacity(){
        assertEquals(220,flight.getPlaneCapacity());
    }

    @Test
    public void canCreateFlight(){
        airport.putPlaneInHangar(plane1);
        airport.putPlaneInHangar(plane2);
        airport.putPlaneInHangar(plane3);
        airport.putPlaneInHangar(plane4);
        assertEquals(3,airport.countPlanesInHangar());
        airport.setFlight("Swansea",plane4);

    }


}
