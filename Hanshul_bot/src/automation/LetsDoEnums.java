package automation;

enum Level {//WE STORED LOW MEDIUM HIGH.
	LOW, MEDIUM, HIGH, SUPERHIGH;

}

public class LetsDoEnums {

	public static void main(String[] arg) {//STARTING OF PROGRAM

		Level p = Level.SUPERHIGH;//VARIABLE//lEVEL IS A ENUM 
		switch (p) {// IF Value is Low  = System.out.print("Low Level");
		case LOW:
			System.out.print("Low Level");
			break;
		case MEDIUM://OR PRINT = System.out.print("Medium Level"); if medium

			System.out.print("Medium Level");
			break;
		case HIGH://last if high then System.out.print("High Level");

			System.out.print("High Level");
			break;
		case SUPERHIGH://last if high then System.out.print("High Level");

			System.out.print("SUPER High Level");
			break;	
			
		}

	}

}
