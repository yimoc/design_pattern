package pattern.creational.factory.exam;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;

		if(type.equals("cheese")) pizza = new NYStyleCheesePizza();
		if(type.equals("peper")) pizza = new NYStylePepperoniPizza();
		if(type.equals("clam")) pizza = new NYStyleClamPizza();
		if(type.equals("veggie")) pizza = new NYStyleVeggiePizza();
		return pizza;
	}

	public class NYStyleCheesePizza extends Pizza{
		public NYStyleCheesePizza() {

			this.name = "NY Style CheesePizza";
			this.dough = "Thin Crust Dough";
			this.sauce = "Marinara Sauce";
			this.toppings.add("Grated Reggiano Cheese");
		}
	 }

	public class NYStylePepperoniPizza extends Pizza{
		public NYStylePepperoniPizza() {

			this.name = "NY Style CheesePizza";
			this.dough = "Thin Crust Dough";
			this.sauce = "Marinara Sauce";
			this.toppings.add("NYStylePepperoniPizza");
		}
	 }

	public class NYStyleClamPizza extends Pizza{
		public NYStyleClamPizza() {

			this.name = "NY Style NYStyleClamPizza";
			this.dough = "Thin Crust Dough";
			this.sauce = "Marinara Sauce";
			this.toppings.add("GNYStyleClamPizza");
		}
	 }

	public class NYStyleVeggiePizza extends Pizza{
		public NYStyleVeggiePizza() {

			this.name = "NY Style NYStyleVeggiePizza";
			this.dough = "Thin Crust Dough";
			this.sauce = "Marinara Sauce";
			this.toppings.add("Grated NYStyleVeggiePizza Cheese");
		}
	 }

}


