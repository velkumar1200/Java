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
public class FibonacciSeries {
    public static void main(String[] args)
    {
        int n1,n2,n3,i,count;
        count=20;
        n1=0;
        n2=1;
        System.out.print(n1+" "+n2);
        for(i=2;i<=count;i++)
        {
        n3=n1+n2;
        System.out.print(" "+n3);
        n1=n2;
        n2=n3;
        }
    }
    }
