/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Arrays;
/**
 *
// * @author velkumar.l
 */
public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2){
    char[] word1 = str1.toLowerCase().replaceAll("\\W", "").toCharArray();
    char[] word2 = str2.toLowerCase().replaceAll("\\W", "").toCharArray();
    Arrays.sort(word1);
    Arrays.sort(word2);
    return Arrays.equals(word1, word2);
    }
    public static void main(String[] args){
            System.out.println(areAnagrams("Silent", "Listen"));
    }
}