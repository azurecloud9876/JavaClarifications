package com.structural.CompositePattern.Exercise1;

import java.util.ArrayList;

public class Folder extends Component {
    private final String value;
    private final ArrayList<Component> componentsList = new ArrayList<>();

    public Folder(String value) {
        this.value = value;
    }

    @Override
    public void addChile(Component c) {
        componentsList.add(c);
    }

    @Override
    public void travers() {
        System.out.println("Folder:  " + value);
        for (Component c: componentsList) {
            c.travers();
        }
    }
}
