import java.util.Scanner;
//Anni Weng
//hw12 April 17, 2016
//CSE02
//practice with arrays and in searching single dimensional arrays, promt user enter 15 ints, sorted, and search for one number

public class CSE2Linear{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        final int number_of_list = 15;//total number of list
        int [] myList = new int [number_of_list];// set up an array
        boolean acceptance = true;
        System.out.print("Enter 15 integers for final grades in CSE2: ");
       // if(acceptance){
        //accept input in certain format
        for (int i = 0; i < number_of_list;){
            if(!myScanner.hasNextInt()){
                System.out.print("Please enter 15 integers: ");
                myScanner.next();
                continue;
            }
            int temp = myScanner.nextInt();
            if(temp < 0 || temp > 100){
                System.out.print("Invalid input, please enter 15 numbers from 0 to 100: ");
                continue;
            }
            myList[i] = temp;
            if(i >= 1){
                if(myList[i] < myList[i - 1]){
                    System.out.print("Please enter a greater value: ");
                continue;
                }
            }
            i++;
        }
       /* acceptance = false;
        }
        else{*/
        //sort and print input
        myList = sort(myList);
        printSort(myList);
        //search for a number by binary search
        System.out.println("Enter a grade to search for: ");
        int searchNumber = myScanner.nextInt();
        binarySearch(myList, searchNumber);
        //scramble the array
        myList = scramble(myList);
        printScramble(myList);
        //search for a number by linear search
        System.out.println("Enter a grade to search for: ");
        searchNumber = myScanner.nextInt();
        linearSearch(myList, searchNumber);
        
        
    }
    //sort inputs from the smallest to the largest
    public static int[] sort(int[] myList){
        for (int i = 0; i < myList.length; i++) {
            int min = myList[i];
            int minIndex = i;
            for(int j = i + 1; j < myList.length; j++){
                if (min > myList[j]) {
                    min = myList[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                myList[minIndex] = myList[i];
                myList[i] = min;
            }
        }
        return myList;
    }
    //print the sorted array
    public static void printSort(int[] myList){
        System.out.print("Sorted: \n");
        for(int i = 0; i < myList.length; i++){
            System.out.print(myList[i] + " ");
        }
        System.out.println("");
    }
    // search for a number by binary search  
    public static void binarySearch(int[] myList, int key) { 
        int i = 1;
        int low = 0;
        int high = myList.length - 1;
        while (high >= low) {
            int mid = (int)((low + high) / 2);
            if (key < myList[mid]){
                high = mid - 1;
            }
            else if (key == myList[mid]){
                System.out.println(key + " was found in the list with " + i + " iterations");
                break;
            }
            else{
                low = mid + 1;
            }
            i++;
            if(high < low){
                System.out.println(key + " was not found in the list with " + i + " iterations");
            }
        }
    }
    // switch random numbers in the array for few times
    public static int[] scramble(int[] myList){
        for(int i = 0; i < myList.length; i++){
            int index = (int) (Math.random() * myList.length);
            int temp = myList[i]; 
            myList[i] = myList[index];
            myList[index] = temp;
        }
        return myList;
    }
    //print the scrambled array
    public static void printScramble(int[] myList){
        System.out.println("Scrambled: ");
        for(int i = 0; i < myList.length; i++){
            System.out.print(myList[i] + " ");
        }
        System.out.println("");
    }
    // search number by linear search
    public static void linearSearch(int[] myList, int searchNumber){
        int i = 0;
        for(i = 1; i < myList.length; i++){
            if(searchNumber == myList[i]){
                System.out.println(searchNumber + " was found in the list with " + i + " iterations.");
                break;
            }
        }
        System.out.println(searchNumber + " was not found in the list with " + i + " iterations.");
    }
}

