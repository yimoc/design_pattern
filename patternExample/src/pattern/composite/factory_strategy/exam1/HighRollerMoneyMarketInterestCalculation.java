package pattern.composite.factory_strategy.exam1;

public class HighRollerMoneyMarketInterestCalculation implements
		InterestCalculationStrategy {

	@Override
	public double calculateInterest(double accountBalance) {
        return accountBalance < 100000.00 ? 0 : accountBalance * (0.075/12);
	}

}
