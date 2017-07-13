package pattern.creational.builder.exam1;

public class CarBuildDirector {
	private ICarBuilder builder;
	
	public CarBuildDirector(final ICarBuilder builder){
		this.builder = builder;
	}
	
	public Car construct(){
		return builder.setColor("red").setWheels(4).build();
	}
	
	public static void main(String [] args){
		ICarBuilder builder = new CarBuilder();
		CarBuildDirector carBuilderDirector = new CarBuildDirector(builder);
		
		System.out.println(carBuilderDirector.construct());
	}

}
