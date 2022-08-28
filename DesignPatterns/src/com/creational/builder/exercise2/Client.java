package com.creational.builder.exercise2;

public class Client {

    public static void main(String[] args) {

        Document doc = new DocumentBuilder()
                .withDocAuthor("Chethan")
                .withDocID("123456789")
                .withDocType("Fiction")
                .withDocName("Hellooooo")
                .build();
        System.out.println(doc.getDocAuthor());
        System.out.println(doc.getDocType());
        System.out.println(doc.getDocID());
        System.out.println(doc.getDocName());
    }


    private static Document testDoc() {
        var doc = new Document() {

        };
        return doc;
    }
}
