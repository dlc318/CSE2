/////////////////////////////////////////////////////////////
//Dana Cunningham
//December 5, 2014
//CSE2
//Poker Hands
//
//This program prompts the user to enter a five card poker hand,
//prints out the hand, and then prints out the rank of the hand.

import java.util.Scanner;   //imports Scanner

public class PokerHands {   //creates public class
    public static boolean swap(String cardRank, String suit, int[] deck, int[] hand, int j) {  //creates swap 
        boolean next = false;   //next is the value the swap method returns
        //necessary constants
        int suitnum = -2;    //0=club, 1=diamond, 2=heart, 3=spade
        int ranknum = -2;   //a=0, k=1, q=2, j=3, 10=4...
        int decknum = -2;    //From 0 to 51, representing each card in the deck. 
        
        //assigns the ranknum according to user input for rank
        if(cardRank.equals("a")) { ranknum = 0; }
        if(cardRank.equals("k")) { ranknum = 1; }
        if(cardRank.equals("q")) { ranknum = 2; }
        if(cardRank.equals("j")) { ranknum = 3; }
        if(cardRank.equals("10")) { ranknum = 4; }
        if(cardRank.equals("9")) { ranknum = 5; }
        if(cardRank.equals("8")) { ranknum = 6; }
        if(cardRank.equals("7")) { ranknum = 7; }
        if(cardRank.equals("6")) { ranknum = 8; }
        if(cardRank.equals("5")) { ranknum = 9; }
        if(cardRank.equals("4")) { ranknum = 10; }
        if(cardRank.equals("3")) { ranknum = 11; }
        if(cardRank.equals("2")) { ranknum = 12; }
        
        //When n/13 = 0, the card is a club. When n/13 = 1, the card is a diamond. When n/13 = 2, the card is a heart. When n/13 = 3, the card is a spade. 
        if(suit.equals("c")) { suitnum = 0; }
        else if(suit.equals("d")) { suitnum = 1; }
        else if(suit.equals("h")) { suitnum = 2; }
        else { suitnum = 3; }

        //gives the selected card a number n from 0 to 52. n/13 determines the suit while n%13 determines the rank.
        if(suitnum == 0) {  //clubs
            decknum = ranknum;
        }
        else if(suitnum == 1) {  //diamonds
            decknum = 13 + ranknum;
        }
        else if(suitnum == 2) {  //hearts
            decknum = 26 + ranknum;
        }
        else {  //spades
            decknum = 39 + ranknum;
        }
        
        if(deck[decknum] == -1) {    //if the user asks for a card that was previously drawn from the deck.
            next = false;
        }
        else{   //if the user asks for a card that was not previously drawn.
            hand[j] = deck[decknum];
            deck[decknum] = -1;
            next = true;
        }
        return next;
    }//ends swap method
    
