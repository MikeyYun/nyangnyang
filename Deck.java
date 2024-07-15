package collection.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();
    public Deck() {
        intiCard();
        shuffle();
    }
    public void intiCard() {
        for (int i = 1; i <= 13; i++) {
            Suit[] values = Suit.values();
            for (Suit suit : Suit.values()) {
                cards.add(new Card(i, suit));
            }
        }
    }
    private void shuffle() {
        Collections.shuffle(cards);
    }
    public Card drawCard() {
        return cards.removeFirst();
    }
}
