//Anni Weng
//hw12 May 6, 2016
//CSE02
//practice of ragged array
import java.util.Scanner;
public class RaggedArray{
    public static void main(String [] arg){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the size of main array: ");
        int size1 = myScanner.nextInt();
        int[][] array = new int[size1][];//create an array with the input size as main array size
        //generate random size of member arrays
        for(int i = 0; i < array.length; i++){
            int size2 = (int)(Math.random() * size1 + 1);
            array[i] = new int[size2];
        }
        //fill out array with random elements between 0 and 20 inclusively
        System.out.println("\nHere is your unsorted array: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                array[i][j] = (int)(Math.random() * 21);
                System.out.print(array[i][j]);
                if( j < array[i].length -1){
                    System.out.print(", ");
                }
            }
            System.out.println("");
        }
        //order the array
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j< array[i].length; j++){
                int currentElement = array[i][j];
                int k = 0;
                for(k = j - 1; k >=0 && array[i][k] > currentElement; k--){
                    array[i][k + 1] = array[i][k];
                }
                array[i][k + 1] = currentElement;
            }
        }
        for(int i = 1; i < array.length; i++){
            int[] currentArray = array[i];
            int length = currentArray.length;
            int k = 0;
            for(k = i - 1; k >= 0 && array[k].length > currentArray.length; k--){
                array[k + 1] = array[k];
            }
            array[k + 1] = currentArray;
        }
        System.out.println("");
        System.out.println("Here is your sorted array: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j< array[i].length; j++){
                System.out.print(array[i][j]);
                if( j < array[i].length -1){
                    System.out.print(", ");
                }
            }
            System.out.println("");
        }
        System.out.println("\nPlease enter a number to search: ");
        int number = myScanner.nextInt();
        int[] answer = search(array, number);
        if(answer[0] == -1 && answer[1] == -1){
            System.out.println("Not found.");
        }
        else{
            System.out.println("Column: " + answer[1] + " Row: " + answer[0]);
        }
        //input the number for search
    }
    public static int[] search(int[][] array, int number){

        boolean found = false;
        int[] answer = new int[2];
        int i = 0;
        int j = 0;
        for(i = 0; i < array.length; i++){
            for(j = 0; j< array[i].length; j++){
                if(number == array[i][j]){
                    answer[0] = i + 1;
                    answer[1] = j + 1;
                    return answer;
                }
            }
        }
        answer[0] = -1;
        answer[1] = -1;
        return answer;
    }
}