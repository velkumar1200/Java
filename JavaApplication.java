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
import java.util.Scanner;
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int no, rev=0,r,a;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any no:");
        no=scan.nextInt();
        a=no;
        while(no>0)
        {
        r=no%10;
        rev=rev*10+r;
        no=no/10;
        }
        System.out.println("Reverse: " + rev);
    }
    
}
