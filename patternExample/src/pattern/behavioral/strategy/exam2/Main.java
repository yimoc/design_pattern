package pattern.behavioral.strategy.exam2;

public class Main {

	public static void main(String[] args) {
		Character character1 = new Character(new KnifeBehavior());
		character1.fight();
		
		Character character2 = new Character(new AxeBehavior());
		character2.fight();
		
		character2.setWeapon(new KnifeBehavior());
		character2.fight();

	}

}
