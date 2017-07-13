package pattern.behavioral.memento.exam1;

public class Originator {
	private String state;
	
	public void set(String s){
		this.state = s;
		System.out.println("Originator: Setting state to " + state);
	}
	
	public Memento saveToMemento(){
		System.out.println("Originator: Saving to Memento");
		return new Memento(this.state);
	}
	
	public void restoreFromMemento(Memento memento){
		this.state = memento.getSavedState();
		System.out.println("Originator: State after restoring from Memento: "+ state);
	}
	
	public static class Memento{
		private final String state;
		
		public Memento(String stateToSave){
			this.state = stateToSave;
		}
		
		private String getSavedState(){
			return state;
		}
	}
	
}
