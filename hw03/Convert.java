import java.util.Scanner;

//Anni Weng
//hw02 Feb 17, 2016
//CSE02
//Convert meter to inch

public class Convert{
    			// main method required for every Java program
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );//declare an instance of the Scanner object
        System.out.print("Enter the distance in meters: ");//print"Enter the distance in meters: ""
        double meters = myScanner.nextDouble();//accept user's input - meter
        double inches = meters * 39.3701;//convert meter to inch
        System.out.println (meters + " meters is " + inches + " inches.");//print out result

}  //end of main method   
  	} //end of class