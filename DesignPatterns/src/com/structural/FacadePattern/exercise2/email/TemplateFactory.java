package com.structural.FacadePattern.exercise2.email;


public class TemplateFactory {

	public static Template createTemplateFor(TemplateType type) {
        if (type == TemplateType.Email) {
            return new OrderEmailTemplate();
        }
        throw new IllegalArgumentException("Unknown TemplateType");

    }
}
