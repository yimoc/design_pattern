package pattern.structural.proxy.exam1;

public class ProxyDemo {
	public static void main(String[] args) {
		Image img1 = new ProxyImage("HiRes_10MB_photo1");
		Image img2 = new ProxyImage("HiRes_10MB_photo2");
		
		img1.displayImage();
		img2.displayImage();
	}

}
