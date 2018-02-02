/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author velkumar.l
 */
public class StringNumeric {
    public static void main(String[] args) 
    {
        String s1 = " 8 sometext 7 3";
        String arr[] = s1.trim().split("[a-zA-Z ]+"); // Please note a space is there after Z
 
        int sum = 0;
 
        for (int i = 0; i < arr.length; i++)
            sum += Integer.parseInt(arr[i]);
 
        System.out.println(sum);
    }
}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */