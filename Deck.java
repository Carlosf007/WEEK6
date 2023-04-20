package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        for (String suit : suits) {
            for (int i = 2; i <= 14; i++) {
                String name;
                if (i == 11) {
                    name = "Jack";
                } else if (i == 12) {
                    name = "Queen";
                } else if (i == 13) {
                    name = "King";
                } else if (i == 14) {
                    name = "Ace";
                } else {
                    name = Integer.toString(i);
                }
                name += " of " + suit;
                Card card = new Card(i, name);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }
}