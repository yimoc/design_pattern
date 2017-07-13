package pattern.structural.adapter.exam1;

public class Socket {

	public Volt getVolt() {
		return new Volt(120);
	}
}
