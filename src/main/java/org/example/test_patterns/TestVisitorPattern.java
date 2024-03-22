package org.example.test_patterns;

import org.example.visitor_pattern.*;

import java.util.Arrays;
import java.util.List;

public class TestVisitorPattern {

    public static void testVisitorPattern() {
        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);
        transportableList.forEach(transportable -> transportable.accept(new PriceTransportVisitor()));
        transportableList.forEach(transportable -> transportable.accept(new NameTransportVisitor()));
    }
}
