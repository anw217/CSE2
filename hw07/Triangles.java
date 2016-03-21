//Anni Weng
//hw07 March 21, 2016
//CSE02
//Triangles

import java.util.Scanner;
public class Triangles{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int input;//set input
        do{
            System.out.print("Please enter an integer bewtween 5 and 30: ");//prompt to enter a number
            while(!myScanner.hasNextInt()){
                myScanner.next();
                System.out.print("Incalid input, please enter an integer between 5 and 30: ");
            }// if it's not an integer, ask again until getting an integer
            input = myScanner.nextInt();//accept input
        }while(input < 5 || input >30);//input should between 5 and 30, otherwise redo do loop
        
        System.out.println("\n FOR LOOP \n" );
        for(int i = 1; i <= 2 * input - 1; i++){
                for(int j = 1; j <= i && i <= input; j++){
                    System.out.print(i);
                }//first case
                for(int k = 2 * input - i; k > 0 && i > input; k--){
                    System.out.print(2 * input - i);
                }//second case
            System.out.println();//another line
        }
        
        System.out.println("\n WHILE LOOP \n");
        int i = 1;
        while(i <= 2 * input - 1){
            int j = 1;
            while(j<= i && i <= input){
                System.out.print(i);
                j++;
            }//first case
            int k = 2 * input - i;
            while(k > 0 && i > input){
               System.out.print(2 * input - i);// hard to explain :(
               k--;
            }//second case
            i++;
            System.out.println(); //antoher line
        }//2 nested while loop and an outer while loop
        
         System.out.println("\n DO-WHILE LOOP \n");
         int m = 1;
         do{
            if(m <= input){
                int j = 1;
                do{
                    System.out.print(m);
                    j++; 
                }while(j <= m);
            }//first case
            else{
                int k = 2 * input - m;
                do{
                    System.out.print(2 * input - m);
                    k--;
                }while(k > 0 && m > input);
            }//second case
            m++;//number of rows increases
            System.out.println(); 
         }while(m <= 2 * input - 1);// if satisfied, redo do loop until it satisfied
    }
}
        
        
        