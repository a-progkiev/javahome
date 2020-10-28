package phone;

import java.util.Arrays;

public class Network {
	public Phone[] phones = new Phone[10];
	

	public Network() {
		super();
		
	}

	public Phone[] getPhones() {
		return phones;
	}


	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Network [phones=" + Arrays.toString(phones) + "]";
	}


	
	
	
	
}
