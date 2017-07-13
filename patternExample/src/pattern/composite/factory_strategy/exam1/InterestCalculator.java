package pattern.composite.factory_strategy.exam1;

public class InterestCalculator {
	private final InterestCalculationStrategyFactory interestCalculationStrategyFactory = new InterestCalculationStrategyFactory();
	
	public double calculateInterest(AccountTypes accountType, double accountBalance){
		InterestCalculationStrategy interestCalculationStrategy 
			= interestCalculationStrategyFactory.getInterestCalculationStrategy(accountType);
		
		return interestCalculationStrategy.calculateInterest(accountBalance);
		
	}

}