    public static void showOneHand(int hand[]){ //creates showOneHand method
	    String suit[]={"Clubs:	  ", "Diamonds: ", "Hearts:   ",              "Spades:   "};  //creates an array according to suit
	    String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};  //creates an array according to rank
	    String out="";
	    for(int s=0;s<4;s++){
  	        out+=suit[s];   //prints the suit 
  	        for(int rank=0;rank<13;rank++)
    	    for(int card=0;card<5;card++)
     	    if(hand[card]/13==s && hand[card]%13==rank)
      	    out+=face[rank];    //prints out the face of the card
  	        out+='\n';
	    }
	    System.out.println(out);    
    }   //ends showOneHand method
  
    public static void main(String[] args) {    //creates main method
        for(int y = 0; y<10000; y++) {  //repeats continuously until user enters something other than y or Y
        
            String input;   //scanner will be stores in a string
            String suit= "";    //will carry the suit entered into the swap method
            
            int[] deck = new int[52];   //array to represent entire deck
            for(int i = 0; i<deck.length; i++) {    //initialize cards
                deck[i] = i;
            }
        
            int[] hand = new int[5];    //array to represent poker hand
            for(int i = 0; i<hand.length; i++) {    //initialize hand all to -1
                hand[i] = -1;
            }
        
            int[] frequency = {0,0,0,0,0,0,0,0,0,0,0,0,0};   //counts the number of times a rank is in your hand
            int[] counts = {0,0,0,0,0}; //counts the frequency of 0s, 1s, 2s, 3s, and 4s in the frequency array
        
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- "); //prompts user if they want to enter another hand.
            Scanner scan = new Scanner(System.in);  //creates new scanner
            if(scan.hasNext()) {    //if user enters a string
                input = scan.next();
                if(input.equals("Y") || input.equals("y")) {    //if user wishes to play another hand.
                    String rank = "";    //will carry the rank entered into the swap method
                    int j = 0;
                    while(j < 5) {  
                        System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
                        input = scan.next();
                        if(input.equals("c")) {
                            suit = "c"; 
                            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ... '2'- ");
                            input = scan.next();
                            rank = input;
                            boolean correct = swap(rank, suit, deck, hand, j);
                            if(correct == true) {
                                j++;
                            }
                            else{
                                System.out.println("You already entered that card");
                            }
                        }
                        else if(input.equals("d")) {
                            suit = "d"; 
                            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ... '2'- ");
                            input = scan.next();
                            rank = input;
                            boolean correct = swap(rank, suit, deck, hand, j);
                            if(correct == true) {
                                j++;
                            }
                            else{
                                System.out.println("You already entered that card");
                            }
                        }
                        else if(input.equals("h")) {
                            suit = "h"; 
                            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ... '2'- ");
                            input = scan.next();
                            rank = input;
                            boolean correct = swap(rank, suit, deck, hand, j);
                            if(correct == true) {
                                j++;
                            }
                            else{
                                System.out.println("You already entered that card");
                            }
                        }
                        else if(input.equals("s")) {
                            suit = "s"; 
                            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ... '2'- ");
                            input = scan.next();
                            rank = input;
                            boolean correct = swap(rank, suit, deck, hand, j);
                            if(correct == true) {
                                j++;
                            }
                            else{
                                System.out.println("You already entered that card");
                            }
                        }
                        //use else if statements for other suits
                        else{
                            System.out.println("You did not enter a valid response");
                        }
                    }//ends after all 5 cards are selected for the current hand
                    showOneHand(hand);  //prints out the hand according to suit and rank
                    
                    /* reorders the cards from minimum to maximum according to hand[]. Allows the cards to be 
                    displayed from greatest rank to smallest. */
                    for(int i = 0; i<hand.length-1; i++) {  
                        int currentMin = hand[i];
                        int currentMinIndex = i;
                
                        for(int x = i+1; x<hand.length; x++) {
                            if(currentMin > hand[x]) {
                                currentMin = hand[x];
                                currentMinIndex = x;
                            }
                        }
                        if(currentMinIndex != i) {
                            hand[currentMinIndex] = hand[i];
                            hand[i] = currentMin;
                        }
                    }
                    
                    for(int i = 0; i<5; i++) {  //adds the number of times a rank appears
                        for(int x = 0; x<13; x++) {
                            if(hand[i]%13 == x) {
                                frequency[x]++;
                            }
                        }
                    }
                    
                    for(int x = 0; x<13; x++) { //adds the number of 0s, 1s, 2s, 3s, and 4s
                        if(frequency[x] == 0) {
                            counts[0]++;
                        }
                        if(frequency[x] == 1) {
                            counts[1]++;
                        }
                        if(frequency[x] == 2) {
                            counts[2]++;
                        }
                        if(frequency[x] == 3) {
                            counts[3]++;
                        }
                        if(frequency[x] == 4) {
                            counts[4]++;
                        }
                    }
                    
                    boolean straight = false;
                    
                    //Checks for a Royal Flush
                    if(frequency[0] == 1 && frequency[1] == 1 && frequency[2] == 1 && frequency[3] == 1 && frequency[4] == 1) {
                        System.out.println("This is a Royal Flush");
                    }
                    //Checks for a Flush and a Straight Flush
                    else if(hand[0]/13 == hand[1]/13 && hand[0]/13 == hand[2]/13 && hand[0]/13 == hand[3]/13 && hand[0]/13 == hand[4]/13) {
                            if(hand[1]%13 == (hand[0]%13 + 1) && hand[2]%13 == (hand[0]%13 + 2) && hand[3]%13 == (hand[0]%13 + 3) && hand[4]%13 == (hand[0]%13 + 4)) {
                                System.out.println("This is a Straight Flush");
                            }
                            else{
                                System.out.println("This is a Flush");
                            }    
                    }
                    //Checks for Four of a Kind
                    else if(counts[4] == 1) {
                        System.out.println("This is a Four of a Kind");
                    }
                    //Checks for a Full House
                    else if(counts[2] == 1 && counts[3] == 1) {
                        System.out.println("This is a Full House");
                    }
                    //Checks for a Two Pair
                    else if(counts[2] == 2) {
                        System.out.println("This is a Two Pair");
                    }
                    //Checks for a One Pair
                    else if(hand[0]%13 == hand[1]%13 || hand[1]%13 == hand[2]%13 || hand[2]%13 == hand[3]%13 || hand[3]%13 == hand[4]%13) {
                            System.out.println("This is a One Pair");
                    }
                    //Checks for a Straight
                    else if(hand[1]%13 == (hand[0]%13 + 1) && hand[2]%13 == (hand[0]%13 + 2) && hand[3]%13 == (hand[0]%13 + 3) && hand[4]%13 == (hand[0]%13 + 4)) {
                            System.out.println("This is a Straight");
                            straight = true;
                    }
                    //Checks for a High Card
                    else{
                            System.out.println("This is a High Card");
                    }
                }//ends when user does not want to play another hand.
                else{   //if user does not enter a 'y' or 'Y' to play another hand. 
                    y = 10001;
                }
            }
            else{   //if user enters a number, the game quits. 
                y = 10001;
            }
        }
        
    }//ends main method
}//ends public class