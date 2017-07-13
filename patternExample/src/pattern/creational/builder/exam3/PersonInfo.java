package pattern.creational.builder.exam3;

public class PersonInfo {
	String name;
	int age;
	public void setName(String string) {
		this.name = string;
		
	}
	public void setAge(int i) {
		this.age = i;
		
	}
	@Override
	public String toString() {
		return "PersonInfo [name=" + name + ", age=" + age + "]";
	}
	
	

}
