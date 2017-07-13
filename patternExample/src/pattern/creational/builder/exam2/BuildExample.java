package pattern.creational.builder.exam2;

public class BuildExample {
	public static void main(String[] args) {
		CookDirector cook = new CookDirector();
		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
		
		cook.setPizzaBuilder(hawaiianPizzaBuilder);
		cook.constructPizza();
		
		Pizza pizza = cook.getPizza();
	}

}
