import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CarManager carManager = new CarManager(input);

		int num = -1;
		while (num != 5) {
			System.out.println("**** Cars Management System Menu ****");
			System.out.println("1. Add Cars");
			System.out.println("2. Delete Cars");
			System.out.println("3. Edit Cars");
			System.out.println("4. View Cars");
			System.out.println("5. Exit");
			System.out.print("Please Select one number between 1 - 5 : ");
			num = input.nextInt();
			if (num == 1) {
				carManager.addcars();	
			}
			else if (num == 2) {
				carManager.deletecars();
			}
			else if (num == 3) {
				carManager.editcars();     
			}
			else if (num == 4) {
				carManager.viewcars();     
			}
			else {
				continue;
			}
		}
	}
}










