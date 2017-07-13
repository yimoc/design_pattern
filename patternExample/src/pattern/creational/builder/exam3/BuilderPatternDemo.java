package pattern.creational.builder.exam3;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		PersonInfoBuilder personInfoBuilder = new PersonInfoBuilder();
		
		PersonInfo result = personInfoBuilder
				.setName("Mistake")
				.setAge(20)
//				.setFavoriteAnimal("cat")
//                .setFavoriteColor("black")
//                .setName("JDM") // �ٽ� ���� �޼ҵ带 ȣ���Ѵٸ� ���߿� ȣ���� ���� ���ϴ�.
//                .setFavoriteNumber(7)
                .build();
		
		System.out.println(result);

	}
}
