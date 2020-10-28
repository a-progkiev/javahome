package cat;

public class Main {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Vesnushka", 3, "persian");
		cat1.setName("Boss");
		cat1.setAge(2);
		cat1.setBreed("maine coon");

		System.out.println(cat1);
		System.out.println(cat2);

	}

}
