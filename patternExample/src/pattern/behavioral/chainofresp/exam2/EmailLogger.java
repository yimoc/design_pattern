package pattern.behavioral.chainofresp.exam2;

public class EmailLogger extends Logger {
	public EmailLogger(int mask) {
        this.mask = mask;
    }
	@Override
	protected void writeMessage(String msg) {
		System.out.println("Sending via email: " + msg);

	}

}
