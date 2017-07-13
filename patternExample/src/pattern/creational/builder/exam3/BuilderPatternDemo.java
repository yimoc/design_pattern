package pattern.creational.builder.exam3;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		PersonInfoBuilder personInfoBuilder = new PersonInfoBuilder();
		
		PersonInfo result = personInfoBuilder
				.setName("Mistake")
				.setAge(20)
//				.setFavoriteAnimal("cat")
//                .setFavoriteColor("black")
//                .setName("JDM") // 다시 같은 메소드를 호출한다면 나중에 호출한 값이 들어갑니다.
//                .setFavoriteNumber(7)
                .build();
		
		System.out.println(result);

	}
}
