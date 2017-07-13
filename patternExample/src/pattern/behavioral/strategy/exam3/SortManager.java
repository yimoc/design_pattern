package pattern.behavioral.strategy.exam3;

public class SortManager {
	SortStrategy sortStrategy;

	public void setSort(SortStrategy strategy) {
		this.sortStrategy = strategy;
		
	}

	public void sort() {		
		sortStrategy.doSort();		
	}
	
	

}
