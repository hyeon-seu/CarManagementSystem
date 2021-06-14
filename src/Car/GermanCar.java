package Car;

import java.util.Scanner;

import excception.YearFomatException;

public class GermanCar extends UnknownCar {

	public GermanCar(CarKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setCarID(input);
		setCarName(input);
		setCarYearwithYN(input);
		setCarPrice(input);
	}

}
