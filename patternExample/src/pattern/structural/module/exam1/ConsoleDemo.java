package pattern.structural.module.exam1;

public class ConsoleDemo {
	public static MainModule console = null;
	
	public static void prepare(){
		console = MainModule.getSingleton();
		console.prepare();
	}
	
	public static void unprepare(){
		console.unprepare();
	}
	
	public static void execute(String[] args){
		console.printString("Hello World");
		console.printNewLine();
		console.scanNewLine();
	}
	
	public static void main(String[] args){
		prepare();
		execute(args);
		unprepare();
	}

}
