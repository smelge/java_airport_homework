import java.util.Random;

public class Flight {
    private AircraftType assignedPlane;
    private String flightNumber;
    private String flightDestination;
    private String flightDepart;
    private int tickets;


    public Flight(AircraftType assignedPlane,String flightDestination,String flightDepart){
        this.assignedPlane = assignedPlane;
        this.flightDestination = flightDestination;
        this.tickets = tickets;

        Random rand = new Random();
        this.flightNumber = flightDepart + rand.nextInt((90000-1000)+1);
//        System.out.println("Created Flight: "+flightNumber);
    }

    public String getFlightDestination(){
        return this.flightDestination;
    }

    public int getPlaneCapacity(){
        return assignedPlane.getCapacity();
    }
}
