package pattern.behavioral.strategy.exam4;

public class Context {
	Operation operation;
	
	public Context(Operation operation){
		this.operation = operation;
	}
	
	public int executeStrategy(int x, int y){
		return operation.calculator(x, y);
	}
}
