package com.qf;

import java.io.IOException;

public class Shutdown {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("shutdown -s -t 3600");
//
        System.out.println();
//
//        runtime.exec("shutdown -a");
    }



}
