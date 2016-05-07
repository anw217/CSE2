//Anni Weng
//hw12 April 24, 2016
//CSE02
//imitate holoporter by using multidimensional arrays
// sampling no print out print, frankenstein
import java.util.Arrays;
import java.util.Scanner;
public class Holoporter{
    public static void main(String [] arg){
        String[][][] holoporter = soRandom();
        for (int i = 0; i < holoporter.length; i++) { 
            for (int j = 0; j < holoporter[i].length; j++) {
                for(int k = 0; k < holoporter[i][j].length; k++){
                    holoporter[i][j][k] = coder();
                }
            }
        }// check no two elements are same
        for (int i = 0; i < holoporter.length; i++) { 
            for (int j = 0; j < holoporter[i].length; j++) {
                for(int k = 0; k < holoporter[i][j].length; k++){
                    for (int a = 1; a < holoporter.length; a++) { 
                        for (int b = 1; b < holoporter[a].length; b++) {
                            for(int c = 1; c < holoporter[a][b].length; c++){
                                if(holoporter[i][j][k] == holoporter[a][b][c]){
                                    holoporter[a][b][c] = coder();
        }   }   }   }   }   }   }
        print(holoporter);
        String[][][] holoport = soRandom();
        System.out.println("\n\n\n");        
        print(holoportMethod(holoporter,holoport));
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a code in XXYYYY format, where X is a uppercase letter and Y is a number: ");
        boolean length = true;
        boolean format = true;
        String input = myScanner.next();
        while(length){
            if(input.length() != 6){
                System.out.println("Invalid length. Please enter a code in XXYYYY format, where X is a uppercase letter and Y is a number: : ");
                input = myScanner.next();
            }
            else{
                length = false;
            }
        }// check the format of input
        while(format){
            char a = input.charAt(0);
            char b = input.charAt(1);
            char c = input.charAt(2);
            char d = input.charAt(3);
            char e = input.charAt(4);
            char f = input.charAt(5);
            if(!Character.isUpperCase(a) || !Character.isUpperCase(b) || !Character.isDigit(c) || !Character.isDigit(d) || !Character.isDigit(e) || !Character.isDigit(f) ){
                System.out.println("Invalid format. Please enter a code in XXYYYY format, where X is a uppercase letter and Y is a number: ");
                input = myScanner.next();
            }
            else{
                format = false;
            }
        }
        String[][][] a = holoport;
        sampling(a, input);
        System.out.println(percentage(holoport, holoporter));
        
/*        String[][][] sortedArray = frankenstein(holoport);
        System.out.println("\n\n\n");
*/        print(sortedArray);
       
    }
    // generate random size
    public static String[][][] soRandom(){
        int a = (int)(Math.random() * 10 + 1);
        int b = (int)(Math.random() * 10 + 1);
        int c = (int)(Math.random() * 10 + 1);
        String[][][] array = new String[a][b][c];
        return array;
        
    }
    //generate random code
    public static String coder(){
        char firstTemp = (char)((int)'A'+Math.random()*((int)'Z'-(int)'A'+1));
        String first = Character.toString(firstTemp);
        char second = (char)((int)'A'+Math.random()*((int)'Z'-(int)'A'+1));
        String third = Integer.toString((int)(Math.random() * 10));
        String fourth = Integer.toString((int)(Math.random() * 10));
        String fifth = Integer.toString((int)(Math.random() * 10));
        String sixth = Integer.toString((int)(Math.random() * 10));
        String code = first + second + third + fourth + fifth + sixth;
        return code;
    }
    // print out in the certain format
    public static void print(String[][][] array){
        int k = 0;
        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) {
                for(k = 0; k < array[i][j].length; k++){
                    if(k == 0){
                        System.out.print("[");
                    }
                    System.out.print(array[i][j][k]);
                    if(k >= 0 && k < array[i][j].length - 1){
                        System.out.print(", ");
                    }
                    if(k == array[i][j].length - 1){
                        System.out.print("]");
                    }
                }
                if(j != array[i].length - 1){
                    System.out.print("|");
                }
            }
            if(i != array.length - 1){        
                System.out.print("---");
            }
        }
    }
    
    
    //generate holoport when size is different
    public static String[][][] holoportMethod(String[][][] holoporter, String[][][] holoport){

        for(int i = 0; i < holoport.length; i ++){
            for(int j = 0; j < holoport[i].length; j++){
                for(int k = 0; k < holoport[i][j].length; k++){
                    holoport[i][j][k] = "$";
                    //System.out.print(holoport[i][j][k]);
                }
            }
        }
        for(int i = 0; i < holoport.length && i < holoporter.length; i++){
            for(int j = 0; j < holoport[i].length && j < holoporter[i].length; j++){
                for(int k = 0; k < holoport[i][j].length && k < holoporter[i][j].length; k++){
                    holoport[i][j][k] = holoporter[i][j][k];
                }
            }
        }
        return holoport;
    }
    //check if the input is in the array
    public static void sampling(String[][][] a, String input){
        boolean find = false;
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[i].length; j++) {
                for(int k = 0; k < a[i][j].length; k++){
                    if(input.equals(a[i][j][k])){
                        System.out.println("input is at (" + i + ", " + j + ", " + k + ")." );
                            find = true;
                    } 
                }
           }
        }
        if(!find){
            System.out.println("Code not found.");
        }
    }
    //calculate the percentage that is different
    public static double percentage(String[][][] holoport, String[][][] holoporter){
        int percent;
        int diff = 0;
        int total = 0;
        for (int i = 0; i < smaller(holoporter.length, holoport.length); i++) { 
            for (int j = 0; j < smaller(holoporter[i].length, holoport[i].length); j++) {
                int a = larger(holoporter[i][j].length, holoport[i][j].length) - smaller(holoporter[i][j].length, holoport[i][j].length);
                diff += Math.abs(a);
                int b = larger(holoporter[i][j].length, holoport[i][j].length);
                total += Math.abs(b);
            }
        }

        percent = diff / total;
        return percent;
    }
    public static int larger(int a, int b){
        if(a - b >= 0){
            return a;
        }
        else{
            return b;
        }
    }
    public static int smaller(int a, int b){
        if(a - b <= 0){
            return a;
        }
        else{
            return b;
        }
    }
    //to sort array alphabetically
   public static String[][][] frankenstein(String [][][] holoport){
        for (int i = 0; i < holoport.length; i++) { 
            for (int j = 0; j < holoport[i].length; j++) {
                for(int k = 0; k < holoport[j].length; k++){
                    Arrays.sort(holoport[i][j]);
                }
                Arrays.sort(holoport[i]);
            }
            Arrays.sort(holoport);
        }
        return holoport;
   }
   
}