package phone;

public class Main {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.setNumber(12345);
		phone1.register(phone1);
		Phone phone2 = new Phone(54321);
		phone2.register(phone2);
		Phone phone3 = new Phone(11111);
		phone3.register(phone3);


		Network net = new Network();
		System.out.println(net.toString());
		
	}

}
