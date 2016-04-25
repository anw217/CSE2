//Anni Weng
//hw12 April 24, 2016
//CSE02
//Make a twist by using loops
import java.util.Scanner;
public class TwistGenerator{
    public static void main(String [] arg){
            int input;//set an integer named "input", standing for twist length
            Scanner myscanner = new Scanner(System.in);
            do{// set up a do while loop
                System.out.print("Enter a positive integer: ");// request input
                while(!myscanner.hasNextInt()) {//set up while loop conditioning on the input is not an intger
                    myscanner.next();
                    System.out.print("Invalid, please enter a positive integer: ");//re-enter input
                }
                input = myscanner.nextInt();//accept input
            }while(input <= 0);//end of the loop
            for(int i = 1; i <= 3; i++){
                int j = 0;
                if(i == 1){// for the first line
                    for(j = 1; j <= input; j++){
                        if(j % 3 == 1){
                            System.out.print("\\");// print \ at the proper postion on the first line
                        }
                        else if(j % 3 == 0){
                            System.out.print("/");// print / at the proper postion on the first line
                        }
                        else{
                            System.out.print(" ");// leave blank at the proper postion on the first line
                        }
                    }
                    System.out.print("\n");//start another line
                }
                else if(i == 2){// for the second line
                    for(j = 1; j <= input; j++){
                        if(j % 3 == 2){
                            System.out.print("X");// print X at the proper postion on the first line
                        }
                        else{
                            System.out.print(" ");// leave blank at the proper postion on the first line
                        }
                    }
                    System.out.print("\n");//start another line
                }
                else{// third line
                    for(j = 1; j <= input; j++){
                        if(j % 3 == 1){
                            System.out.print("/");// print / at the proper postion on the first line
                        }
                        else if(j % 3 == 0){
                            System.out.print("\\");// print \ at the proper postion on the first line
                        }
                        else{
                            System.out.print(" ");// leave blank at the proper postion on the first line
                        }
                    }
                }
            }
    }
}