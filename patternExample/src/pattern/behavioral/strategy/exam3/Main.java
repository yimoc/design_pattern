package pattern.behavioral.strategy.exam3;

public class Main {

	public static void main(String[] args) {
		SortManager manager = new SortManager();
		manager.setSort(new BubbleSort());
		manager.sort();
		
		manager.setSort(new QuickSort());
		manager.sort();
		
		manager.setSort(new MergeSort());
		manager.sort();

	}

}
