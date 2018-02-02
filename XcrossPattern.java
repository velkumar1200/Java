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
public class XcrossPattern {
    
   public static void main(String[] args) {
//      int x = 5;
//      char[] chars = new char[x];
        char[] chars = {'P', 'R', 'O', 'G', 'R', 'A', 'M'};
        int length = chars.length;
        System.out.println(length);
        for (int i = 0; i < length; i++) {
//          chars[i] = 's';
//          chars[x - 1 - i] = 's';
            for (int j = 0; j < length; j++) {   
                if (j == i || j == (length- 1 - i)) {
                    System.out.print(chars[j]);
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
