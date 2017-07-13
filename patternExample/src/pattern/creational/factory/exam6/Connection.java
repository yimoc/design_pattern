package pattern.creational.factory.exam6;

public interface Connection {
	public String description();
	public void open();
	public void close();

}

class SQLConnection implements Connection{

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
}

class OracleConnection implements Connection{

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
}

class MySQLConnection implements Connection{

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
}