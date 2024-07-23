package hotel;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// name : Elad naasa
				// id : 208461186
				// HW3_208461186
		

		Scanner s = new Scanner (System.in);

		int choise;
		boolean fContinue = true;
		Hotel Hotel;

		System.out.println("Please enter your hotel num of floors : ");
		int floors = s.nextInt();
		System.out.println("Enter your hotel num of rooms each floor : ");
		int rooms = s.nextInt();
		Hotel = new Hotel (floors,rooms);

		do {
			System.out.println();	
			System.out.println("Please enter an option (1-5)");
			System.out.println("1 - Take guests inside the hotel");
			System.out.println("2 - show room of guest by passport number");
			System.out.println("3 - show the whole guest information for each floor");
			System.out.println("4 - show which floor have the most empty rooms");
			System.out.println("5 - Exit ");
			System.out.println();

			System.out.print("Enter your choise --> : ");
			choise = s.nextInt();

			System.out.println();

			switch(choise) {


			case 1 : {
				Guest[] Family;

				System.out.println("enter your number of family memebers : ");
				int num = s.nextInt();
				Family = new Guest[num];

				System.out.printf("Please enter %d numbers for the first array : " , Family.length);
				for (int i = 0; i < num; i++) {

					String name = s.next();
					int id = s.nextInt();
					Family[i] = new Guest (name,id);

				}
				System.out.println();
				int k = Hotel.Guest(Family);


				if (k == -1) {
					System.out.println("Cant find a room for the family ");	
				}
				if (k > 0) {
					System.out.println("the room number is : " +k);	
				}
				break;
			}

			case 2 : {
				System.out.println("enter a passport number : ");
				int passportNum = s.nextInt();

				System.out.println("enter a name : ");
				String name = s.next();

				Guest[] Guest = new Guest[1];
				Guest[1] = new Guest (name,passportNum);
				Hotel.Guest(Guest);

				int k = Hotel.RoomNumber(passportNum);

				if (k != -1) {
					System.out.println("Not a guest ");	
				}
				if (k > 0) {
					System.out.println("the room number is : " +k);	
				}

				break;
			}

			case 3 : {

				Room arr[][] = Hotel.getAllRooms();

				for (int i = 0; i < floors; i++) {
					for (int j = 0; j < rooms; j++) {
						Guest arr1[] = (arr[j][i].getAllGuests());
						for (int k = 0; k < arr[j][i].getNumOfUsedBeds(); k++) 
						{
							System.out.println(arr1[k].getName());	
							System.out.println(arr1[k].getPassportNumber());
						}
					}

				}	
				break;
			}
			case 4: {
				System.out.println(Hotel.MostSpacedRoom());
				break;
			}

			case 5: {


				fContinue = false; 

				break;

			}

			default: {

				System.out.println("Invalid option , please enter again (1-9) ");
				break;
			}

			}


		}

		while (fContinue);

		System.out.println("Goodbye");

		s.close();

	}
}








