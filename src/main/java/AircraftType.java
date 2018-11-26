public enum AircraftType {
    BORING747(220),
    EREBUS666(66),
    BORING11(100),
    BORINGBEDLINER(600),
    CESPITMICRO(5),
    EREBUS32(32);

    private final int capacity;

    AircraftType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }
}
