package Car;

import java.util.Scanner;

import excception.YearFomatException;

public abstract class UnknownCar extends Car {
	
	public UnknownCar(CarKind kind) {
		super(kind);
	}

	@Override
	public void getUserInput(Scanner input) {
		// TODO Auto-generated method stub

	}

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind :" + skind +"id : " + this.id +  "  name : " + this.name + "  year : " + this.year + "  price($) : " + this.price);
	}
	
	public void setCarYearwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you know the year of the car? (Y/N) : ");
			answer = input.next().charAt(0);
			try {
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
			catch(YearFomatException e) {
				System.out.println("Enter only the year after 1950!!");
			}
		}
	}

}
