/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author phoeb
 */
import java.io.*;

public class fileTest {
    public static void main(String[] args) 
                throws FileNotFoundException{
        PrintWriter outputFile = new PrintWriter("testtext3.txt");
        outputFile.println("Test this now : ");
        outputFile.println(9923074);
        outputFile.println("read this now as a test");
        outputFile.close();
    }
    
}
