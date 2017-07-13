package pattern.behavioral.command.exam2;

public class Stock {
	private String name ="ABC";
	private int quantity = 10;
	
	public void buy(){
		System.out.println("stock [name:" + name + ", quantity : "+ quantity +"] bought");
	}
	
	public void sell(){
		System.out.println("stock [name:" + name + ", quantity : "+ quantity +"] sold");
	}
}
