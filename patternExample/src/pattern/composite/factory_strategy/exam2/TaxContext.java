package pattern.composite.factory_strategy.exam2;

public class TaxContext {
	TaxStrategy strategy;
	public void setStrategy(TaxStrategy strategy) {
		this.strategy = strategy;
		
	}

	public void calculateTax() {
		this.strategy.calculateTax();
		
	}

}
