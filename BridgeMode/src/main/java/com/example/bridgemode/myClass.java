package com.example.bridgemode;

import com.example.bridgemode.image.BMPImage;
import com.example.bridgemode.image.Image;
import com.example.bridgemode.impl.ImageImpl;
import com.example.bridgemode.impl.LinuxImpl;
import com.example.bridgemode.impl.WindowsImpl;

public class myClass {

    public static void main(String args[]) {
        Image image;
        ImageImpl imageImpl;

        image = new BMPImage();
        image.setImageImpl(new WindowsImpl());
        image.parseFile("haha");

        image.setImageImpl(new LinuxImpl());
        image.parseFile("niubi");


    }
}
