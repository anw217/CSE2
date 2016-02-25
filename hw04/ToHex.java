import java.util.Scanner;

//Anni Weng
//hw02 Feb 23, 2016
//CSE02
//Convert decimal to hexadecimal

public class ToHex{
    			// main method required for every Java program
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in );//declare an instance of the Scanner object
        System.out.print("Please enter three numbers representing RGB values: ");//User enters decimal value
        int decimal1 = 0;
            if (myScanner.hasNextInt()) {
                decimal1 = myScanner.nextInt();
            }
            else {
                System.out.println("Sorry, your input must consist of integers.");
                System.exit(-1);
            }
        int decimal2 = 0;
            if (myScanner.hasNextInt()) {
                decimal2 = myScanner.nextInt();
            }
            else {
                System.out.println("Sorry, your input must consist of integers.");
                System.exit(-1);
            }
        int decimal3 = 0;
            if (myScanner.hasNextInt()) {
                decimal3 = myScanner.nextInt();
            }
            else {
                System.out.println("Sorry, your input must consist of integers.");
                System.exit(-1);
            }
      
        int in1 = decimal1 / 16;//how many times can be divided by 16
        int re1 = decimal1 % 16;//remainder after the division
        int in2 = decimal2 / 16;//how many times can be divided by 16
        int re2 = decimal2 % 16;//remainder after the division
        int in3 = decimal3 / 16;//how many times can be divided by 16
        int re3 = decimal3 % 16;//remainder after the division
        String strFirstIn = "";
        String strFirstRe = "";
        String strSecondIn = "";
        String strSecondRe = "";
        String strThirdIn = "";
        String strThirdRe = "";
        if ((0 <= decimal1 && decimal1 <= 255) && (0 <= decimal2 && decimal2 <= 255) && (0 <= decimal3 && decimal3 <= 255)){ //if all three numbers are between 1 and 255
            if (in1 < 10){
                    strFirstIn = in1 + "";
            }
            else{ 
                switch (in1){
                case 10:
                    strFirstIn = "A";
                break;
                case 11:
                    strFirstIn = "B";
                break;
                case 12:
                    strFirstIn = "C";
                break;
                case 13:
                    strFirstIn = "D";
                break; 
                case 14:
                    strFirstIn = "E";
                break;
                case 15:
                    strFirstIn = "F";
                break; 
                default:
                    strFirstIn = "";
                break;
                }
            }
            if (in2 < 10){
                strSecondIn = in2 + "";
            }
            else{
                switch (in2){
                case 10:
                    strSecondIn = "A";
                break;
                case 11:
                    strSecondIn = "B";
                break;
                case 12:
                    strSecondIn = "C";
                break;
                case 13:
                    strSecondIn = "D";
                break; 
                case 14:
                    strSecondIn = "E";
                break;
                case 15:
                    strSecondIn = "F";
                break; 
                default:
                    strSecondIn = "";
                break;
                }
            }
            if (in3 < 10){
                strThirdIn = in3 + "";
            }
            else{
                switch (in3){
                case 10:
                    strThirdIn = "A";
                break;
                case 11:
                    strThirdIn = "B";
                break;
                case 12:
                    strThirdIn = "C";
                break;
                case 13:
                    strThirdIn = "D";
                break; 
                case 14:
                    strThirdIn = "E";
                break;
                case 15:
                    strThirdIn = "F";
                break; 
                default:
                    strThirdIn = "";
                break;
                }
            }
            if (re1 < 10){
                strFirstRe = re1 + "";
            }
            else{
                switch (re1){
                case 10:
                    strFirstRe = "A";
                break;
                case 11:
                    strFirstRe = "B";
                break;
                case 12:
                    strFirstRe = "C";
                break;
                case 13:
                    strFirstRe = "D";
                break; 
                case 14:
                    strFirstRe = "E";
                break;
                case 15:
                    strFirstRe = "F";
                break; 
                default:
                    strFirstRe = "";
                break;
                }
            }
            if (re2 < 10){
                strSecondRe = re2 + "";
            }
            else{
                switch (re2){
                case 10:
                    strSecondRe = "A";
                break;
                case 11:
                    strSecondRe = "B";
                break;
                case 12:
                    strSecondRe = "C";
                break;
                case 13:
                    strSecondRe = "D";
                break; 
                case 14:
                    strSecondRe = "E";
                break;
                case 15:
                    strSecondRe = "F";
                break; 
                default:
                    strSecondRe = "";
                break;
                }
            }
            if (re3 < 10){
                strThirdRe = re3 + "";
            }
            else{
                switch (re3){
                case 10:
                    strThirdRe = "A";
                break;
                case 11:
                    strThirdRe = "B";
                break;
                case 12:
                    strThirdRe = "C";
                break;
                case 13:
                    strThirdRe = "D";
                break; 
                case 14:
                    strThirdRe = "E";
                break;
                case 15:
                    strThirdRe = "F";
                break; 
                default:
                    strThirdRe = "";
                }
            }
            
            System.out.println("The decimal numbers R: " + decimal1 +", G: " + decimal2 + ", B: " + decimal3 + ", is represented in hexadecimal as: " + strFirstIn  + strFirstRe + strSecondIn + strSecondRe + strThirdIn + strThirdRe);//print out result
        }
        else if (decimal1 < 0 || decimal2 < 0 || decimal3 < 0 || decimal1 > 255 || decimal2 > 255 || decimal3 > 255){//if any of three numbers is not between 1 and 255
                System.out.println("Sorry, you must enter values between 0-255.");//print out result
        }
       
    }
}
        