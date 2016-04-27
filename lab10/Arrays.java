import java.util.Scanner;
//Anni Weng
//hw12 April 27, 2016
//CSE02
//practice with arrays 
public class Arrays{
    public static void main(String[] args){
        int size = (int)(Math.random() * 6 + 5);//generate a random number
        String[] students = new String[size];//create a new array
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter " + size + " students names: ");
        for(int i = 0; i < size; i++){
            students[i] = myScanner.next();//prompt user to fill the array one by one
        }
        int[] midterm = new int[students.length];
        System.out.println("Here are the midterm grades of the " + size + " students above:");
        for (int i = 0; i < size; i++){
            midterm[i] = (int)(Math.random() * 101);//generate a random number from 0 to 100 to each array element
            System.out.println(midterm[i]);//print out the elements
        }
    }
}