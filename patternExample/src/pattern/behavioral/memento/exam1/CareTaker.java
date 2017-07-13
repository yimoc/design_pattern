package pattern.behavioral.memento.exam1;

import java.util.ArrayList;
import java.util.List;

import pattern.behavioral.memento.exam1.Originator.Memento;

public class CareTaker {
	private List<Memento> mementoList = new ArrayList<Memento>();
	
	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}
	 
}
