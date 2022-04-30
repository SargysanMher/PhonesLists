package com.company;

public class Iphone extends Smartphone{
    public void name(){
        System.out.println("Iphone");

    }
    public void camera(){
        System.out.println("    camera - \n" +
                "        Pro 12MP camera system: Telephoto, Wide, and Ultra Wide cameras\n" +
                "        Telephoto: ƒ/2.8 aperture\n" +
                "        Wide: ƒ/1.5 aperture\n" +
                "        Ultra Wide: ƒ/1.8 aperture and 120° field of view\n" +
                "        3x optical zoom in, 2x optical zoom out; 6x optical zoom range\n" +
                "        Digital zoom up to 15x");
    }
    public void display(){
        System.out.println("    display - \n" +
                "       Super Retina XDR display with ProMotion\n" +
                "       6.7-inch (diagonal) all-screen OLED display\n" +
                "       2778-by-1284-pixel resolution at 458 ppi");
    }
}
