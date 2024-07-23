package hotel;


public class Guest {

	private String name;
	private int passportNumber;


	public Guest (String name , int PassportNumber) {
		setName(name);
		setPassportNumber(PassportNumber);

	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getPassportNumber() {
		return passportNumber;
	}
	private void setPassportNumber(int passportNumber) {
		if(passportNumber > 0) {
			this.passportNumber = passportNumber;
		}

	}

}
