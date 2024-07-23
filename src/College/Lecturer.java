package College;



public class Lecturer {

	private String name;
	private int numOfTimesPenFalls;
	private String favoriteIceCream;
	private String licenseId;
	private static int ID = 1000;


	public Lecturer(String name , int numOfTimesPenFalls , String favoriteIceCream) {
		setName(name);
		setNumOfTimesPenFalls(numOfTimesPenFalls);
		setFavoriteIceCream(favoriteIceCream);
		setLicenseId();

	}
	public Lecturer(Lecturer other) {
		this.name = other.name;
		this.numOfTimesPenFalls = other.numOfTimesPenFalls;
		this.favoriteIceCream = other.favoriteIceCream;
		this.licenseId = other.licenseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfTimesPenFalls() {
		return numOfTimesPenFalls;
	}

	public void setNumOfTimesPenFalls(int numOfTimesPenFalls) {
		if(numOfTimesPenFalls > 0) {
			this.numOfTimesPenFalls = numOfTimesPenFalls;
		}

	}

	public String getFavoriteIceCream() {
		return favoriteIceCream;
	}

	public void setFavoriteIceCream(String favoriteIceCream) {
		this.favoriteIceCream = favoriteIceCream;
	}

	public String getLicenseId() {
		return licenseId;
	}

	private void setLicenseId() {
		this.licenseId = ID + " Lecturer";
		ID++;
	}

	public String toString() {
		return "Lecturer [name=" + name + ", num Of Times Pen Falls=" + numOfTimesPenFalls + ", favorite Ice Cream=" + favoriteIceCream + ",License id=" + licenseId + "]";
	}



}
