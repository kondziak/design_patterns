package org.example.visitor_pattern;

public interface Transportable {
    void accept(TransportVisitor t);
}
