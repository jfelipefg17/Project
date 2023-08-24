package Enum;

public enum TypeAirPlane {

    BOEING737("boeing-737"),BOEING747("boeing-747"),AIRBUSA320("Airbus-A320");

    private String airPlane;

    TypeAirPlane(String airPlane) {
        this.airPlane = airPlane;
    }

    public String getAirPlane() {
        return airPlane;
    }

    public void setAirPlane(String airPlane) {
        this.airPlane = airPlane;
    }

    @Override
    public String toString() {
        return "TypeAirPlane{" +
                "airPlane='" + airPlane + '\'' +
                '}';
    }
}
