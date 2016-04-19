//Anni Weng
//hw12 April 17, 2016
//CSE02
//write 3 methods, fill in, delete, and remove
import java.util.Scanner;
public class RemoveElements{
    public static void main(String [] arg){
    	Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
        boolean acceptance = true;
    	String answer="";
    	do{
      	System.out.print("Random input 10 ints [0-9]");
      	num = randomInput();
      	String out = "The original array is:";
      	out += listArray(num);
      	System.out.println(out);
      	do{ 
      	    if(acceptance){
      	        System.out.print("Enter the index ");
      	        acceptance = false;
      	    }
      	    else{
      	        System.out.println("The index is not valid.");
      	    }
          	while(!scan.hasNextInt()){
          	    scan.next();
          	    System.out.println("The index is not valid.");
      	    }
      	    index = scan.nextInt();
      	}while (index < 0 || index > (num.length - 1));
      	newArray1 = delete(num,index);
      	String out1="The output array is ";
      	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
      	System.out.println(out1);
    
        System.out.print("Enter the target value ");
      	target = scan.nextInt();
      	newArray2 = remove(num,target);
      	String out2="The output array is ";
      	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
      	System.out.println(out2);
      	 
      	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
      	answer=scan.next();
    	}while(answer.equals("Y") || answer.equals("y"));
      }
     
    public static String listArray(int num[]){
    	String out="{";
    	for(int j=0;j<num.length;j++){
      	if(j>0){
        	out+=", ";
      	}
      	out+=num[j];
    	}
    	out+="} ";
    	return out;
    }
    //Generate an array with random values
    public static int[] randomInput(){
        int num[]=new int[10];
        for (int i = 0; i < 10; i++){
            num[i] = (int)(Math.random() * 10);
        }
        return num;
    }
    //input index number(count from 0), delete the corresponding number and shift the rest of numbers to the left
    public static int[] delete(int[] num, int index ){
        int count = 0;
        int [] tempArray = new int[num.length - 1];
        for(int i = 0; i < num.length; i++){
            if(i != index){
                tempArray[count] = num[i];
                count++;
            }
        }
        return tempArray;
    }
    //input a target number, delete the number from array and shift the rest to the left
    public static int[] remove(int[] num, int target){
        int count = 0;
        for (int i = 0; i < num.length; i++){
            if(num[i] == target){
                count++;
            }
        }
        int []newArray = new int[num.length - count];
        count = 0;
        for (int i = 0; i < num.length; i++){
            if(num[i] != target){
                newArray[count] = num[i];
                count++;
            }
        }
        return newArray;
    }
}


