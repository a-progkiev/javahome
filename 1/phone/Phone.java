package phone;

public class Phone {

	private int number;

	public Phone() {
		super();

	}

	public Phone(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void register(Phone phone) {
		Network net = new Network();
		net.phones = net.getPhones();

		for (int j = 0; j <= net.phones.length; j++) {
			if (net.phones[j] == null) {
				net.phones[j] = phone;
				System.out.println("Номер успешно зарегистрирован!");
				break;
			}
			System.out.println("В сети нет места для нового номера");
		}

		net.setPhones(net.phones);
	}

	public void call(Phone phone) {
		Network net = new Network();

		for (int j = 0; j <= net.phones.length; j++) {
			if (net.phones[j] == phone) {
				System.out.println("Идет звонок");
				break;
			}
			System.out.println("Данный абонент в сети не зарегистрирован");

		}
	}
}
