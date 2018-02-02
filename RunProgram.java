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
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Runs another application from a Java program
 */
public class RunProgram {

    public static void main(String[] args) {
        RunProgram rp = new RunProgram();
        rp.printIPInfo();
    }

    /**
     * Print complete IP address info using the command ipconfig /all
     */
    private void printIPInfo() {
        Runtime rt = Runtime.getRuntime();
        String[] commandAndArguments = {"ipconfig","/all"};
        try {
            Process p = rt.exec(commandAndArguments);
            String response = readProcessOutput(p);
            System.out.println(response);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Reads the response from the command. Please note that this works only
     * if the process returns immediately.
     * @param p
     * @return
     * @throws Exception 
     */
    private String readProcessOutput(Process p) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String response = "";
        String line;
        while ((line = reader.readLine()) != null) {
            response += line+"\r\n";
        }
        reader.close();
        return response;
    }

    void openNotePad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}