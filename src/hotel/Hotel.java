package hotel;

public class Hotel {

	private int numOfUsedRooms;
	private Room[][] allRooms = new Room [100][10];
	private int numOfFloors;
	private int numOfRoomsEachFloor;

	public Hotel(int numOfFloors , int numOfRoomsEachFloor) {
		setNumOfFloors(numOfFloors);	
		setNumOfRoomsEachFloor(numOfRoomsEachFloor);	

		for (int i = 0; i < numOfFloors; i++) {
			for (int j = 0; j < numOfRoomsEachFloor; j++) {
				allRooms[j][i] = new Room(0);
				allRooms[j][i].setNumOfBeds ((int)(Math.random() * 5));
			}
		}


	}


	public int getNumOfFloors() {
		return numOfFloors;
	}




	public void setNumOfFloors(int numOfFloors) {
		this.numOfFloors = numOfFloors;
	}


	public int getNumOfRoomsEachFloor() {
		return numOfRoomsEachFloor;
	}


	public void setNumOfRoomsEachFloor(int numOfRoomsEachFloor) {
		this.numOfRoomsEachFloor = numOfRoomsEachFloor;
	}

	public int getNumOfUsedRooms() {
		return numOfUsedRooms;
	}
	public void setNumOfUsedRooms(int numOfUsedRooms) {
		this.numOfUsedRooms = numOfUsedRooms;
	}
	public Room[][] getAllRooms() {
		return allRooms;
	}
	public void setAllRooms(Room[][] allRooms) {
		this.allRooms = allRooms;
	}

	public int Guest (Guest[] Guests) {

		for (int i = 0; i < numOfFloors; i++) {
			for (int j = 0; j < numOfRoomsEachFloor; j++) 
			{
				{
					if (allRooms[j][i].getAllGuests()[0]==null&&allRooms[j][i].getNumOfBeds() >= Guests.length) 
					{
						allRooms[j][i].setAllGuests(Guests);
						allRooms[j][i].setNumOfUsedBeds(Guests.length);
						int num = 0;
						num+= (i+1)*100;
						num+= (j+1); 

						return num;
					}
				}
			}
		}
		return -1;

	}

	public int RoomNumber (int PassportNumber) {

		for (int i = 0; i < numOfFloors; i++) {
			for (int j = 0; j < numOfRoomsEachFloor; j++) {
				if (allRooms[j][i].searchPassportId(PassportNumber) == 1) {
					int num = 0;
					num+= (i)*100+ (j+1); 

					return num;	

				}
			}

		}

		return -1;

	}

	public int MostSpacedRoom()
	{
		int i,j,counter;
		counter=0;
		int MAX=-1;
		int floorMAX=0;
		for(i=0;i<numOfFloors;i++)
		{
			for(j=0;j<numOfRoomsEachFloor;j++)
			{

				if((allRooms[j][i].getAllGuests()[0]==null))
				{
					counter++;
				}

			}
			if(counter>MAX)
			{
				MAX=counter;
				floorMAX=i;
			}
			counter=0;   		
		}
		return floorMAX+1;
	}

}
