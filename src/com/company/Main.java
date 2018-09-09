package com.company;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
//import java.io.IOException;
<<<<<<< HEAD
// xax
=======

>>>>>>> parent of 106df13... xa
public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        //public static print trow Exception {2
            System.out.println("HELLO People!!!");
            System.out.println("Please, write your age");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            //String b = reader.readLine();
            int a = Integer.parseInt(reader.readLine());
            System.out.println("Oh my mother!!! Your age is " + a);


    }
}
