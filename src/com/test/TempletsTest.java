package com.test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author mrq
 * @create 2020-03-29 14:08
 */
public class TempletsTest {

    //模板六 prsf
    private static final HelloWord hello =new HelloWord();
    //变形  psf
    public static final int NUM =1;
    //变形 psfi
    public static final int num2 =2;
    // 变形  psfs
    public static final String A ="sss";


    //模板1 psvm
    public static void main(String[] args) {
        //模板二 sout
        System.out.println("hello");
        //变形 soutp soutm  soutv  xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TempletsTest.main");
        int num1=10;
        int num2=20;
        System.out.println("num2 = " + num2);
        System.out.println("'num1' = " + num1);
        //模板3 fori
        String[] arr = new String[]{"tom","jerry","mrq"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形 iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }
        //模板四 list.for
        ArrayList list = new ArrayList();

        list.add(123);
        list.add(125);
        list.add(124);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形： list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形 list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }
    public void method(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(125);
        list.add(124);
        //模板五 ifn
        if (list == null) {
            
        }
        //变形 inn
        if (list != null) {
            
        }
        //变形: xxx.nn   xxx.null
        if (list == null) {

        }


    }
    public void test(){
      /**
      *客户id
      */
       int a =2;




    }
}
