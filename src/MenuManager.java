import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CarManager carManager = new CarManager(input);
		selectMenu(input, carManager);

	}
	public static void selectMenu(Scanner input, CarManager carManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					carManager.addcars();	
					break;
				case 2:
					carManager.deletecars();
					break;
				case 3:
					carManager.editcars();   
					break;
				case 4:
					carManager.viewcars();     
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}	
	}
	
	public static void showMenu() {
		System.out.println("**** Cars Management System Menu ****");
		System.out.println("1. Add Car");
		System.out.println("2. Delete Car");
		System.out.println("3. Edit Car");
		System.out.println("4. View Cars");
		System.out.println("5. Exit");
		System.out.print("Please Select one number between 1 - 5 : ");
	}
}










