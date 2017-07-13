package pattern.behavioral.chainofresp.exam2;

public abstract class Logger {
	public static int ERR = 3;
	public static int NOTICE = 5;
	public static int DEBUG = 7;
	protected int mask;
	
	protected Logger next;
	
	public Logger setNext(Logger log){
		this.next = log;
		return log;
	}
	public void message(String msg, int priority){
		if (priority <= mask){
			writeMessage(msg);
		}
		if (this.next != null){
			this.next.message(msg, priority);
		}
	}
	
	abstract protected void writeMessage(String msg);

}
