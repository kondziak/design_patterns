package org.example.visitor_pattern;

public class NameTransportVisitor implements TransportVisitor{
    @Override
    public void visit(Animal a) {
        System.out.printf("Animal kind: %s\n",a.getKind());
    }

    @Override
    public void visit(Person p) {
        System.out.printf("Person name: %s\n",p.getFirstName() + " " + p.getLastName());
    }

    @Override
    public void visit(Shipment s) {
        System.out.printf("Shipment designation: %s",s.getPrefix() + "-" + s.getSerialNumber());
    }
}
