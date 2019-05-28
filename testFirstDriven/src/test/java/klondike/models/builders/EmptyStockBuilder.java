package klondike.models.builders;

import klondike.models.Stock;

public class EmptyStockBuilder {

	public Stock build() {
		Stock stock = new Stock();
		while (!stock.isEmpty()) {
			stock.pop();
		}
		return stock;
	}
}
