package org.example.models;

public class EvParkingSpot extends BaseEntity{
    public Meter getMeter() {
        return meter;
    }

    public void setMeter(Meter meter) {
        this.meter = meter;
    }

    private Meter meter;
}
