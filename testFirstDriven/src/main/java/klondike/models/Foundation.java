package klondike.models;

import java.util.Stack;

public class Foundation {

    private Suit suit;
    private Stack<Card> cards;
    public Foundation(Suit suit) {
    	this.cards = new Stack<Card>();
    	this.suit = suit;
    }
    
    public boolean isEmpty() {
        return this.cards.empty();
    }

    public Card peek() {
        return this.cards.peek();
    }

    public Card pop() {
        return this.cards.pop();
    }

    public void push(Card card) {
    	assert card != null;
        this.cards.push(card);
    }
    
    public boolean isComplete() {
        return this.cards.size() == Number.values().length;
    }

    public boolean fitsIn(Card card) {
        assert card != null;
        return card.getSuit() == this.suit &&
                (card.getNumber() == Number.AS ||
                        (!this.isEmpty() && card.isNextTo(this.peek())));
    }

    public Suit getSuit() {
        return this.suit;
    }

}
