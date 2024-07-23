package hotel;

public class Room {

	private int numOfBeds;
	private int numOfUsedBeds;

	private Guest[] allGuests=new Guest[4];

	public Room (int NumOfBeds) 
	{
		setNumOfBeds(NumOfBeds);

	}

	public int getNumOfBeds() {
		return numOfBeds;
	}
	public void setNumOfBeds(int numOfBeds) {

		if(numOfBeds >= 1 && numOfBeds <= 4) {
			this.numOfBeds = numOfBeds;	
		}

	}
	public Guest[] getAllGuests() {
		return allGuests;
	}
	public void setAllGuests(Guest[] allGuests) {
		for(int i=0;i<allGuests.length;i++)
		{
			this.allGuests[i]=allGuests[i];
		}
	}
	public int getNumOfUsedBeds() {
		return numOfUsedBeds;
	}

	public void setNumOfUsedBeds(int numOfUsedBeds) {
		this.numOfUsedBeds = numOfUsedBeds;
	}


	public int searchPassportId(int passportNumber) {
		for (int i = 0; i < 4; i++) {
			if (allGuests[i]!=null && allGuests[i].getPassportNumber()==(passportNumber)) {
				return 1;

			}

		}

		return 0;
	}

}
