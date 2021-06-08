/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 * Name: Agampodi De Silva
 * Student ID: 991630823
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        String symbol = null;
        int check=1;
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(1+(int) (Math.random() * 13));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[(0+(int) (Math.random()*4))]);
            magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Please choose the suit: 0 for Hearts, 1 for Diamonds, 2 for Spades or 3 for Clubs.");
        Scanner input = new Scanner(System.in);
        int suit = input.nextInt();
        
        System.out.println("Please enter a number between 0-13 for your card.");
        input = new Scanner(System.in);
        int value = input.nextInt();
        // and search magicHand here
        if (suit == 0)
            symbol = "Hearts";
            else if (suit ==1)
            symbol = "Diamonds";
            else if (suit ==2)
            symbol = "Spades";
            else if (suit ==3)
            symbol = "Clubs";
        //Then report the result here    
        System.out.println("Cards generated: ");
         for (int x=0; x<magicHand.length; x++){
             
             System.out.println(magicHand[x].getValue() +" "+ magicHand[x].getSuit());
                
             if (value == magicHand[x].getValue() && symbol == magicHand[x].getSuit()){
                    System.out.println("The value you entered: "+value);
                    System.out.println("The suit you entered: "+ symbol);
                    System.out.println("The card " + value +" " + symbol+ " is AVAILABLE!");
                } 
                else {
                check = 0;
                }
                      
         }
         if (check==0){
         System.out.println("The value you entered: "+value);
         System.out.println("The suit you entered: "+ symbol);    
         System.out.println("The card " + value +" " + symbol+ " is NOT AVAILABLE!");
         }
         Card luckyCard = new Card();
         luckyCard.setValue(5);
         luckyCard.setSuit(Card.SUITS[2]);
         System.out.println("Lucky card is: "+ luckyCard.getValue() + " "+luckyCard.getSuit());         }
   
}
