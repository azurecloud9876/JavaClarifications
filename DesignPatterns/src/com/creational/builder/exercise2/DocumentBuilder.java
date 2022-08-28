package com.creational.builder.exercise2;

public class DocumentBuilder extends AbstractBuilder<Document, DocumentBuilder> {

    private final Document doc = new Document();

    //private String test;
    DocumentBuilder() {
        availableBean = doc;
    }

    public DocumentBuilder withDocName(String str) {
        doc.setDocName(str);
        return this;
    }

    public DocumentBuilder withDocAuthor(String str) {
        doc.setDocAuthor(str);
        return this;
    }

    public DocumentBuilder withDocID(String str) {
        doc.setDocID(str);
        return this;
    }

    public DocumentBuilder withDocType(String str) {
        doc.setDocType(str);
        return this;
    }

}
