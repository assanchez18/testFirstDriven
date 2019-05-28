package klondike.models;

import java.util.Stack;

public class Waste implements IStack {
	
	private Stack<Card> cards;
	
	public Waste() {
		this.cards = new Stack<Card>();
	}
	
	public boolean isEmpty() {
		return this.cards.empty();
	}
	
	public Card peek() {
		return this.cards.peek();
	}
	
	public Card pop() {
		return cards.pop();
	}
	
	public void push(Card card) {
		assert card != null;
		this.cards.push(card);
	}
	
	
}
