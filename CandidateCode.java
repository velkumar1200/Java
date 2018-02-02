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
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class CandidateCode {
    /*
     * Complete the function below.
    */
        public static String[] warehouseScalability(String[] input1,String[] input2)
    {
	   
//Write code here
       input1[0]="Manager";
       input1[1]="Ass.Manager";
       input1[2]="Technician";
       input2[0]="Monitoring";
       input2[1]="Guiding";
       input2[1]="Accoutant";
       if(input1.length == input2.length) {
           for(int i=0; i<=input1.length; i++)
           {
               System.out.println(input1[i] + "#" + input2[i]);
           }
           
       }
            return null;
       
    }
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        String[] output = null;
        int ip1_size = 0;
        ip1_size = Integer.parseInt(in.nextLine().trim());
        String[] ip1 = new String[ip1_size];
        String ip1_item;
        for(int ip1_i = 0; ip1_i < ip1_size; ip1_i++) {
            try {
        ip1_item = in.nextLine();
            } catch (Exception e) {
        ip1_item = null;
            }
            ip1[ip1_i] = ip1_item;
        }
        int ip2_size = 0;
        ip2_size = Integer.parseInt(in.nextLine().trim());
        String[] ip2 = new String[ip2_size];
        String ip2_item;
        for(int ip2_i = 0; ip2_i < ip2_size; ip2_i++) {
            try {
        ip2_item = in.nextLine();
            } catch (Exception e) {
        ip2_item = null;
            }
            ip2[ip2_i] = ip2_item;
        }
        output = warehouseScalability(ip1,ip2);
        for(int output_i=0; output_i < output.length; output_i++) {
            System.out.println(String.valueOf(output[output_i]));
        }
    }
}
