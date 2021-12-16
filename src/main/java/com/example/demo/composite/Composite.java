package com.example.demo.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private final List<Component> children = new ArrayList<>();

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
    public void delete(Component component) {
        this.children.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Component obj : children) {
            obj.operation();
        }
    }
}
