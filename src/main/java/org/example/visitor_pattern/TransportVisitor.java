package org.example.visitor_pattern;

public interface TransportVisitor {

    void visit(Animal a);

    void visit(Person p);

    void visit(Shipment s);
}
