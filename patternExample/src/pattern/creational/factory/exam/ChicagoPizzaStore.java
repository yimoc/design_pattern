package pattern.creational.factory.exam;

public class ChicagoPizzaStore extends PizzaStore {
	@Override

	public Pizza createPizza(String type){

		Pizza pizza = null;

		if(type.equals("cheese")) pizza = new ChicagoStyleCheesePizza();
		if(type.equals("peper")) pizza = new ChicagoStylePepperoniPizza();
		if(type.equals("clam")) pizza = new ChicagoStyleClamPizza();
		if(type.equals("veggie")) pizza = new ChicagoStyleVeggiePizza();

		return pizza;

	}
	
	public class ChicagoStyleCheesePizza extends Pizza{
		public ChicagoStyleCheesePizza() {
			this.name = "Chicago Style CheesePizza";
			this.dough = "Extra Thick Crust Dough";
			this.sauce = "Plum Tomato Sauce";
			this.toppings.add("Shredded mozzarella Cheese");
		}
		
		@Override		
		public void cut() {
			System.out.println("Cutting the pizza into square slices");
		}
	 }
	
	public class ChicagoStylePepperoniPizza extends Pizza{
		public ChicagoStylePepperoniPizza() {
			this.name = "Chicago Style CheesePizza";
			this.dough = "Extra Thick Crust Dough";
			this.sauce = "Plum Tomato Sauce";
			this.toppings.add("Shredded mozzarella Cheese");
		}
		
		@Override		
		public void cut() {
			System.out.println("Cutting the pizza into square slices");
		}
	 }
	
	public class ChicagoStyleClamPizza extends Pizza{
		public ChicagoStyleClamPizza() {
			this.name = "Chicago Style CheesePizza";
			this.dough = "Extra Thick Crust Dough";
			this.sauce = "Plum Tomato Sauce";
			this.toppings.add("Shredded mozzarella Cheese");
		}
		
		@Override		
		public void cut() {
			System.out.println("Cutting the pizza into square slices");
		}
	 }

	public class ChicagoStyleVeggiePizza extends Pizza{
		public ChicagoStyleVeggiePizza() {
			this.name = "Chicago Style CheesePizza";
			this.dough = "Extra Thick Crust Dough";
			this.sauce = "Plum Tomato Sauce";
			this.toppings.add("Shredded mozzarella Cheese");
		}
		
		@Override		
		public void cut() {
			System.out.println("Cutting the pizza into square slices");
		}
	 }


}
