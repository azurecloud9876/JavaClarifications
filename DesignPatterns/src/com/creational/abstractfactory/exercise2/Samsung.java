package com.creational.abstractfactory.exercise2;

public class Samsung implements Imobile {
    @Override
    public Iandroid GetAndroidPhone() {
        return new SamsungGalaxy();
    }

    @Override
    public Iios GetIosPhone() {
        return new Iphone();
    }
}
