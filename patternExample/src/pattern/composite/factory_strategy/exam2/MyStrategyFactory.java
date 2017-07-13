package pattern.composite.factory_strategy.exam2;

public class MyStrategyFactory implements StrategyFactoyr {
	String type;
	
	public MyStrategyFactory(String type){
		this.type = type;
	}

	@Override
	public TaxStrategy getStrategy() {
		if (type.equals("Citzen"))
			return new Citzen();
		else 
			return new OldCitzen();
	}

}
