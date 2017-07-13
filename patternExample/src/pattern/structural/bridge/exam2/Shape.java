package pattern.structural.bridge.exam2;

public abstract class Shape {
	
	protected DrawAPI drawAPI;
	
	protected Shape(DrawAPI api){
		this.drawAPI = api;
	}
	
	public abstract void draw();

}
