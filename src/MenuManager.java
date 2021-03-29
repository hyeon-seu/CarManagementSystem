import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;

		while (num != 6) {
			System.out.println("**** Cars Management System Menu ****");
			System.out.println("1. Add Cars");
			System.out.println("2. Delete Cars");
			System.out.println("3. Edit Cars");
			System.out.println("4. View Cars");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.print("Please Select one number between 1 - 6 : ");
			num = input.nextInt();
			if (num == 1) {
				addcars();	
			}
			else if (num == 2) {
				deletecars();
			}
			else if (num == 3) {
				editcars();     
			}
			else if (num == 4) {
				viewcars();     
			}
			else {
				continue;
			}
		}
	}
	public static void addcars() {
		Scanner input = new Scanner(System.in);

		System.out.print("Car NAME : ");
		String carname = input.next();
		System.out.print("Year of Manufacture for Car : ");
		int caryears = input.nextInt();
		System.out.print("The price of a Car($): ");
		int carprice = input.nextInt();
		System.out.print("Maximum speed(km) : ");
		int carspeed = input.nextInt();
	}
	public static void deletecars() {
		Scanner input = new Scanner(System.in);
		System.out.print("Car NAME : ");
		String carname = input.next();	
	}
	public static void editcars() {
		Scanner input = new Scanner(System.in);
		System.out.print("Car NAME : ");
		String carname = input.next();	
	}
	public static void viewcars() {
		Scanner input = new Scanner(System.in);
		System.out.print("Car NAME : ");
		String carname = input.next();	
	}
}










