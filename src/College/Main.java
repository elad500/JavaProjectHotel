package College;


public class Main {

	public static void main(String[] args) {
		
		// name : Elad naasa
				// id : 208461186
				// HW3_208461186
		
		
		
		College deShalit = new College("De-Shalit",50);
		Lecturer l1 = new Lecturer("Yitzhak",6,"Chocolate");
		deShalit.addLecturer(l1);
		Lecturer l2 = new Lecturer("David",5,"Pistachio");
		deShalit.addLecturer(l2);
		System.out.println(deShalit);


	}

}
