package pattern.composite.factory_strategy.exam1;

public class NoInterestCalculation implements InterestCalculationStrategy {

	@Override
	public double calculateInterest(double accountBalance) {
		return 0;
	}

}
