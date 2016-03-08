import java.util.Scanner;
//Anni Weng
//hw06 March 7, 2016
//CSE02
//List out Fibonacci numbers
public class Fibonacci{
    public static void main(String[] args) {
        Scanner myscanner = new Scanner( System.in);
            int a1;//set an integer "a1"
            do{// set up a do while loop
                System.out.print("Enter the first number in the sequence: ");// request input
                while(!myscanner.hasNextInt()) {//set up while loop conditioning on the input is not an intger
                    myscanner.next();
                    System.out.print("Enter the first number in the sequence: ");//re-enter input
                }
                a1 = myscanner.nextInt();//accept input
            }while(a1 <= 0);//end of the loop

            int a2;//set an integer "a2"
            do{// set up a do while loop
                System.out.print("Enter the second number in the sequence: ");// request input
                while(!myscanner.hasNextInt()) {//set up while loop conditioning on the input is not an intger
                    myscanner.next();
                    System.out.print("Enter the second number in the sequence: ");//re-enter input
                }
                a2 = myscanner.nextInt();//accept input
            }while (a2 <= 0);//end of the loop

            int number; //set an integer "number"
            do{// set up a do while loop
                System.out.print("How many custom Fibonacci numbers should be printed? ");// request input
                while(!myscanner.hasNextInt()) {//set up while loop conditioning on the input is not an intger
                    myscanner.next();
                    System.out.print("How many custom Fibonacci numbers should be printed? ");//re-enter input
                }
                number = myscanner.nextInt();//accept input
            }while (number <= 0); //end of the loop
        int counter = 0;// integer named "counter"
        System.out.print("The numbers are: " + a1 + ", " + a2 + ", ");//print a1 a2
        while(counter + 3 < number){// if [counter + 2(a1,a2)] samller than the total numer needed
            int a3 = a1 + a2;//sum of the previous two numbers
            a1 = a2;//convert value
            a2 = a3;//convert value
            System.out.print(a3 + ", ");//print out sums
            counter ++;//counter + 1 for each loop 
        }
            int a4 = a1 +a2;//set the last value
            System.out.println(a4 + ".");//print the last value
    }
}

       


