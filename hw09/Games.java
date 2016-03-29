//Anni Weng
//hw09 - Games 
//March 28, 2016
//didn't do 2nd game input limitation
import java.util.Scanner;//import Scanner class
import java.util.concurrent.ThreadLocalRandom;

public class Games{//class
    public static void main(String[] args){//main method
        System.out.println("Welcome to cs game center");//print the sentence
        Scanner myScanner = new Scanner(System.in);//initialize variable myScanner
        int input;//initialize variable input
        boolean acceptance = true;
        do{
            if (acceptance){
                System.out.println("Please type the number of corresponding game:\n1 guessTheBox\n2 spinTheWheel\n3 scrambler");
                acceptance = false;//print the sentence and turn the boolean into flase
            }
            else{
                System.out.println("Invalid input, please type a number between 1 and 3.");
            }
                while(!myScanner.hasNextInt()){//when the input is not an integer
                    myScanner.next();//accept the input
                    System.out.println("Invalid input, please type a number between 1 and 3.");//tell user it's a wrong input
                }
                input = myScanner.nextInt();//accept the input
        }while(input < 1 || input >3);//set limitation
        if (input == 1){
            int boxInput = 0;
            guessTheBox(boxInput);//when choose the first game, go to guessTheBox method
        }
        if (input == 2){
            String color = "";
            int number = 0;
            spinTheWheel(color, number);//when choose the second game, go to spinTheWheel method
        }
        if (input == 3){
            String word = "";
            System.out.println("Scrambled word is: " + Scrambler(word));//when choose the third game, go to Scrambler method
        }
    }
    public static void guessTheBox(int boxInput){//guessTheBox method begins
        Scanner boxScanner = new Scanner(System.in);
        boolean acceptanceBox = true;
        do{
            if(acceptanceBox){
            System.out.println("There are three boxes: 1, 2, and 3.\nThere is a prize in one of these boxes. Please guess a box that contains the prize.");
            acceptanceBox = false;
            }
            else{
                System.out.println("Wrong input. Enter again: ");
            }
                while(!boxScanner.hasNextInt()){
                    boxScanner.next();
                    System.out.println("Wrong input. Enter again: ");
                }
                boxInput = boxScanner.nextInt();
        }while(boxInput < 1 || boxInput > 3);//keep ask user until getting integer greater than 1 and less than 3
        int answer = (int) (Math.random() * 3 + 1);//randomize the answer
        if(boxInput == answer){
            System.out.println("Congratulations! You are GENIUS! \nYour prize is \nNO PRIZE!");
        }// when user's answer matches computer's anwer, print the sentence
        else{
            System.out.println("You LOSE!!!\nNO PRIZE!!!");//otherwise, print this
        }
    }
    public static void spinTheWheel(String color, int number){//second game starts
        Scanner wheelColorScanner = new Scanner(System.in);
        System.out.print("Please enter a color, red or black: ");
        do{
            color = wheelColorScanner.nextLine();
            if(color.equalsIgnoreCase("red")||color.equalsIgnoreCase("black")){
                break;//if input is red or black, either upper case or lower case, exit the loop
            }
            else{
                System.out.print("Wrong input. Please enter a color, red or black: ");    
            }
        }while(true);//if input is not correct, continue the loop
            //color = wheelColorScanner.nextLine().toLowerCase(); another way to ignore case
      
        boolean accept = true;
        Scanner wheelNumberScanner = new Scanner(System.in);
        do{
            if(accept){
                System.out.print("Please enter a number between 1 and 5: ");
            }
            else{
                System.out.print("Wrong input, please enter a number between 1 and 5: ");
            }
            while(!wheelNumberScanner.hasNextInt()){
                wheelNumberScanner.next();
                System.out.print("Wrong input, please enter a number between 1 and 5: ");
            }
            number = wheelNumberScanner.nextInt();
        }while(number < 1 || number > 5);//prompt user to enter an integer between 1 and 5
        String userWheel = color + number;//the final user input
        String javaColor = "";
        int randomWheelNumber = 0;
        int a = (int) (Math.random() * 2 + 1);//randomize number: 1 or 2
        if (a == 1){
            javaColor = "red";//1 is red
        }
        if(a == 2){
            javaColor = "black";//2 is black
        }
        String javaWheel = javaColor + (int) (Math.random() * 5 + 1);
        if(javaWheel.equals(userWheel)){
            System.out.println("Your Answer: " + userWheel + "\nComputer Answer: " + javaWheel + "\nMATCHES! YOU WIN!");
        }//if user's input equals to computer's answer, print the message
        else{
            System.out.println("Your Answer: " + userWheel + "\nComputer Answer: " + javaWheel + "\nNO MATCH! YOU LOSE!");
        }//otherwise, print this
    }
        
    public static String Scrambler(String word) {//third game starts
        System.out.print("Please enter a word: ");
        Scanner scramblerScanner = new Scanner(System.in);
        String userWord = scramblerScanner.nextLine().toLowerCase();
        int wordLength = userWord.length();//length of the word
        int swapCount = 10;//the number of swap
        for(int i = 0; i <= swapCount; i++){
            int firstNum = ThreadLocalRandom.current().nextInt(0, wordLength);//randomize a number between 0 and wordlength
            int secondNum = ThreadLocalRandom.current().nextInt(0, wordLength);//randomize a number between 0 and wordlength
            userWord = swap(userWord, firstNum, secondNum);//go to swap method
        }
        return userWord;//word after 10 swap
    }
     public static String swap(String userWord, int firstNum, int secondNum){
        char[] digit = userWord.toCharArray();
        char swap = digit[firstNum];
        digit[firstNum] = digit[secondNum];
        digit[secondNum] = swap;
        return new String(digit);//swap firstNum and secondNum by using char swap
    }
}

