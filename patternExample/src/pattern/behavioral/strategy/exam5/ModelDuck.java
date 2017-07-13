package pattern.behavioral.strategy.exam5;

public class ModelDuck extends Duck {
	
	public ModelDuck() {
		iFlyBehavior = new NoFly();
		iQuckBehavir = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Model Duck...");

	}

}
