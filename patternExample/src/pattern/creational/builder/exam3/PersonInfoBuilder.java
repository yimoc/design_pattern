package pattern.creational.builder.exam3;

public class PersonInfoBuilder {
	PersonInfo person;
	
	public PersonInfoBuilder(){
		this.person = new PersonInfo();
	}
	
	PersonInfo build(){
		return this.person;
	}

	public PersonInfoBuilder setName(String string) {
		person.setName(string);
		return this;
	}

	public PersonInfoBuilder setAge(int i) {
		person.setAge(i);
		return this;
	}
	
	
}
