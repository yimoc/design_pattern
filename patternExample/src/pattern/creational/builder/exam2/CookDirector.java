package pattern.creational.builder.exam2;

public class CookDirector {
	private PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder builder){
		this.pizzaBuilder = builder;
	}
	
	public Pizza getPizza(){
		return pizzaBuilder.getPizza();
	}
	
	public void constructPizza(){
		this.pizzaBuilder.createNewPizzaProduct();
		this.pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();

	}
}
