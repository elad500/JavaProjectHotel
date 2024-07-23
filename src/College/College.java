package College;


public class College {
	private String name;
	private int numOfLecturers;
	private int maxNumOfLecturers;



	private Lecturer[]  allLecturers;


	public College(String name , int maxNumOfLecturers) {
		setMaxNumOfLecturers(maxNumOfLecturers);
		setName(name);
		this.allLecturers = new Lecturer[maxNumOfLecturers];
		this.numOfLecturers = 0;	


	}


	public int getMaxNumOfLecturers() {
		return maxNumOfLecturers;
	}




	public void setMaxNumOfLecturers(int maxNumOfLecturers) {
		this.maxNumOfLecturers = maxNumOfLecturers;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumOfLecturers() {
		return numOfLecturers;
	}
	public void setNumOfLecturers(int numOfLecturers) {
		this.numOfLecturers = numOfLecturers;
	}
	public boolean addLecturer(Lecturer lecturer) {
		if(numOfLecturers < maxNumOfLecturers) {
			allLecturers[numOfLecturers++] = new Lecturer(lecturer);		
			return true;
		}
		return false;
	}


	public String toString() {
		String str = "Company name :" + this.name;
		for (int i = 0; i < numOfLecturers; i++) {
			str += "\n" + allLecturers[i];
		}
		return str;
	}





}
