package pattern.creational.factory.exam4;

public abstract class Product {
	public abstract String getName();
	public abstract int getPrice();
	
	
	@Override
	public String toString() {
		return "Product [getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
