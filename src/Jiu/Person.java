package Jiu;

import Jiu.number.Customer;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {

    // prsf
    private static final Customer CUST = new Customer();

    // psf
    public static final int NUM = 1;

    // psfi
    public static final int NUM2 = 2;

    // psfs
    public static final String NATION = "china";


    public static void main(String[] args) {



        // sout
        System.out.println("Hello World");
        ArrayList List = new ArrayList();

        // fori
        String[] arr = new String[]{"Tom","Jerry","HanMeimei","LiLei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // iter
        for (String s : arr) {
            System.out.println(s);
        }

        // itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        // soutp
        System.out.println("args = " + Arrays.deepToString(args));

        // soutm
        System.out.println("Person.main");

        // soutv
        System.out.println("arr = " + arr);

        // list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {

        }

        // list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        // list.forr -- Reverse traversal
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }

    public void method(){


        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        // ifn -- if null
        if (list == null) {

        }

        // inn -- if not null
        if (list != null) {

        }

        // xxx.null / xxx.nn
        if (list == null) {

        }

        if (list != null) {

        }




    }

}





