package pattern.behavioral.command.exam1;

public class FlipDownCommand implements Command {
	Light ligth;
	
	public FlipDownCommand(Light light){
		this.ligth = light;
	}

	@Override
	public void execute() {
		this.ligth.turnOff();

	}

}
