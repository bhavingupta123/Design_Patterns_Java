package org.example.structural.adapter.design.adapters;

import org.example.structural.adapter.design.our.existing.code.ITarget;

public class Adapter implements ITarget {

    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void request() {
        adaptee.specificReques();
    }
}
