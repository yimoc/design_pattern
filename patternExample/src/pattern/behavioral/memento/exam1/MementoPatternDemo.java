package pattern.behavioral.memento.exam1;

public class MementoPatternDemo {
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.set("State1");
		originator.set("State2");
		careTaker.add(originator.saveToMemento());
		
		originator.set("State3");		
		careTaker.add(originator.saveToMemento());
		
		originator.set("State4");
		
		originator.restoreFromMemento(careTaker.get(1));
	}
}
