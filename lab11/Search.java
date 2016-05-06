import java.util.Scanner;
//Anni Weng
//hw12 April 27, 2016
//CSE02
//perform linear and binary search on large arrays of random numbers.
//Sometimes works, sometimes doesn't, binary search
public class Search{
    public static void main(String[] args){
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        //first array with 50 random numbers between 0 and 100
        for(int i = 0; i < array1.length; i ++){
            array1[i] = (int)(Math.random() * 101 );
        }
        int min1 = minimum(array1);//call minimum method
        System.out.println("The minimum of array1 is " + min1);
        int max1 = maximum(array1);//call maximum method
        System.out.println("The maximum of array1 is " + max1);
        //second array with increasing numbers, the first number is between 0 and 100
        array2[0] = (int)(Math.random() * 101 );
        for(int i = 1; i < array2.length; i ++){
            array2[i] = (int)(Math.random() * 10 ) + array2[i - 1];
        }
                for(int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }
        int min2 = minimum(array2);//call minimum method
        System.out.println("The minimum of array2 is " + min2);
        int max2 = maximum(array2);//call maximum method
        System.out.println("The maximum of array2 is " + max2);
        System.out.print("Enter an int >= 0: ");
        Scanner myScanner = new Scanner(System.in);
        if(myScanner.hasNextInt()){
            int input = myScanner.nextInt();
            if(input >= 0){
                binarySearch(array2,input);
                System.exit(0);
            }
            else{
                System.out.println("You did not enter an integer >= 0.");
                System.exit(0);
            }
        }
        if(!myScanner.hasNextInt()){
            System.out.println("You did not enter an integer.");
            System.exit(0);
        }

    }
    public static int minimum(int[] array){//find mimum number by linear search
        int min = array[0];
        for(int i = 1; i < array.length; i ++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public static int maximum(int[] array){//find maximum number by linear search
       int max = array[0];
        for(int i = 1; i < array.length; i ++){
            if(array[i] > max){
                max = array[i];
            }
        } 
        return max;
    }
    public static void binarySearch(int[] array, int key){
        int mid = 0;
        int low = 0;
        int high = array.length - 1;
        while(high >= low){
            mid = (int)((low + high) / 2);//find the mid point
            if(key < array[mid]){
                high = mid - 1;//redefine the search range
            }
            else if(key == array[mid]){
                System.out.println(key + " was found in the list.");
                return;
            }
            else{
                low = mid + 1;//redefine the search range
            }
                
                
        }
        if(high < low){
               for(int i = 0; i < array.length; i++){//if not found, search the whole array again and find out the number below and above it
                   if(array[i] > key){
                       System.out.println(key + " was not found in the list.");
                       System.out.println("The number below the key was " + array[i - 1] + ".");
                       System.out.println("The number above the key was " + array[i] + ".");
                       break;
                    }
                }
        }
    }
}