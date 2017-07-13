package pattern.composite.factory_strategy.exam1;

public class SavingsAccountInterestCalculation implements
		InterestCalculationStrategy {

	@Override
	public double calculateInterest(double accountBalance) {
		return accountBalance * (0.04 / 12);
	}

}
