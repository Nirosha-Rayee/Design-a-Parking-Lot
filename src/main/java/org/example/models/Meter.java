package org.example.models;

import java.util.Date;

public class Meter extends BaseEntity{
    private Date startTime;
    private Date endTime;
    private int ratePerUnit;
    private int unitConsumed;

    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public int getRatePerUnit() {
        return ratePerUnit;
    }
    public void setRatePerUnit(int ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }
    public int getUnitConsumed() {
        return unitConsumed;
    }
    public void setUnitConsumed(int unitConsumed) {
        this.unitConsumed = unitConsumed;
    }


}
