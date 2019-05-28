package klondike.models;

public interface IStack {

	boolean isEmpty();
	Card peek();
	Card pop();
	void push(Card card);
	
}
