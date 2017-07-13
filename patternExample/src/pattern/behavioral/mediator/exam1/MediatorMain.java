package pattern.behavioral.mediator.exam1;

public class MediatorMain {
	public static void main(String [] args){
		IMediator mediator = new ConcretMediator();
		
		ColleagueA talkColleague = new ColleagueA(mediator);
		ColleagueB fightColleague = new ColleagueB(mediator);
		
		talkColleague.doSomething();
		fightColleague.doSomething();
	}
}
