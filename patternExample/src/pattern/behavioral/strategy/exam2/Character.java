package pattern.behavioral.strategy.exam2;

public class Character {
	Behavior behavior;
	
	public Character(Behavior behavior){
		this.behavior = behavior;
	}
	
	public void fight(){
		behavior.fight();
	}

	public void setWeapon(Behavior behavior) {
		this.behavior = behavior;
		
	}
}
