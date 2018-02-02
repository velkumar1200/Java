/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author velkumar.l
 */
public class GenericsInJava {
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList();
 
        list.add("JAVA");
 
        list.add(123);
 
        for (Object object : list)
        {
            //Below statement throws ClassCastException at run time
 
            String str = (String) object;       //Type casting
 
            System.out.println(str);
        }
    }
};