import java.util.Scanner;

//Anni Weng
//hw02 Feb 17, 2016
//CSE02
//Use dimension of pyramid to calculate the volume
public class Pyramid{
    			// main method required for every Java program
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );//declare an instance of the Scanner object
        System.out.print("The square side of the pyramid is (input length): ");// let user input the square side of the pyramid
        double length = myScanner.nextDouble();//accept the input
        System.out.print("The height of the pyramid is (input height): ");// let user input the height of the pyramid
        double height = myScanner.nextDouble();//accept the input
        double volume = length * length * height / 3;//calculate the volume using the formula V = lwh/3
        System.out.println ("The volume inside the pyramid is: " + volume);//print out the result
    }
}