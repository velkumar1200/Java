/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
/**
 *
 * @author velkumar.l
 */
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args)
    {
        String original, reverse = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String");
        original = scan.nextLine();
        int length = original.length();
                for(int i = length - 1; i >= 0; i--)
           
                reverse = reverse + original.charAt(i);
                System.out.println("Reverse to entered String is :" + reverse);
    } 
 }