package pattern.structural.proxy.exam1;


public class ProxyImage implements Image{
	
	private String filename;
	private Image image;
	
	public ProxyImage(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void displayImage() {
		if (this.image == null)
			image = new RealImage(filename);
		image.displayImage();
		
	}
	
	

}
