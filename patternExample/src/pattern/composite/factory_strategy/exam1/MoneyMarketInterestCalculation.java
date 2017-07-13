package pattern.composite.factory_strategy.exam1;

public class MoneyMarketInterestCalculation implements
		InterestCalculationStrategy {

	@Override
	public double calculateInterest(double accountBalance) {
		return accountBalance * (0.06/12);
	}

}
