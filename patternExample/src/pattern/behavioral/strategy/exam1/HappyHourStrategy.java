package pattern.behavioral.strategy.exam1;

public class HappyHourStrategy implements BillingStrategy{

	@Override
	public double getActPrice(double rawPrice) {
		return rawPrice * 0.5;
	}

}
