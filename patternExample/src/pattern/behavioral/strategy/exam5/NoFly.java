package pattern.behavioral.strategy.exam5;

public class NoFly implements IFlyBehavior {

	@Override
	public void doFly() {
		System.out.println("I can't fly");

	}

}
