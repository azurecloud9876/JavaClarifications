package com.main.exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchFunctionality {

    public static void main(String[] args) {

        File f = new File("C:\\Learn\\Intellij\\Java\\JavaClarifications");

        File folder = f;
        List<String> files = new ArrayList<String>();
        try {
            files = searchFiles(folder, "4646546465445", files);
            files.forEach(System.out::println);
        } catch (FileNotFoundException e1) {
            // you should tell the user here that something went wrong
        }

    }

    private static List<String> searchFiles(File file, String pattern, List<String> result) throws FileNotFoundException {

        if (!file.isDirectory()) {
            throw new IllegalArgumentException("file has to be a directory");
        }

        if (result == null) {
            result = new ArrayList<String>();
        }

        File[] files = file.listFiles();

        if (files != null) {
            for (File currentFile : files) {
                if (currentFile.isDirectory()) {
                    searchFiles(currentFile, pattern, result);
                } else {
                    Scanner scanner = new Scanner(currentFile);
                    if (scanner.findWithinHorizon(pattern, 0) != null) {
                        result.add(currentFile.getName());
                    }
                    scanner.close();
                }
            }
        }
        return result;
    }
}
