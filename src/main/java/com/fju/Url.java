package com.fju;

import java.net.MalformedURLException;
import java.net.URL;

public class Url {


    public static void main(String[] args) throws MalformedURLException {
        URL bank=null;
        try{
            bank=new URL("http://www.google.com");
            System.out.println("work?");
    }catch (MalformedURLException e){
            System.err.println("false");
            System.out.println("exception"+e.getMessage());
            throw new MalformedURLException("invalid cry");
        }


    }


}
