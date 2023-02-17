/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csc370hw3;
import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Jeffrey Koeferl
 */
public class CSC370HW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] array = {"/", "/usr/", "/usr/local/", "/usr/local/bin/", "/games/", "/games/snake/", "/homework/", "/temp/downloads/"};
        
        Dirsort(array);
        
        System.out.print("{");
        
        int l = array.length;
        
        for (int i = 0; i < l; i++) 
        {System.out.print ("\"" + array[i] + "\"" + ", ");}
        
        System.out.print("}");
    }
    public static void Dirsort(String[] dirs) 
    {
        for (int i = 0; i < dirs.length; i++) {
            int count = -1, x = 0;
            while (x >= 0) {
                count++;
                x = dirs[i].indexOf ("/", x);
                
                if (x != -1) 
                    x++;
            }
            
            dirs[i] = Character.toString((char) count) + dirs[i];
        }
        Arrays.sort(dirs);
        
        for (int i = 0; i < dirs.length; i++) 
            dirs [i] = dirs[i].substring(1);
    }
}

    
    
    

