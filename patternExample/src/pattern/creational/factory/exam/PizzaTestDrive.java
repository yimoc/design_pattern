package pattern.creational.factory.exam;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();		

		Pizza nySytpePizza = nyStore.orderPizza("cheese");

		System.out.println(nySytpePizza.getname());
		System.out.println();
		Pizza chicagoStypePizza = chicagoStore.orderPizza("cheese");
		System.out.println(chicagoStypePizza.getname());

	}
 } 
