package pattern.creational.builder.exam2;

public abstract class PizzaBuilder {
	protected Pizza pizza;
	
	public Pizza getPizza(){
		return this.pizza;
	}

	public void createNewPizzaProduct(){
		this.pizza = new Pizza();
	}
	
	public abstract void buildDough();
	public abstract void buildSauce();
	public abstract void buildTopping();
}
