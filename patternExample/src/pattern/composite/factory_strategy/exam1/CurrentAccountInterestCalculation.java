package pattern.composite.factory_strategy.exam1;

public class CurrentAccountInterestCalculation implements
		InterestCalculationStrategy {

	@Override
	public double calculateInterest(double accountBalance) {
		return accountBalance * (0.02 / 12);
	}

}



