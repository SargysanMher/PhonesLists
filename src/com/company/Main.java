package com.company;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Smartphone[] smartphones = new Smartphone[3];
        smartphones[0]= new Iphone();
        smartphones[1]= new Samsung();
        smartphones[2]= new Xioami();
        for (Smartphone l : smartphones){
            l.name();
            l.camera();
            l.display();
        }
    }

}
