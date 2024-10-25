package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<Card>();

    public Deck(){
        initCard();
        shuffle();
    }
    private void initCard(){
        for (int i = 1; i < 14; i++) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(i,suit));
            }
        }
    }
    private void shuffle(){
        Collections.shuffle(cards);
    }

    public Card drawCard(){
        return cards.removeFirst(); //java21 이상에 들어가 있다.
    }
}
