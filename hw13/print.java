import java.util.Scanner;
public class print{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
    System.out.println("Please enter a code in XXYYYY format, where X is a uppercase letter and Y is a number: ");
        boolean length = true;
        boolean format = true;
        String input = myScanner.next();
        while(length){
            if(input.length() != 6){
            System.out.println("Invalid length, enter again: ");
            input = myScanner.next();
            }
            else{
                length = false;
            }
        }
        while(format){
        char a = input.charAt(0);
        char b = input.charAt(1);
        char c = input.charAt(2);
        char d = input.charAt(3);
        char e = input.charAt(4);
        char f = input.charAt(5);
        if(!Character.isUpperCase(a) || !Character.isUpperCase(b) || !Character.isDigit(c) || !Character.isDigit(d) || !Character.isDigit(e) || !Character.isDigit(f) ){
            System.out.println("Invalid, enter again: ");
            input = myScanner.next();
        }
        else{
            format = false;
        }
        }
    System.out.println(input);
    }
}
           