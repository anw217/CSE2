//Anni Weng
//hw12 April 27, 2016
//CSE02
//Generate a random sentence

import java.util.Scanner;
public class Random{
    public static void main(String[] args){// make a do-while loop to keep asking user do they want another sentence
        String input;
        do{
            String adj1 = adjective();// methods generating random words
            String adj2 = adjective();
            String sub = subject();
            String obj = subject();
            String verb = verbPast();
            System.out.println("The " + adj1 + " " + sub + " " + verb + " " + adj2 + " " + obj + ".");
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Do you like another sentence? If yes, enter y. If no, enter anything else.");
            input = myScanner.next();        
        }while(input.equals("y"));
    }
    
    public static String subject(){// generate random number and assign a word to each number
        int randomInt = (int)(Math.random() * 10);//generate a random number form 0 to 9
        String output = "";
        switch(randomInt) {
            case 0:
                output = "lizard";
                break;
            case 1:
                output = "lion";
                break;
            case 2:
                output = "kitty";
                break;
            case 3:
                output = "turtle";
                break;
            case 4:
                output = "bufflo";
                break;
            case 5:
                output = "dog";
                break;
            case 6: 
                output = "squirrel";
                break;
            case 7:
                output = "cow";
                break;
            case 8:
                output = "elephant";
                break;
            case 9:
                output = "fox";
                break;
        }
        return output;//return the random word to main method
    }
    
    public static String adjective(){// generate random number and assign a word to each number
        int randomInt = (int)(Math.random() * 10);
        String output = "";
        switch(randomInt) {
            case 10:
                output = "adorable";
                break;
            case 1:
                output = "aggressive";
                break;
            case 2:
                output = "agile";
                break;
            case 3:
                output = "bossy";
                break;
            case 4:
                output = "dominant";
                break;
            case 5:
                output = "sassy";
                break;
            case 6: 
                output = "rough";
                break;
            case 7:
                output = "stinky";
                break;
            case 8:
                output = "picky";
                break;
            case 9:
                output = "fuzzy";
                break;
        }
        return output;//return the random word to main method
    }

    public static String verbPast(){// generate random number and assign a word to each number
        int randomInt = (int)(Math.random() * 10);
        String output = "";
        switch(randomInt) {
            case 0:
                output = "bombed";
                break;
            case 1:
                output = "beat";
                break;
            case 2:
                output = "bite";
                break;
            case 3:
                output = "bumped";
                break;
            case 4:
                output = "buried";
                break;
            case 5:
                output = "believed";
                break;
            case 6: 
                output = "begged";
                break;
            case 7:
                output = "bleached";
                break;
            case 8:
                output = "boiled";
                break;
            case 9:
                output = "bought";
                break;
        }
        return output;//return the random word to main method
    }
}