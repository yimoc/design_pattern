package pattern.behavioral.mediator.exam1;

public class ColleagueA extends Colleague{
	
	public ColleagueA(IMediator mediator){
		this.mediator = mediator;
		this.mediator.registerA(this);
	}

	@Override
	public void doSomething() {
		this.mediator.talk();
		
	}

}
