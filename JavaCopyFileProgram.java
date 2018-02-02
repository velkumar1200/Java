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
import java.io.File; 
import java.io.IOException;
import java.nio.file.Files;
 
public class JavaCopyFileProgram
{    
    public static void main(String[] args) throws IOException
    {
        File sourceFile = new File("C:/Users/Velkumar.L/Desktop/Hello.txt");
         
        File destFile = new File("C:/Users/Velkumar.L/Desktop/des.csv");
         
        Files.copy(sourceFile.toPath(), destFile.toPath());
         
        System.out.println("Success");
    }
}