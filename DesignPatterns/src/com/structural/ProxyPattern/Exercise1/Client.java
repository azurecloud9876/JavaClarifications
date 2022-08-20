package com.structural.ProxyPattern.Exercise1;

import java.util.Arrays;
import java.util.List;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class Client {

    public static void main(String[] args) {
        List<String> site = Arrays.asList("facebook", "twitch", "porno", "tiktok", "whatsapp");


        ISP internet = new InternetProxy();

        for(String string: site) {
            System.out.println(internet.serverSite(string));
        }
    }
}
