package pattern.behavioral.command.exam1;

public class PressSwitch {
	public static void main(String[] args) {
		args = new String[]  {"OFF"};
		if (args.length != 1){
			System.err.println("Argument \"ON\" or \"OFF\" is required.");
			System.exit(-1);
		}
		
		final Light lamp = new Light();
		
		final Command switchUp = new FlipUpCommand(lamp);
		final Command switchDown = new FlipDownCommand(lamp);
		
		final Switch mySwitch = new Switch();
		
		switch (args[0]){
		case "ON":
			mySwitch.storeAndExecute(switchUp);
			break;
		case "OFF":
			mySwitch.storeAndExecute(switchDown);
			break;
		default:
			System.out.println("Arguement \"ON\" or \"OFF\" is required.");
			System.exit(-1);
		}
	}
}
