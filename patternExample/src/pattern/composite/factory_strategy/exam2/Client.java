package pattern.composite.factory_strategy.exam2;

public class Client {

	public static void main(String[] args) {
		MyStrategyFactory m = new MyStrategyFactory("Citzen");
		TaxContext context = new TaxContext();
		context.setStrategy(m.getStrategy());
		context.calculateTax();

	}

}
