package _01_intro_to_static;

public class Athlete {
	static int nextBibNumber;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00am";

	String name;
	int speed;
	int bibNumber;

	Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
		bibNumber = nextBibNumber += 3;
	}

	public void print() {

		System.out.println(name);

		System.out.println("Speed:" + speed);

		System.out.println(bibNumber);
	}

	public static void main(String[] args) {
		// create 2 athletes
		// print their names, bibNumbers, and the location of their race.

		Athlete athlete1 = new Athlete("Jason", 21);

		Athlete athlete2 = new Athlete("Jason2", 22);

		Athlete athlete3 = new Athlete("Jason3", 30);

		athlete1.print();
		
		athlete2.print();
		
		athlete3.print();
	}
}
