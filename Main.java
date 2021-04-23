import java.util.Scanner;

/**
 * Class for main method.
 * 
 * @author Willis
 * @version 4.23.2021
 */
public class Main {

	/**
	 * Main method.
	 * 
	 * @param args accepts command line arguments.
	 */
	public static void main(String[] args) {
		consoleRun();
	}
	
	/****** Run Program from Console *********/
	
	/**
	 * Run ToDo from console.
	 */
	private static void consoleRun() {
		Scanner scan = new Scanner(System.in);
		boolean check = true;
		while (check) {
			System.out.println("Select from the following: ");
			System.out.println("(1) create new list");
			System.out.println("(2) read from existing list");
			System.out.println("(3) quit");
			String hold = scan.next();
			int i = readNumbers(hold);
			check = handleInput(i);
		}
		scan.close();
	}

	/**
	 * Read numbers from input.
	 * 
	 * @param in String input from user.
	 * @return numerical equivalent.
	 */
	private static int readNumbers(String in) {
		int out = -1;
		switch (in.trim().toLowerCase()) {
		case "one":
		case "1":
			out = 1;
			break;
		case "two":
		case "2":
			out = 2;
			break;
		case "three":
		case "3":
			out = 3;
			break;
		case "q":
		case "quit":
		case "exit":
		case "escape":
			out = 3;
			break;
		default:
			out = -1;
			break;
		}
		return out;
	}

	/**
	 * Handle user input.
	 * 
	 * @param in user's input as a number.
	 * @return whether user should be prompted again.
	 */
	private static boolean handleInput(int in) {
		boolean check = true;
		switch (in) {
		case 1:
			option1();
			break;
		case 2:
			option2();
			break;
		case 3:
		default:
			System.out.println("Exiting process");
			check = false;
			break;
		}
		return check;
	}

	/**
	 * Operation to write ToDo list to new file.
	 */
	private static void option1() {
		// TODO
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the name of your list?");
		try {
			String name = scan.nextLine();
			// TODO
			ToDo.write(name);
		} catch (Exception e) {
			
		}
		scan.close();
	}

	/**
	 * Operation to read ToDo list from existing file.
	 */
	private static void option2() {
		// TODO
	}
	
	/****** Run Program with GUI ************/
	
	// TODO

}
