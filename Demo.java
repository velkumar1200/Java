/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
/**
 *
 * @author Velkumar.L
 */
public class Demo {
    public static void main(String[] args)
    {
        File src = new File("C:/Users/Velkumar.L/Desktop/isro/20123054_ApplicationForm.pdf");
        File des = new File("C:/Users/Velkumar.L/Desktop/Desgination.pdf");
        FileInputStream inStream = null;
        FileOutputStream outStream = null;
        try
        {
            inStream = new FileInputStream(src);
             
            outStream = new FileOutputStream(des);
             
            byte[] buffer = new byte[1024];
             
            int length;
             
            while ((length = inStream.read(buffer)) != -1) 
            {
                outStream.write(buffer, 0, length);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                inStream.close();
                 
                outStream.close();
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
         
        System.out.println("Success");
    }
}