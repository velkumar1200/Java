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
public class DuplicatesInArray 
{   
    public static void main(String[] args) 
    {
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
 
        for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( strArray[i].equals(strArray[j]) )
                {
                    System.out.println("Duplicate Element is : "+strArray[j]);
                }
            }
        }
    }    
}