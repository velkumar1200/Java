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
public class StringGetBytestExample{  
public static void main(String args[]){  
String s1="ABCDEFG";  
byte[] barr=s1.getBytes();  
for(int i=0;i<barr.length;i++){  
System.out.println(barr[i]);  
}  
}}  