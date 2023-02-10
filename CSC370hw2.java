 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csc370hw2;
import java.util.*;
import java.util.Random;
/**
 *
 * @author Jeffrey Koeferl
 */
public class CSC370hw2 {
    
    public static String rights(int[] userArray, int minPermission)
    {
        String fString = "";
        for (int i = 0; i < userArray.length;i ++)
        {
        if(userArray[i] < minPermission)
        {
        fString += "D";
        }
        else
        {
        fString += "A";}
        }
    return fString;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  int rand;
   Random rand = new Random();
    int users = rand.nextInt(51);
    System.out.println("The number of users is "+users);
    int[] userArray;
    userArray = new int[users];
    for (int i = 0; i < users; i++)
    {   
        
        int userLevel = rand.nextInt(101);
        userArray[i] = userLevel;
    }
    System.out.println(Arrays.toString(userArray));
    
    
    int acessLevel = rand.nextInt(101);
    System.out.println(acessLevel);
    System.out.println(rights(userArray, acessLevel));
    }
    
}
