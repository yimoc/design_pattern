package pattern.creational.factory.exam4;

public class Main {

	public static void main(String[] args) {
		Product ticket1 = ProductFactory.getProduct("ticket", "한국여행", 300000);
		Product computer2 = ProductFactory.getProduct("computer", "pc", 15000000);
		
		System.out.println(ticket1);
		System.out.println(computer2);

	}

}
