//Anni Weng
//hw12 April 24, 2016
//CSE02
//practise while loop and break statement
import java.util.Scanner;
public class Bowtie{
    public static void main(String[] args) {
        while(true){
        //set input
        Scanner myscanner = new Scanner(System.in);
        int nStars;//set an integer "nStars"
            do{// set up a do while loop
                System.out.println("Please enter an odd integer between 3 and 33(inclusive): ");// request input
                while(!myscanner.hasNextInt()) {//set up while loop conditioning on the input is not an intger
                    myscanner.next();
                    System.out.print("Please enter an odd integer between 3 and 33(inclusive): ");//re-enter input
                }
                nStars = myscanner.nextInt();//accept input
            }while(nStars < 3 || nStars > 33 || (nStars % 2 == 0));//end of the loop
      
        //while loop
        int i = 1;
        while(i <= ((nStars - 1) / 2)){ //first condition: stars in each line decreases
            int j = 1;
            while(j <= nStars){
                if(j >= i && j <= nStars + 1 - i){ // print out stars in each line
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println("");
            i++;
        }
        while(i <= nStars){//second condition: stars in each line increases
            int j = 1;
            while(j <= nStars){
                if(j >= nStars + 1 - i && j <= i){// print out stars in each line
                     System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println("");
            i++;
        }
        
        //for loop
        int i = 0;
        for(i = 1; i <= ((nStars - 1) / 2); i++){//first condition: stars in each line decreases
            for(int j = 1; j <= nStars; j++){
                if(j >= i && j <= nStars + 1 - i){// print out stars in each line
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(i = (nStars - 1) / 2 + 1; i <= nStars; i++){//second condition: stars in each line increases
            for(int j = 1; j <= nStars; j++){
                if(j >= nStars + 1 - i && j <= i){// print out stars in each line
                     System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        //do while loop
        int i = 1;//first condition: stars in each line decreases
        do{
            int j = 1;
            do{
                if(j >= i && j <= nStars + 1 - i){// print out stars in each line
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }while(j <= nStars);
            System.out.println("");
            i++;
        }while(i <= ((nStars - 1) / 2));
        do{ //second condition: stars in each line increases
            int j = 1;
            do{
                if(j >= nStars + 1 - i && j <= i){// print out stars in each line
                     System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                j++;
            }while(j <= nStars);
            System.out.println("");
            i++;
        }while(i <= nStars);

        //continue or not
        System.out.println("Would you like to continue? If yes, please enter Y or y. If no, please enter anything else: ");
        String input = myscanner.next();
        if(input.equals("Y") || input.equals("y")){
            continue;
        }
        else{
            break;
        }
        }
    }
}