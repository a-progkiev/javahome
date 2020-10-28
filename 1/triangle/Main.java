package triangle;

public class Main {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle(1, 1, 10);
		Triangle triangle2 = new Triangle();

		triangle2.setSide1(5);
		triangle2.setSide2(5);
		triangle2.setSide3(5);

		System.out.println(triangle1.s());
		System.out.println(triangle2.s());

	}

}
