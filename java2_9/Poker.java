package java2_9;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        int cardsPerPlayer = 5;
        int players = 0;
        String[] suits = {
                "Clubs", "Diamonds", "Hearts", "Spades"
        };
        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K", "A"
        };
        int n = suits.length * rank.length; // кол-во карт


        for (;;) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of players: ");
            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsPerPlayer * players <= n) {
                    break;
                } else {
                    if (players == 0) {

                        System.out.println("End Game.");
                        break;

                    } else if (players < 0) {

                        System.out.println("The number of players cannot be less than 0");

                    } else {

                        System.out.println("Too many players!");
                    }
                }

            } else {
                System.out.println("You did not enter a number, or your number is too large!");

            }
        }


        // deck building
        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }

        // shuffling
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }


        for (int i = 0; i < players * cardsPerPlayer; i++) {
            System.out.println(deck[i]);
            if (i % cardsPerPlayer == cardsPerPlayer - 1)
                System.out.println();
        }
    }
}