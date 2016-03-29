//Anni Weng
//hw09 - Rectangularize 
//March 28, 2016
import java.util.Scanner;//import scanner
public class Rectangularize{
    private static int wordLength = 0;//static variable that is shared between all instances of class
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//set up new scanner
        System.out.print("Please enter a word or a number: ");//print the sentence
        String word = myScanner.nextLine();//accept the input as a string
        wordLength = word.length();//calculate the word length
        
        if(!isInt(word)){
            wordRectangular(word);//if doesn't satisfy isInt(word) method, goes to word Rectangular method
        }
        else{
            int newNumber = Integer.parseInt(word); 
            wordRectangular(newNumber);//if satisfies, meaning the input is an integer, convert it to integer and goes to  wordRectangular method 
        }
    }
    public static boolean isInt(String wordTest){//see if it's a string
        try{
            Integer.parseInt(wordTest);//catch all possilities
        }
        catch(NumberFormatException e){
            return false;//if it can not parse into an integer, return false
        }
        return true;//otherwise, return true
    }
    public static void wordRectangular(String word){//if the input is a string, use this method
        
        for(int i = 1; i <= wordLength; i++){
            System.out.println(word);//print out result
        }
    }
    public static void wordRectangular(int number){//if the input is a number, use this method
        for(int i = 1; i <= number; i++){
            for(int j = 1; j<= number; j++){
                System.out.print("%");//print out the result for each line
            }
            System.out.println("");//goes to the next line
        }
    }
}//end of the class