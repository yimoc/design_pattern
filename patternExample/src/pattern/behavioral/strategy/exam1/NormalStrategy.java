package pattern.behavioral.strategy.exam1;

public class NormalStrategy implements BillingStrategy {

	@Override
	public double getActPrice(double rawPrice) {
		return rawPrice;
	}

}
