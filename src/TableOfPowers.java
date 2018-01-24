import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {

		int userNum;
		int i;
		String cont = "y";

		System.out.println("Learn your squares and cubes! \n");

		Scanner scnr = new Scanner(System.in);

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Enter an integer: ");
			userNum = scnr.nextInt();

			System.out.println();
			System.out.printf("%-10s", "Number");
			System.out.printf("%-10s", "Squared");
			System.out.printf("%-10s", "Cubed");

			System.out.println();

			System.out.printf("%-10s", "=======");
			System.out.printf("%-10s", "=======");
			System.out.printf("%-10s", "=======");

			System.out.println();

			for (i = 1; i <= userNum; ++i) {

				System.out.printf("%-10d", i);
				System.out.printf("%-10d", i * i);
				System.out.printf("%-10d", i * i * i);
				System.out.println();

			}
			
			System.out.println("\nDo you want to continue? (y/n)");
			cont = scnr.next();  // Q: Why can't I use scnr.nextLine() here?
			System.out.println();

		}

		// let the user know the program has closed
		System.out.println("Goodbye!");
		
		scnr.close();

	}

}
