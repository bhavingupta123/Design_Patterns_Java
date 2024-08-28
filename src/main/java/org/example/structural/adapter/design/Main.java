package org.example.structural.adapter.design;

import org.example.structural.adapter.design.adapters.Adaptee;
import org.example.structural.adapter.design.adapters.Adapter;
import org.example.structural.adapter.design.our.existing.code.ITarget;

// exising code
public class Main {
    public static void main(String[] args) {
        ITarget target = new Adapter(new Adaptee());
        target.request();
    }
}
