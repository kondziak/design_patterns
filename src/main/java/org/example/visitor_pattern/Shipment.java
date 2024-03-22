package org.example.visitor_pattern;

public class Shipment implements Transportable {

    private String prefix, serialNumber;
    private boolean isLarge;

    public Shipment(String prefix, String serialNumber, boolean isLarge) {
        this.prefix = prefix;
        this.serialNumber = serialNumber;
        this.isLarge = isLarge;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean isLarge() {
        return isLarge;
    }

    @Override
    public void accept(TransportVisitor t) {
        t.visit(this);
    }
}
