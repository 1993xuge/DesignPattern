package com.example.liabilitymode;

import com.example.liabilitymode.handler.DeptManager;
import com.example.liabilitymode.handler.GeneralManager;
import com.example.liabilitymode.handler.Handler;
import com.example.liabilitymode.handler.ProjectManager;

public class myClass {

    public static void main(String[] args){

        Handler h1 = new GeneralManager();
        Handler h2 = new DeptManager();
        Handler h3 = new ProjectManager();

        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        String test1 = h3.handleRequest("张三", 30000);
        System.out.println("test1 = " + test1);
    }
}
