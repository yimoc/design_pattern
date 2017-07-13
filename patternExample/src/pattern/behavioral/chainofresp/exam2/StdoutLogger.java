package pattern.behavioral.chainofresp.exam2;

public class StdoutLogger extends Logger {
	
	public StdoutLogger(int mask){
		super.mask = mask;
	}
	
	protected void writeMessage(String msg){
		System.out.println("Write to stdout" + msg);
	}
}
