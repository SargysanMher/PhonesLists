package com.company;

public class Samsung extends Smartphone {
    public void name(){
        System.out.println("Samsung -  ");

    }
    public void camera(){
        System.out.println("    camera - \n" +
                "       108MP Wide-angle Camera\n" +
                "       PDAF, OIS\n" +
                "       Pixel size: 0.8μm (12MP 2.4μm)\n" +
                "       FOV: 85˚\n" +
                "       F.No (aperture): F1.8\n" +
                "       1/1.33\" image sensor size");
    }
    public void display(){
        System.out.println("    display - \n" +
                "       6.8\" edge Quad HD+ Dynamic AMOLED 2X\n" +
                "       Infinity-O Display (3088x1440)\n" +
                "       500 ppi\n" +
                "       HDR10+ certified\n" +
                "       120Hz refresh rate");
    }
}
