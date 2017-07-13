package pattern.creational.factory.exam3;

public class FactoryMain {

	public static void main(String[] args) {
		RobotFactory rf = new SuperRobotFactory();
		Robot r1 = rf.createRobot("super");
		Robot r2 = rf.createRobot("power");
		
		System.out.println(r1.getName());
		System.out.println(r2.getName());
		
		RobotFactory mrf = new ModifiedSuperRobotFactory();
		Robot r3 = mrf.createRobot("pattern.factory.exam3.PowerRobot");
		Robot r4 = mrf.createRobot("pattern.factory.exam3.SuperRobot");
		
		System.out.println(r3.getName());
		System.out.println(r4.getName());
		
		
		

	}

}
