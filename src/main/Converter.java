package main;
import java.util.Scanner;

public class Converter {
	static Scanner userInput = new Scanner(System.in);
	static boolean programRunning = true;
	
	public static int selectionInput () {
		System.out.println("Please select an option: ");
		System.out.println("1. Cups to Teaspons");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Quit");
		
		int response = userInput.nextInt();
		return response;
	}
	public static void main(String[] args) {
		do {

			int response = selectionInput();
			switch (response) {
			case 1:
				System.out.print("Number of cups: ");
				double cups = userInput.nextInt();
				double cupConversion = cups * 48;
				System.out.println(cups + " cups is equal to " + cupConversion + " teaspoons \n");
				continue;
				
			case 2:
				System.out.print("Number of miles: ");
				double miles = userInput.nextInt();
				double milesConversion = miles * 1.609;
				System.out.println(miles + " miles is equal to " + milesConversion + " kilometers \n");
				continue;
							
			case 3:
				System.out.print("Number of US gallons: ");
				double gallons = userInput.nextInt();
				double gallonConversion = gallons * 0.832674;
				System.out.println(gallons + " US gallons is equal to " + gallonConversion + " imperial gallons \n");
				continue;
				
			case 4:
				System.out.println("Goodbye!");
				programRunning = false;
	              						
			}
		} while (programRunning);
	}

}
