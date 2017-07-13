package pattern.behavioral.strategy.exam5;

public abstract class Duck {

	abstract public void display();

	public void performFly(){
		iFlyBehavior.doFly();
		
	}

	public void performQuack(){
		iQuckBehavir.doQuack();
		
	}
		
	IFlyBehavior iFlyBehavior;
	
	public void setFlyBehavior(IFlyBehavior behavior){
		this.iFlyBehavior = behavior;
	}
	
	IQuackBehavior iQuckBehavir;
	
	public void setQuackBehavior(IQuackBehavior behavior){
		this.iQuckBehavir = behavior;
	}
	

}
