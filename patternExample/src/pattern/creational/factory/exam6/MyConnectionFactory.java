package pattern.creational.factory.exam6;

import pattern.creational.factory.exam6.Connection;

public class MyConnectionFactory implements ConnectionFactory {
	public String type;
	public MyConnectionFactory(String type){
		this.type = type;
	}

	@Override
	public Connection createConnection() {
		if (type.equals("Oracle")){
			return new OracleConnection();
		} else if (type.equals("SQL")){
			return new SQLConnection();
		} else
			return new MySQLConnection();
	}

}
