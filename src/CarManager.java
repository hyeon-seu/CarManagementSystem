import java.util.ArrayList;
import java.util.Scanner;

import Car.Car;
import Car.CarKind;
import Car.GermanCar;
import Car.ItalianCar;

public class CarManager {
	ArrayList<Car> cars= new ArrayList<Car>();
	Scanner input;
	CarManager(Scanner input){
		this.input = input;
	}

	public void addcars() {
		int kind = 0;
		Car car;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Korean");
			System.out.println("2 for German");
			System.out.println("3 for Italian");
			System.out.print("Selcet num 1,2, or 3 for Car Kind : ");
			kind = input.nextInt();
			if (kind ==1) {
				car = new Car(CarKind.Korean);
				car.getUserInput(input);
				cars.add(car);
				break;

			}
			else if (kind ==2) {
				car = new GermanCar(CarKind.German);
				car.getUserInput(input);
				cars.add(car);
				break;
			}
			else if (kind ==3) {
				car = new ItalianCar(CarKind.ltalian);
				car.getUserInput(input);
				cars.add(car);
				break;
			}
			else {
				System.out.print("Selcet num for Car Kind between 1 and 2 : ");
			}
		}
	
	}

	public void deletecars() {
		System.out.print("Car ID : ");
		int carid = input.nextInt();
		int index=-1;
		for (int i= 0; i<cars.size(); i ++) {
			if (cars.get(i).getId() ==carid) {
				index = i;
				break;
			}
		}

		if (index>=0) {
			cars.remove(index);
			System.out.println("the car number " + carid + " is deleted");
		}
		else {
			System.out.println("the car has not been registered");
			return;
		}

	}

	public void editcars() {
		System.out.print("Car ID : ");
		int carid = input.nextInt();
		for (int i= 0; i<cars.size(); i ++) {
			Car car = cars.get(i);
			if (car.getId() ==carid) {
				int num = -1;
				while (num != 5) {
					System.out.println("**** Cars Info Edit Menu  ****");
					System.out.println("1.Edit ID");
					System.out.println("2.Edit Name");
					System.out.println("3.Edit Year");
					System.out.println("4.Edit price");
					System.out.println("5.Exit");
					System.out.print("Please Select one number between 1 - 5 : ");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Car ID : ");
						int id = input.nextInt();
						car.setId(id);
					}
					else if (num == 2) {
						System.out.print("Car NAME : ");
						String name = input.next();
						car.setName(name);
					}
					else if (num == 3) {
						System.out.print("Year of Manufacture for Car : ");
						int year = input.nextInt();
						car.setYear(year);
					}
					else if (num == 4) {
						System.out.print("The price of a Car($): ");
						int price = input.nextInt();
						car.setPrice(price);
					}
					else {
						continue;
					}//if
				}//while
				break;
			}//if
		}//for
	}
	public void viewcars() {
		//		System.out.print("Car ID : ");
		//		int carid = input.nextInt();
		System.out.println("registered cars : " + cars.size());
		for (int i= 0; i<cars.size(); i ++) {
			cars.get(i).printInfo();
		}
	}
}
