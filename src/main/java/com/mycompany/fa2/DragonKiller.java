package com.mycompany.fa2;
import javax.swing.JOptionPane;     // Using JOptionPane for user inputs & outputs
import java.util.*;                 // Used for error handeling
import java.lang.*;

public class DragonKiller {
    // Using public global variables to use throughout the program
    public static String userName;
    public static String newString;
    public static String str;
    public static int arrayLength;
    public static int searchingValue;
    public static int findDragon;
    public static int[] arrayDragon;
    public static String result;
    public static String[] args;    // Set to be able to rerun main method.
    
    public static void main(String[] args){
        // Setting global variable values, to use multiple times
        newString = "";
        arrayLength = 0;
        findDragon = 0;
        result = "";
        
        JOptionPane.showMessageDialog(null, "Wolcome to Dragon Killer:\n" + "\nYour full name will be used to \n" 
                + "create a range of odd numbers between 10 and 50.\n" + "\nYou will then be asked for an odd value between 10 and 50.\n" 
                + "\nThe value you enter wil then be compared to the numbers \n" + "in the list that was created from your name.\n" 
                + "\nIf you got one of the numbers correct, it will be displayed \n" 
                + "as '0', witch tells you that you have killed that dragon.");
        
        // Gets full name of user
        userName = JOptionPane.showInputDialog("Please enter your full name:");    
        
        RemoveSpace();
        insertionSort();
    }
    // Method that removes spaces between user "FirstName" & "Surname"
    public static void RemoveSpace(){
        // Creating array of string length
        char[] ch = new char[userName.length()];
        
        for (int i = 0; i < userName.length(); i++){
            // Copy character by character into array
            ch[i] = userName.charAt(i);
            // Convert character back to string
            str = String.valueOf(ch[i]);
            
            try{                
                if(ch[i] == ' '){
                    // Removes spaces
                    newString += "";
                }else{
                    // Check to see if there is any integer in the string
                    Integer.valueOf(str);
                    // Error message if there are any intigers in the string
                    JOptionPane.showMessageDialog(null, "You have entered an invalid vriable type. \nPlease try again!");
                    // Restarts program
                    main(args);
                }                
            }catch(NumberFormatException e){
                newString += ch[i];
            }
        }
        
        // Setting arrayDragon size
        arrayLength = newString.length();
        arrayDragon = new int[arrayLength];
        
              
        for (int i = 0; i < arrayLength; i++){
            // Generate random number
            Random value = new Random();
            int num = value.nextInt(40) + 10;        
            
            // Check to make sure it is odd
            if(num == 50){
                num -= 1;
            }else if(num % 2 == 0){
                num += 1;
            }
            
            // Populate the arrayDragon with the random numbers
            arrayDragon[i] = num;
        }
    }
    // Method that asks user for a value within range, to search through the array for a match
    // The method then turns that value into a "0"
    public static void insertionSort(){
        try{
            // Gets value to search with
            searchingValue = Integer.valueOf(JOptionPane.showInputDialog("Please enter an odd number between 10 and 50:"));
            
            // Check to see if findDragon is within range or even number
            if (searchingValue < 10 || searchingValue > 50 || searchingValue % 2 == 0){
                throw new NumberFormatException("e");
            }            
            
            // Loop to find user value in arrayDragon
            for (int i = 0; i < arrayLength; i++){
                if(searchingValue == arrayDragon[i]){
                    arrayDragon[i] = findDragon;
                }
                result += String.valueOf(arrayDragon[i]) + " ";
            }
            
            // Display results
            JOptionPane.showMessageDialog(null, "Your results are:\n" + result);
        }catch (NumberFormatException e){
            // Error if the value is not between 10 and 50, or an even number
            JOptionPane.showMessageDialog(null, "You did not enter a valid odd number between 10 and 50!\nPlease try again!");
            insertionSort();
        }
    }
}
