package org.example.JUnit_Testing.lesson_2023_11_08.stub;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class SimplePricingService implements PricingService {

	PricingRepository repository;

	public SimplePricingService(PricingRepository pricingRepository) {
		this.repository = pricingRepository;
	}

	@Override
	public Price getHighestPricedTrade(Collection<Trade> trades) {
		Trade[] tradesArr = trades.toArray(new Trade[0]);
		Comparator<Trade> comp =
                Comparator.comparingDouble(t -> t.price.getAmount());
		Arrays.sort(tradesArr, comp);
		return tradesArr[tradesArr.length - 1].price;
	}

	// [... other overridden methods from PricingService interface...]

}