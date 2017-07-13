package pattern.behavioral.mediator.exam1;

public class ColleagueB extends Colleague {
	public ColleagueB(IMediator mediator) {
        this.mediator = mediator;
        this.mediator.registerB(this);
    }
    
    public void doSomething() {
        this.mediator.fight();
    }

}
