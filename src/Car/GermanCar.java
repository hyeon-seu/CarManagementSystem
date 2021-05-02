package Car;

import java.util.Scanner;

public class GermanCar extends Car {
	
	public GermanCar(CarKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Car ID : ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Car NAME : ");
		String name = input.next();
		this.setName(name);

		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you know the year of the car? (Y/N) : ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Year of Manufacture for Car : ");
				int year = input.nextInt();
				this.setYear(year);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setYear(0000);
				break;
			}
			else {
			}
		}

		System.out.print("The price of a Car($): ");
		int price = input.nextInt();
		this.setPrice(price);
	}

}
