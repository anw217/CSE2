import java.util.Scanner;
//Anni Weng
//hw06 March 7, 2016
//CSE02
//Caculate factorial
public class RunFactorial{
    public static void main(String[] args) {
        Scanner myscanner = new Scanner( System.in);//declare an instance of the Scanner object
        int input;//set an integer named input
        boolean firstTime = true;// set a boolean named frisTime
        do{//wet up a do while loop
            if(firstTime){//if firsTime is true
            System.out.print("Enter a number between 9 and 16: ");//request input
            firstTime = false;
            }else{
            System.out.print("Invalid input, enter again\n"); //notify user the input is not correct
            }
            while(!myscanner.hasNextInt()) {//set up a while loop
                myscanner.next();
                System.out.print("Invalid input, enter again!\n");//incorrect input, do the loop again
            }
            input = myscanner.nextInt();//accept the input
        }while(input < 9 || input > 16);//if the input satisfies the condition, do do loop
  
            int result = 1;//set an integer named result
            int i =1;//set a integer named i
        while(i <= input){//set up a while loop
            result = result * i;
            i++
            ;
        }
        System.out.println("Input accepted: \n" + input + "! = " + result);
    }
}
        
                