package com.structural.CompositePattern.Exercise1;

public class File extends Component {

    private final String value;

    public File(String value) {
        this.value = value;
    }

    @Override
    public void addChile(Component C) {

    }

    @Override
    public void travers() {

        System.out.println("File : " + value);
    }
}
