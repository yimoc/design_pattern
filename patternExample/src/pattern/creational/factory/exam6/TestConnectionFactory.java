package pattern.creational.factory.exam6;

public class TestConnectionFactory {

	public static void main(String[] args) {
		ConnectionFactory factory = new MyConnectionFactory("Oracle");
		Connection conn = factory.createConnection();

	}

}
