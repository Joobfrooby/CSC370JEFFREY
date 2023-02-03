/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csc370hw1;
package javaapplication32;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Jeffrey Koeferl
 */


public class CSC370HW1 {
public static String RunLengthEncode(String str)
{
    System.out.println("this function is being called");
    String strF = "STR =: ";
    int length = str.length();
    System.out.println(length);
    
    for(int i = 0;i < length; i++)
    {
        System.out.println("in for loop");
        
        int sameCount = 1;
        int j = 1;
        while((j+i)!=length &&  str.charAt(i)==str.charAt(i+j) )
        {
            System.out.println("in while loop");
            sameCount++;
            j++;
        }
        if(sameCount <= 4)
        {
        strF+=str.charAt(i);
        }
        if(sameCount > 4)
        {
            
        strF+="/";
        if(sameCount < 10)
        {strF+="0";}
        strF+=sameCount;
        strF+=str.charAt(i);
        sameCount-=1;
            i+=(sameCount);    
        }
        System.out.println(strF);
        System.out.println(i);
        }
    
    
 
    return strF;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    System.out.println("Please enter string to be encoded ");
    Scanner keyboard = new Scanner(System.in);
    String str = keyboard.next();
    System.out.println("You entered");
    System.out.println(str);
    System.out.println(str.length());
    
    System.out.println(RunLengthEncode(str));
    
    
    }
    
    
    
    
    
}
