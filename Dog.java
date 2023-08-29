//Kanemoto
//2.8.2023
//Dog class - to represent a guide dog in our program

package gdbDataProject;

public class Dog {
	
	//Dog,GDB ID,Breed,Sex,Campus,Phase
	//data variables, and they are always private
	private String dogName;
	private String dogID;
	private String breed;
	private char sex;
	private String campus;
	private char phase;
	
	//default contructor - nothing in the parantheses
	public Dog() {
		//super();
		this.dogName = "Rover";
		this.dogID = "1234";
		this.breed = "no breed";
		this.sex = 'N';
		this.campus = "no campus";
		this.phase = 'N';	
	}
	
	//non-default contructor
	public Dog(String dogName, String dogID, String breed, char sex, String campus, char phase) {
		//super();
		this.dogName = dogName;
		this.dogID = dogID;
		this.breed = breed;
		this.sex = sex;
		this.campus = campus;
		this.phase = phase;
	}

	//getters and setters - accessors and mutators
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public String getDogID() {
		return dogID;
	}
	public void setDogID(String dogID) {
		this.dogID = dogID;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public char getPhase() {
		return phase;
	}
	public void setPhase(char phase) {
		this.phase = phase;
	}

	//when we print an object, this method is automatically called
	//returns a String representation of our object
	@Override
	public String toString() {
		return "Dog [dogName=" + dogName + ", dogID=" + dogID + ", breed=" + breed + ", sex=" + sex + ", campus="
				+ campus + ", phase=" + phase + "]";
	}
}
