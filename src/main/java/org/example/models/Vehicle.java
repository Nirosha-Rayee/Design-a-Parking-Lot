package org.example.models;

public class Vehicle extends BaseEntity{
    private VehicleType vehicleType;
    private String number; //licenseNumber

    public Vehicle(String number,VehicleType vehicleType) {
        super();
        this.number = number;
        this.vehicleType = vehicleType;

    }


    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

}
