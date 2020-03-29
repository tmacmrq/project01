package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;


public class HelloWord {

    private static int num;

    public HelloWord() {
    }

    private final static  int INITIAL_SIZE =10;
    public static void main(String[] args) {
        //region Description
        ArrayList list1 = getArrayList();

        //endregion
        list1.add(0,2);
          jjjjj();

    }

    public static ArrayList getArrayList() {
        System.out.print("Hello  World");
        ArrayList list1 = new ArrayList();
        String a="jjj";
        Date date = new Date();
        return list1;
    }


    public static void jjjjj() {
        num = 10;
        try {
            FileInputStream fis =new FileInputStream("hello.text");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
