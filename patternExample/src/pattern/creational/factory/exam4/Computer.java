package pattern.creational.factory.exam4;

public class Computer extends Product {
	private String name;
	private int price;
	
	public Computer(String name, int price){
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return this.name; 
	}

	@Override
	public int getPrice() {
		return this.price;
	}
	
	
	public void toStrig () {
        System.out.println("�׸� :: " + this.name + ", ���� :: "+ this.price);
    }


}
