import java.util.Scanner;

public class CarManager {
	Car car;
	Scanner input;
	CarManager(Scanner input){
		this.input = input;
	}

	public void addcars() {
		car = new Car();
		System.out.print("Car ID : ");
		car.id = input.nextInt();
		System.out.print("Car NAME : ");
		car.name = input.next();
		System.out.print("Year of Manufacture for Car : ");
		car.year = input.nextInt();
		System.out.print("The price of a Car($): ");
		car.price = input.nextInt();
		System.out.print("Maximum speed(km) : ");
		car.speed = input.nextInt();
	}
	public void deletecars() {
		System.out.print("Car ID : ");
		int carid = input.nextInt();
		if (car == null) {
			System.out.println("the car has not been registered");
			return;
		}
		if (car.id ==carid) {
			car =null;
			System.out.println("the car is deleted");
		}
	}

	public void editcars() {
		System.out.print("Car ID : ");
		int carid = input.nextInt();
		if (car.id ==carid) {
			System.out.println("the car to be edited is " + carid);
		}
	}
	public void viewcars() {
		System.out.print("Car ID : ");
		int carid = input.nextInt();
		if (car.id ==carid) {
			car.printInfo();
		}
	}
}
