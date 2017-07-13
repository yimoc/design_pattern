package pattern.creational.builder.exam1;

public interface ICarBuilder {
	Car build();
	ICarBuilder setColor(final String color);
	ICarBuilder setWheels(final int wheels);

}
