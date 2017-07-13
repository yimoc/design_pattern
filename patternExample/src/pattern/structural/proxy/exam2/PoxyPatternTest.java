package pattern.structural.proxy.exam2;

public class PoxyPatternTest {
	public static void main(String [] args){
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "Wrong password");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand("rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
