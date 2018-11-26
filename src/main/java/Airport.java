import java.util.ArrayList;

public class Airport {
    private String airportName;
    private  String airportCode;
    private ArrayList<Plane> hanger;
    private AircraftType assignedPlane;

    Flight flight;


    public Airport(String airportName,String airportCode){
        this.airportName = airportName;
        this.airportCode = airportCode;
        hanger = new ArrayList<>();
    }

    public String getAirportName(){
        return this.airportName;
    }

    public String getAirportCode(){
        return this.airportCode;
    }

    public int countPlanesInHangar(){
        return this.hanger.size();
    }

    public void putPlaneInHangar(Plane plane){
        this.hanger.add(plane);
    }

    public boolean getPlaneFromHanger(Plane plane){
        return this.hanger.remove(plane);
    }

    public void setFlight(String destination, AircraftType assignedPlane){

//        Plane newPlane = new Plane(assignedPlane,assignedPlane,0);

        getPlaneFromHanger(assignedPlane);
        flight = new Flight(assignedPlane,destination,airportName);
    }


}
