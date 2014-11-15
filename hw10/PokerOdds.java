//////////////////////////////////////////////////////////
//Dana Cunningham
//November 18, 2014
//CSE2
//PokerOdds
//
/*This program generates a poker hand of 5 and shows the user the cards' ranks
and suits. The program then prompts the user if they would like another hand to 
be generated. If the user quits, then the program randomly generates 10000 hands 
and counts the number of times that a hand with a pair of a specific rank occurs 
along with the number of hands that do not have a pair. 
*/

import java.util.Random;    //imports Random generator
import java.util.Scanner;   //imports Scanner

public class PokerOdds{ //creates public class
    
    public static void showHands() {    //creates showHands method
        for(int repeat = 0; repeat<10000; repeat++) {   //repeats unless user enters input other than 'y' or 'Y'
            Random shuffle = new Random();  //random generator to shuffle cards
            
            int[] deck = new int[52];   //array to represent entire deck
            for(int i = 0; i<deck.length; i++) {    //initialize cards
                deck[i] = i;
            }
        
            int[] hand = new int[5];    //array to represent poker hand
            for(int i = 0; i<hand.length; i++) {    //initialize hand all to -1
                hand[i] = -1;
            }
        
            for(int i = 0; i<deck.length; i++) {    //shuffles the cards
            
                int index = shuffle.nextInt(deck.length);
                int temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }
        
            for(int i = 0; i<hand.length; i++) {    //draws 5 cards without replacement
                int temp = hand[i];
                hand[i] = deck[i];
                deck[i] = temp;
            }
            
            /* reorders the cards from minimum to maximum according to hand[]. Allows the cards to be 
            displayed from greatest rank to smallest. */
            for(int i = 0; i<hand.length-1; i++) {  
                int currentMin = hand[i];
                int currentMinIndex = i;
                
                for(int j = i+1; j<hand.length; j++) {
                    if(currentMin > hand[j]) {
                        currentMin = hand[j];
                        currentMinIndex = j;
                    }
                }
                
                if(currentMinIndex != i) {
                    hand[currentMinIndex] = hand[i];
                    hand[i] = currentMin;
                }
            }
            
            /*creates separate arrays for each suit. Right now they are blank, so nothing will print if 
            **no cards of that suit are selected. */
            
            String[] spades = {"", "", "", "", "", ""};
            String[] hearts = {"", "", "", "", "", ""};
            String[] diamonds = {"", "", "", "", "", ""};
            String[] clubs = {"", "", "", "", "", ""};
            
            //creates an array and an array element will be printed out according to the hand of cards drawn. 
            String[] rank = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"}; 
            
            /*sets a place rank so that each card rank will be placed next to each other if there are multiple cards of the same
            **suit drawn. This rank number will continually increase when a card of that suit is drawn. */
            int place1 = 0; //clubs
            int place2 = 0; //diamonds
            int place3 = 0; //hearts
            int place4 = 0; //spades
            
            for(int i = 0; i<hand.length; i++) {    //assigns array of separate suits equal to the rank of the 5 cards
                
                if(hand[i]/13 == 0) {   //if a club is drawn
                    for(int j = 0; j<rank.length; j++) {    //checks the rank of the card
                        if(hand[i]%13 == j) {   //when the rank of the card is found, place1 will increase and the clubs' place will be set equal to rank.
                            clubs[place1] = rank[j];
                            place1++;
                        }
                    }
                }
                if(hand[i]/13 == 1) {   //if a diamond is drawn
                    for(int j = 0; j<rank.length; j++) {    //checks the rank of the card
                        if(hand[i]%13 == j) {   //when the rank of the card is found, place2 will increase and the diamonds' place will be set equal to rank.
                            diamonds[place2] = rank[j];
                            place2++;
                        }
                    }
                }
                if(hand[i]/13 == 2) {   //if a heart is drawn
                    for(int j = 0; j<rank.length; j++) {    //checks the rank of the card
                        if(hand[i]%13 == j) {   //when the rank of the card is found, place3 will increase and the hearts' place will be set equal to rank.
                            hearts[place3] = rank[j];
                            place3++;
                        }
                    }
                }
                if(hand[i]/13 == 3) {   //if a spade is drawn
                    for(int j = 0; j<rank.length; j++) {    //checks the rank of the card
                        if(hand[i]%13 == j) {   //when the rank of the card is found, place4 will increase and the clubs' place will be set equal to rank.
                            spades[place4] = rank[j];
                            place4++;
                        }
                    }
                }
            }//ends array suit assignment loop
            
            //prints out the results
            System.out.println("Clubs:    " + clubs[0] + " " + clubs[1] + " " + clubs[2] + " " + clubs[3] + " " + clubs[4]);
            System.out.println("Diamonds: " + diamonds[0] + " " + diamonds[1] + " " + diamonds[2] + " " + diamonds[3] + " " + diamonds[4]);
            System.out.println("Hearts:   " + hearts[0] + " " + hearts[1] + " " + hearts[2] + " " + hearts[3] + " " + hearts[4]);
            System.out.println("Spades:   " + spades[0] + " " + spades[1] + " " + spades[2] + " " + spades[3] + " " + spades[4]);
            System.out.println();
            
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");    //prompts user to draw another hand
            
            Scanner myscan = new Scanner(System.in);    //creates new Scanner
            String again;
            
            if(myscan.hasNext()) {  //if user enters a string
                again = myscan.next();
                if(again.equals("y") || again.equals("Y")){ //if user enters 'y' or 'Y', showHands method repeats
                    continue;
                }
                else{//when 'y' or 'Y' is not entered, the outermost loop ends.
                    break;
                }
            }
        }//ends the for loop to repeat according to user input
    }//ends showHands method
    
    
    
    
    public static void simulateOdds() {
        
        //constants in the beginning
        int noMatches = 0;  //the total number when there was not exactly one pair.
        int[] totalRankMatches = {0,0,0,0,0,0,0,0,0,0,0,0,0};   //the total number of times one pair according to rank was dealt
        
        for(int i = 0; i<10000; i++) {  //repeats 10,000 deals
            Random shuffle = new Random(); //random generator to shuffle cards
            
            int[] deck = new int[52];   //array to represent entire deck
            for(int j = 0; j<deck.length; j++) {    //initialize cards
                deck[j] = j;
            }
        
            int[] hand = new int[5];    //array to represent poker hand
            for(int k = 0; k<hand.length; k++) {    //initialize hand all to -1
                hand[k] = -1;
            }
        
            for(int a = 0; a<deck.length; a++) {    //shuffles the cards
            
                int index = shuffle.nextInt(deck.length);
                int temp = deck[a];
                deck[a] = deck[index];
                deck[index] = temp;
            }
        
            for(int b = 0; b<hand.length; b++) {    //draws 5 cards without replacement
                int temp = hand[b];
                hand[b] = deck[b];
                deck[b] = temp;
            }
            
            /* reorders the cards from minimum to maximum according to hand[]. Allows the cards to be 
            displayed from greatest rank to smallest. */
            for(int c = 0; c<hand.length-1; c++) {  
                int currentMin = hand[c];
                int currentMinIndex = c;
                
                for(int d = c+1; d<hand.length; d++) {
                    if(currentMin > hand[d]) {
                        currentMin = hand[d];
                        currentMinIndex = d;
                    }
                }
                
                if(currentMinIndex != c) {
                    hand[currentMinIndex] = hand[c];
                    hand[c] = currentMin;
                }
            }
            
            int matches = 0;    //the number of matches for this hand
            int[] rankMatches = {0,0,0,0,0,0,0,0,0,0,0,0,0};    //the number of matches for this hand
            
            //compares all cards to one another to see if they match
            if(hand[0]%13 == hand[1]%13 || hand[0]%13 == hand[2]%13 || hand[0]%13 == hand[3]%13 || hand[0]%13 == hand[4]%13) {
                rankMatches[hand[0]%13]++;  //adds number of matches that the card of that specific rank has
            }
            if(hand[1]%13 == hand[2]%13 || hand[1]%13 == hand[3]%13 || hand[1]%13 == hand[4]%13) {
                rankMatches[hand[1]%13]++;  //adds number of matches that the card of that specific rank has
            }
            
            if(hand[2]%13 == hand[3]%13 || hand[2]%13 == hand[4]%13) {
                rankMatches[hand[2]%13]++;  //adds number of matches that the card of that specific rank has
            }
            if(hand[3]%13 == hand[4]%13) {
                rankMatches[hand[3]%13]++;  //adds number of matches that the card of that specific rank has
            }
        
            for(int x = 0; x<rankMatches.length; x++) { //checks all card ranks for the number of matches   
                if(rankMatches[x] > 0) {    //if a rank has a match
                    matches+= rankMatches[x];   //add the number of matches this rank has to the total matches for this hand
                }
            } 
            
            if(matches > 1 || matches == 0) {   //if there is not exactly one pair
                noMatches++;    //the total number of noMatches increases
            }
            else{   //if there is exactly one pair
                for(int y = 0; y<totalRankMatches.length; y++) {
                    totalRankMatches[y]+=rankMatches[y];    //add the number of matches for that rank from this hand to the total number of matches for the rank
                }
            }
        }//ends after 10,000 hands are generated
        
        //prints out frequency of pairs and the number of times there was not exactly one pair
        System.out.println("rank    freq of exactly one pair");
        System.out.println("   A       " + totalRankMatches[0]);
        System.out.println("   K       " + totalRankMatches[1]);
        System.out.println("   Q       " + totalRankMatches[2]);
        System.out.println("   J       " + totalRankMatches[3]);
        System.out.println("   10      " + totalRankMatches[4]);
        System.out.println("   9       " + totalRankMatches[5]);
        System.out.println("   8       " + totalRankMatches[6]);
        System.out.println("   7       " + totalRankMatches[7]);
        System.out.println("   6       " + totalRankMatches[8]);
        System.out.println("   5       " + totalRankMatches[9]);
        System.out.println("   4       " + totalRankMatches[10]);
        System.out.println("   3       " + totalRankMatches[11]);
        System.out.println("   2       " + totalRankMatches[12]);
        System.out.println("-----------------------------");
        System.out.println("total not exactly one pair: " +noMatches);
    }//ends simulateOdds method
    
    public static void main(String [] arg){ //creates main method
        showHands();    //calls for showHands method
        simulateOdds(); //calls for simulateOdds method
    } //ends main method
}//ends public class