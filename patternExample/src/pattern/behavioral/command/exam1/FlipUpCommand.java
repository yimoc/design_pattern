package pattern.behavioral.command.exam1;

public class FlipUpCommand implements Command {
	private Light light;

	public FlipUpCommand(Light light){
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.turnOn();

	}

}
