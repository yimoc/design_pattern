package pattern.structural.proxy.exam1;


public class RealImage implements Image{
	
	private String filename;

	public RealImage(String filename) {
		this.filename = filename;
		loadImageFromDisk();
		
	}
	
	private void loadImageFromDisk(){
		System.out.println("Loading .." + this.filename);
	}

	@Override
	public void displayImage() {
		System.out.println("Display.." + this.filename);
		
	}
	
	

}
