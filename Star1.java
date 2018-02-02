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
public class Star1 {
public static void main(String[] args) 
{
 int i, j, k;
for(i=5;i>=1;i--)
{
for(j=5;j>i;j--)
{
System.out.print(" ");
}
for(k=1;k<(i*2);k++)
{
System.out.print("*");
}
System.out.println();
}
for(i=1; i<=5; i++)
{
for(j=4; j>=i; j--)
{
System.out.print(" ");
}
for(k=1; k<=(2*i-1); k++)
{
System.out.print("*");
}
System.out.println("");
}
}}