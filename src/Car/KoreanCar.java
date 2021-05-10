package Car;

import java.util.Scanner;

public class KoreanCar extends Car implements CarInput {

	public KoreanCar(CarKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		System.out.print("Car ID : ");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Car NAME : ");
		String name = input.next();
		this.setName(name);

		System.out.print("Year of Manufacture for Car : ");
		int year = input.nextInt();
		this.setYear(year);

		System.out.print("The price of a Car($): ");
		int price = input.nextInt();
		this.setPrice(price);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Korean :
			skind = "Korean.";
			break;
		case German:
			skind = "German.";
			break;
		case American:
			skind = "American.";
			break;
		case ltalian :
			skind = "Italian.";
			break;
		default:
		}
		System.out.println("kind :" + skind +"id : " + this.id +  "  name : " + this.name + "  year : " + this.year + "  price($) : " + this.price);
	}

}
