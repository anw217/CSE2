//Anni Weng
//lab 04 - CardGenerator 
//CSE 02, 2016
//Our goal is to generate a random card from the deck by using swtich and if statements
public class CardGenerator{//class
    public static void main(String[] args){//main method
    int randNum = (int)(Math.random() * 52 + 1);//generate random number between 1 and 52(inclusive)
    String suit, identity;//set strings
    if(randNum >=1 && randNum <=13){//reange of choosing diamond
        suit = "Diamonds";//assign diamonds to suit
    }
    else if(randNum >=14 && randNum <= 26){//range of choosing club
        suit = "Clubs";//assign clubs to suit
    }
    else if(randNum >=27 && randNum <=39){//range of choosing hearts
        suit = "Hearts";//assign hearts to suit
    }
    else{//range of choosing spades
        suit = "Spades";//assign spades to suit
    }
    int ActNum = randNum % 13;//generate number between 1 and 13(inclusive) by using the random number genrated before
    switch(ActNum){//special case like higher numbers and 1
        case 1:// if random number is 1, 14, 27, 40
            identity = "Ace";//assign ace to identity
            break;//go out the switch
        case 11://if random number is 11, 24, 37, 50
            identity = "Jack";//assign jack to identity
            break;//go out the switch
        case 12://if random number is 12, 25, 38, 51
            identity = "Queen";//assign queen to identity
            break;//go out the switch
        case 0://if random number is 13, 26, 39, 52
            identity = "King";//assign king to identity
            break;//go out the switch
        default://otherwise
            identity = Integer.toString(ActNum);//random number is directly converted into string and assign to identity
            break;//go out the switch
    }
    System.out.println("You picked the " + identity + " of " + suit);//print output
        
    }
}