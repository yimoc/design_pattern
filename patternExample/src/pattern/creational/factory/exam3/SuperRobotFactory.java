package pattern.creational.factory.exam3;

public class SuperRobotFactory extends RobotFactory {

	@Override
	public Robot createRobot(String name) {
		switch (name) {
		case "super":
			return new SuperRobot();
		case "power":
			return new PowerRobot();
		default:
			return null;
		}
	}

}
