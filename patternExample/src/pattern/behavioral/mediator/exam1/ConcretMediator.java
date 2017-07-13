package pattern.behavioral.mediator.exam1;

public class ConcretMediator implements IMediator {
	ColleagueA talk;
	ColleagueB fight;
	
	@Override
	public void fight() {
		System.out.println("Mediator is fighting");
	}

	@Override
	public void talk() {
		System.out.println("Mediator is talking");
	}

	@Override
	public void registerA(ColleagueA a) {
		this.talk = a;
	}

	@Override
	public void registerB(ColleagueB b) {
		this.fight = b;
	}

}
