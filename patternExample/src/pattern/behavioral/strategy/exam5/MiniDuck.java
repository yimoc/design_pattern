package pattern.behavioral.strategy.exam5;

public class MiniDuck extends Duck {
	
	public MiniDuck(){
		iFlyBehavior = new FlyWithWings();
		iQuckBehavir = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Mini duck");

	}

}
