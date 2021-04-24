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
			System.out.println("(3) modify old list");
			System.out.println("(4) read old list");
			System.out.println("(5) quit");
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
		case "four":
		case "4":
			out = 4;
			break;
		case "five":
		case "5":
		case "q":
		case "quit":
		case "exit":
		case "escape":
			out = 5;
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
			option3();
			break;
		case 4:
			option4();
			break;
		case 5:
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
			boolean repeat = true;
			while (repeat) {
				System.out.println("What would you like to add to your list? (Type \"quit\" to stop adding)");
				String item = scan.nextLine();
				if (item.toLowerCase().trim().equals("quit")) {
					repeat = false;
					break;
				} else {
					ToDo t = new ToDo(item);
					ToDo.addItem(t);
				}
			}
			ToDo.write(name);
		} catch (Exception e) {
			System.out.println("Error writing to file.");
		}
		scan.close();
	}

	/**
	 * Operation to read ToDo list from existing file.
	 */
	private static void option2() {
		// TODO
	}
	
	/**
	 * Modify existing list.
	 */
	private static void option3() {
		// TODO
	}
	
	/**
	 * Read from existing list.
	 */
	private static void option4() {
		// TODO
	}
	
	/****** Run Program with GUI ************/
	
	// TODO

}
