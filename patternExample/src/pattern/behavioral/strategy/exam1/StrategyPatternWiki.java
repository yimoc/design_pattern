package pattern.behavioral.strategy.exam1;

public class StrategyPatternWiki {

	public static void main(String[] args) {
		Customer firstCustomer = new Customer(new NormalStrategy());
		
		firstCustomer.add(1.0, 1);
		
		firstCustomer.setStrategy(new HappyHourStrategy());
		firstCustomer.add(1.0, 2);
		
		Customer secondCustomer = new Customer(new HappyHourStrategy());
		secondCustomer.add(0.8, 1);
        // The Customer pays
        firstCustomer.printBill();
        
        secondCustomer.setStrategy(new NormalStrategy());
        secondCustomer.add(1.3, 2);
        secondCustomer.add(2.5, 1);
        secondCustomer.printBill();
		
		
	}
	
	

}
