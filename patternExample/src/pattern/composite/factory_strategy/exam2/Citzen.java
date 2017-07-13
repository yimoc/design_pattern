package pattern.composite.factory_strategy.exam2;

public class Citzen implements TaxStrategy {

	@Override
	public void calculateTax() {
		System.out.println("calculate citzen");

	}

}
