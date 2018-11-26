import java.util.ArrayList;

public class Plane {
    private String airline;
    private int passengers;
    private AircraftType aircraftType;
    private int capacity;
    private String aircraft;

    public Plane(AircraftType aircraftType,String airline,int passengers){
        this.aircraftType = aircraftType;
        this.airline = airline;
        this.passengers = passengers;
    }

    public int getPassengers(){
        return this.passengers;
    }

    public void addPassengers(int passengers){
        int totalPassengers = this.passengers + passengers;
        if (this.aircraftType.getCapacity() > totalPassengers){
            this.passengers+=passengers;
            System.out.println("Added "+passengers+" passengers to plane");
        } else {
            int capacityLeft = this.aircraftType.getCapacity() - this.passengers;
            int excessPassengers = passengers - capacityLeft;

            this.passengers+=capacityLeft;
            System.out.println("Added "+capacityLeft+" to plane, left "+excessPassengers+" behind.");
        }

    }

    public void emptyPlane(){
        this.passengers = 0;
    }

    public String getAirline(){
        return this.airline;
    }
}
