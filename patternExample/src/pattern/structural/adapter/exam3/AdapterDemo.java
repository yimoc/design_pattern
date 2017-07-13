package pattern.structural.adapter.exam3;

public class AdapterDemo {
		public static void main(String[] args) {
			Duck duck = new MallardDuck();
	        
	        WildTurkey turkey = new WildTurkey();
	        Duck turkeyAdapter = new TurkeyAdapter(turkey);
	
	        System.out.println("The turkey says...");
	        turkey.gobble();
	        turkey.fly();
	
	        System.out.println("The Duck says...");
	        testDuck(duck);
	
	        System.out.println("The TurkeyAdapter says...");
	        testDuck(turkeyAdapter);
	}
	
	public static void testDuck(Duck duck){ 
	         duck.quack();
	         duck.fly();
	}

}
