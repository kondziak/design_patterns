package org.example.visitor_pattern;

public class PriceTransportVisitor implements TransportVisitor{
    @Override
    public void visit(Animal a) {
        System.out.printf("Price per kilometer for a animal: %.2f PLN\n", a.getWeight() * 0.2);
    }

    @Override
    public void visit(Person p) {
        int price = 6;
        if (p.isRegularCustomer()) {
            price /= 2;
        }
        System.out.printf("Price per kilometer for a person: %d PLN\n", price);
    }

    @Override
    public void visit(Shipment s) {
        int price = 2;
        if (s.isLarge()) {
            price *= 3;
        }
        System.out.printf("Price per kilometer for a shipment: %d PLN\n", price);
    }
}
