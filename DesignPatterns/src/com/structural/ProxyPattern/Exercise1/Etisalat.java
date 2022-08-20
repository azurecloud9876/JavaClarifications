package com.structural.ProxyPattern.Exercise1;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class Etisalat implements ISP {

    private int browsingSpeed = 10;

    @Override
    public String serverSite(String url) {
        return String.format("https://%s.com", url);
    }


    public int getBrowsingSpeed() {
        return browsingSpeed;
    }

    public void setBrowsingSpeed(int browsingSpeed) {
        this.browsingSpeed = browsingSpeed;
    }
}
