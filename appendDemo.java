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
public class appendDemo {
public static void main(String args[]) { 
String s; 
int a = 42; 
StringBuffer sb = new StringBuffer(); 
s = sb.append("a = ").append(a).append("!").toString(); 
System.out.println(s); 
} 
}