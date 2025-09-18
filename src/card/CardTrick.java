/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * Name: Jagtar Singh
 * StudentID: 991812317
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(r.nextInt(13) + 1);        
            c.setSuit(Card.SUITS[r.nextInt(4)]);  
            magicHand[i] = c;
            
        }
        
        System.out.println("Magic Hand:");
        for (int i = 0; i < magicHand.length; i++) {
            System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }

        
        System.out.print("Enter a card value (1-13): ");
        int cardValue = sc.nextInt();
        System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int suitNum = sc.nextInt();
        String cardSuit = Card.SUITS[suitNum];
               

        Card luckyCard = new Card(1, "Clubs");

        boolean lucky = false;
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getValue() == cardValue && magicHand[i].getSuit().equals(cardSuit)) {
                lucky = true;
            }
        }

        if (lucky) {
            System.out.println("Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
    
}
