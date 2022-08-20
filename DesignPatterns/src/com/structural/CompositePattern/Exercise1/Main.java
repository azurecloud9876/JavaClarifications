package com.structural.CompositePattern.Exercise1;

public class Main {
    public static void main(String[] args) {
        Folder folder = new Folder("Folder 1 ");
        Folder folder2 = new Folder("Folder 2");
        File file = new File("file 1");
        File file2 = new File("file 2");

        folder.addChile(file);
        File file3 = new File("File 3");

        folder.addChile(file2);
        folder.addChile(folder2);
        folder2.addChile(file3);

        folder2.travers();
    }
}
