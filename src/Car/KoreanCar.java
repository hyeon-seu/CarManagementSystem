package Car;

import java.util.Scanner;

public class KoreanCar extends Car {

	public KoreanCar(CarKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setCarID(input);
		setCarName(input);
		setCarYear(input);
		setCarPrice(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind :" + skind +"id : " + this.id +  "  name : " + this.name + "  year : " + this.year + "  price($) : " + this.price);
	}

}
