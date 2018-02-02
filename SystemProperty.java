/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Velkumar.l
 */
import java.util.Properties;
public class SystemProperty {
    public static void main (String arg[])
    {
    Properties pros = System.getProperties();
      pros.list(System.out);
  
      // Get a particular System property given its key
      // Return the property value or null
      System.out.println(System.getProperty("java.home"));
      System.out.println(System.getProperty("java.library.path"));
      System.out.println(System.getProperty("java.ext.dirs"));
      System.out.println(System.getProperty("java.class.path"));
    
    
    }
    
}
