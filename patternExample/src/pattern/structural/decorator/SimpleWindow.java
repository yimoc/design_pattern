package pattern.structural.decorator;

public class SimpleWindow implements Window {

	@Override
	public void draw() {
		System.out.println("simple draw");

	}

	@Override
	public String getDescription() {
		return "simple window";
	}

}
