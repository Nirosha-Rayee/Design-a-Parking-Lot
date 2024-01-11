package org.example.models;

public class Gate extends BaseEntity{
    private int gateNumber;
    private GateType gateType;
    private GateStatus Status;
    private Operator operator;

    public int getGateNumber() {
        return gateNumber;
    }
    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }
    public GateType getGateType() {
        return gateType;
    }
    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
    public GateStatus getStatus() {
        return Status;
    }
    public void setStatus(GateStatus status) {
        Status = status;
    }
    public Operator getOperator() {
        return operator;
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }


}
