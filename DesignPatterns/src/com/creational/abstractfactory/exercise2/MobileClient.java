package com.creational.abstractfactory.exercise2;

public class MobileClient {
    Iandroid androidPhone;
    Iios IosPhone;

    public MobileClient(Imobile facotry) {
        androidPhone = facotry.GetAndroidPhone();
        IosPhone = facotry.GetIosPhone();

    }

    public String getAndroidPhone() {
        return androidPhone.getModelDetails();
    }

    /*public String setAndroidPhone(Iandroid androidPhone) {
        return androidPhone.getModelDetails();
    }*/

    public String getIosPhone() {
        return IosPhone.getModelDetails();
    }

}
