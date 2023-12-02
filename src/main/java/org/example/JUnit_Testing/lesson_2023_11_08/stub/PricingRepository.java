package org.example.JUnit_Testing.lesson_2023_11_08.stub;

public class PricingRepository {

	// [... other methods ...]

	public Price getPriceForTrade(Trade trade) {
		return trade.price;
	}
}