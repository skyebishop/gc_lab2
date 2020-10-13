package lab2;

import java.util.Scanner; 

public class lab2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String choice = "y";	
		
		// welcome message
		System.out.println("Welcome to the Room Detail Generator.");
				
		while (choice.equalsIgnoreCase("y"))
		{
			// prompt the user to enter value of name of classroom
			System.out.println("What is the name of the classroom?");
			String nameOfClassroom = scnr.next();
			
			// prompt the user to enter value of length of classroom
			System.out.println("Enter length in feet:");
			double lengthOfClassroom = scnr.nextDouble();
		
			// prompt the user to enter value of width of classroom
			System.out.println("Enter width in feet:");
			double widthOfClassroom = scnr.nextDouble();
			
			// prompt the user to enter value of height of classroom
			System.out.println("Enter height in feet;");
			double heightOfClassroom = scnr.nextDouble();

			double areaOfClassroom = lengthOfClassroom * widthOfClassroom;
			double perimeterOfClassroom = lengthOfClassroom * 2.0 + widthOfClassroom * 2.0;
			double volumeOfClassroom = lengthOfClassroom * widthOfClassroom * heightOfClassroom;

			System.out.println("The area of " + nameOfClassroom + " is " + areaOfClassroom + " and the perimiter is "
					+ perimeterOfClassroom + " and the volume is " + volumeOfClassroom);

			// find out if user wants to do another room
			System.out.println("Would you like to do another room? Enter y/n");
			choice = scnr.next();
			
			
		}
	}
}