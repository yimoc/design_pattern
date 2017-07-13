package pattern.behavioral.strategy.exam1;

import java.util.List;

public class Customer {
	
	private BillingStrategy strategy;
	private List<Double> drinks;

	public Customer(BillingStrategy strategy) {
		this.strategy = strategy;
	}

	public void add(double price, int quantity) {
		drinks.add(strategy.getActPrice(price*quantity));
	}

	public void setStrategy(BillingStrategy strategy) {
		this.strategy = strategy;
		
	}

	public void printBill() {
		double sum = 0;
        for (Double i : drinks) {
            sum += i;
        }
        System.out.println("Total due: " + sum);
        drinks.clear();
	}

}
