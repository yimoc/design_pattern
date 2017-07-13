package pattern.creational.builder.exam1;

public class CarBuilder implements ICarBuilder {
	private Car car;

	public CarBuilder(){
		this.car = new Car();
	}
	@Override
	public Car build() {
		return car;
	}

	@Override
	public ICarBuilder setColor(String color) {
		car.setColor(color);
		return this;
		
	}

	@Override
	public ICarBuilder setWheels(int wheels) {
		car.setWheels(wheels);
		return this;
	}

}
