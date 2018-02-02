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
public class Test {
    public static void main(String[] args) 
{
int i, j, k;
for(i=5;i>=1;i--)
{
for(j=1;j<i;j++)
{
System.out.print(" ");
}
for(k=5;k>=i;k--)
{
System.out.print("*");
}
System.out.println();
}
}
}