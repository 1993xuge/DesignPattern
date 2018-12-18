package com.example.buildermode;

import com.example.buildermode.compute.Director;
import com.example.buildermode.compute.builder.Builder;
import com.example.buildermode.compute.builder.MacbookBuilder;

public class myClass {

    public static void main(String[] args){
        Builder builder = new MacbookBuilder();
        Director director = new Director(builder);

        director.construct("华硕主板", "Retina显示器");

        System.out.println("Compute Info : " + builder.create());
    }
}
