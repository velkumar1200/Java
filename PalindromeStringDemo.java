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
public class PalindromeStringDemo {
    public static void main(String[] args)
    {
        String reverse="";
        System.out.println("Enter the input String");
        Scanner scan=new Scanner(System.in);
        String original=scan.nextLine();
        for(int i=original.length()-1;i>=0;i--)
        {
            reverse = reverse+original.charAt(i);
            
        }
        if(original.equals(reverse))
        {
            System.out.print("Given String is palindrome");
        }
        else
        {
            System.out.print("Given String is not palindrome");
        }
    }
}
