//Anni Weng
//lab 03 - Check
//CSE 02, 2016
//Our goal is to prompt user inout check amount, tip percentage, and the number of ways the check will be split
//Then calculate how much person in the group needs to spend

import java.util.Scanner;
public class Check{ // one class - Check
        public static void main(String[] args){ // one main method
            Scanner myScanner = new Scanner(System.in); //declare an instance of the Scanner object
            System.out.print("Enter the original cost of the check in the form xx.xx: ");
            double checkCost = myScanner.nextDouble();//accept check amount
            System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
            double tipPercent = myScanner.nextDouble();//accept tip percentage
            tipPercent /=100; //Convert the percentage into a decimal value
            System.out.print("Enter the number of people who went out to dinner: ");
            int numPoeple = myScanner.nextInt();//accept number of people
            double totalCost; //set up variable of total cost
            double costPerPerson;//set up variable of cost per person
            int dollars, dimes, pennies;//set up intger variables
            totalCost = checkCost * (1 + tipPercent);//calculate total cost
            costPerPerson = totalCost / numPoeple;//calculate cost per person
            //get the whole amount, dropping decimal fraction
            dollars=(int)costPerPerson;//calculate dollar
            dimes=(int)(costPerPerson * 10) % 10;//calculate diems
            pennies=(int)(costPerPerson * 100) % 10;//calculate pennies
            System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);//print out the result

        }
}