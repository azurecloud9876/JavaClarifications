package com.structural.ProxyPattern.Exercise1;

import java.util.Arrays;
import java.util.List;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class InternetProxy implements ISP {

    private List<String> blockedSites = Arrays.asList("tiktok", "porno");

    @Override
    public String serverSite(String url) {
        logSite(url);
        if (blockedSites.contains(url)) {
            return "Naughty Boy, this site is blocked. Return to work!!!";
        }

        return new Etisalat().serverSite(url);
    }

    private void logSite(String url) {
       System.out.printf(" %s %n" , url);
    }
}
