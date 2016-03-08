//Anni Weng
//hw06 March 7, 2016
//CSE02
//Make a Unix spinner

public class TextSpinner{
    public static void main(String[] args) {
        while(true){//while loop, set it true
        System.out.print("/");//print "/"
        System.out.print("\b");//eleminate "/"
        System.out.print("-");//print "-"
        System.out.print("\b");//eleminate "-"
        System.out.print("\\");//print "\\"
        System.out.print("\b");//eleminate "\\"
        System.out.print("|");//print "|"
        System.out.print("\b");//eleminate "|"
        }//end of the while loop
    }
}