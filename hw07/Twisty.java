//Anni Weng
//hw07 March 21, 2016
//CSE02
//Twisty

import java.util.Scanner;
public class Twisty{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double length = -1;//set length;
        boolean acceptance1 = true;
        do{
            if(acceptance1){
                System.out.print("Input your desired length: ");
                acceptance1 = false;
            }// prompt user to enter length and go to the next while statement
            else{
                System.out.println("Error: please type in a positive integer that is <= 80.");
                System.out.print("Input your desired length: ");//reenter length
            }
            while(!myScanner.hasNextInt()){
                myScanner.next();// read the length in any format
                System.out.println("Error: please type in a positive integer.");
                System.out.print("Input your desired length: ");
            }//if it's not an integer, ask user to reenter
            length = myScanner.nextInt();// read the length in integer format
        }while(length <= 0 || length > 80);// length should between 0 and 80
        
        double width = -1;//set width
        boolean acceptance2 = true;
            do{
                if(acceptance2){
                    System.out.print("Input your desired width: ");
                    acceptance2 = false;
                }// prompt user to enter width
                else{
                    if(width > length){
                        System.out.println("Error: Please input an integer smaller than the length.");
                        System.out.print("Input your desired width: ");
                    }// if the width is larger than length, ask to reenter
                    else{
                        System.out.println("Error: please type in a positive integer.");
                        System.out.print("Input your desired width: ");
                    }//other incorrect format, ask to reenter
                }
                while(!myScanner.hasNextInt()){
                    myScanner.next();// accept input in any format
                    System.out.println("Error: please type in a positive integer.");
                    System.out.print("Input your desired width: ");
                }//if the input is not integer, ask to reenter
                width = myScanner.nextInt();//accept input in integer
            }while(width <= 0 || width > length);//range of width
       
       for(int i=0; i<width; i++){
            for(int j=0; j<length; j++){
                if(i==j%width){
                    if(Math.floor(j / width) % 2 == 0){//round down the result
                        System.out.print("#");//first type X, "#" from top left to bottom right
                    }
                    else{
                        System.out.print("\\");//second type X, "\"from top left to bottom right
                    }
                }
                if((i+j%width)%width==width-1){
                    if(Math.floor(j / width) % 2 == 0){//round down the result
                        System.out.print("/"); //first type X, "/" from bottom left to top right
                    }
                    else{
                        System.out.print("#"); //second type X, "#" from bottom left to top right
                    }
                }
                else{
                    System.out.print(" ");// whitesapce otherwise
                }
            }System.out.println();//another line
        }
    }
}
        
        
