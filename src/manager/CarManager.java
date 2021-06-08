package manager;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Car.CarKind;
import Car.Car;
import Car.CarInput;
import Car.GermanCar;
import Car.ItalianCar;
import Car.KoreanCar;

public class CarManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5916571094697801186L;

	ArrayList<CarInput> cars= new ArrayList<CarInput>();
	transient Scanner input;
	CarManager(Scanner input){
		this.input = input;
	}

	public void addcars() {
		int kind = 0;
		CarInput carInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Korean");
				System.out.println("2 for German");
				System.out.println("3 for Italian");
				System.out.print("Selcet num 1,2, or 3 for Car Kind : ");
				kind = input.nextInt();
				if (kind ==1) {
					carInput = new KoreanCar(CarKind.Korean);
					carInput.getUserInput(input);
					cars.add(carInput);
					break;

				}
				else if (kind ==2) {
					carInput = new GermanCar(CarKind.German);
					carInput.getUserInput(input);
					cars.add(carInput);
					break;
				}
				else if (kind ==3) {
					carInput = new ItalianCar(CarKind.ltalian);
					carInput.getUserInput(input);
					cars.add(carInput);
					break;
				}
				else {
					System.out.print("Selcet num for Car Kind between 1 and 2 : ");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;

			}
		}

	}

	public void deletecars() {
		System.out.print("Car ID : ");
		int carid = input.nextInt();
		int index=findIndex(carid);
		removefromCars(index,carid);
	}
	public int findIndex(int carid) {
		int index=-1;
		for (int i= 0; i<cars.size(); i ++) {
			if (cars.get(i).getId() ==carid) {
				index = i;
				break;
			}
		}
		return index;
	}
	public int removefromCars(int index,int carid) {
		if (index>=0) {
			cars.remove(index);
			System.out.println("the car number " + carid + " is deleted");
			return 1;
		}
		else {
			System.out.println("the car has not been registered");
			return -1;
		}

	}

	public void editcars() {
		System.out.print("Car ID : ");
		int carid = input.nextInt();
		for (int i= 0; i<cars.size(); i ++) {
			CarInput car = cars.get(i);
			if (car.getId() ==carid) {
				int num = -1;
				while (num != 5) {
					shwEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						car.setCarID(input);
						break;
					case 2:
						car.setCarName(input);
						break;
					case 3:
						car.setCarYear(input);
						break;
					case 4:
						car.setCarPrice(input);
						break;
					default:
						continue;

					}
				}//while
				break;
			}//if
		}//for
	}
	public void viewcars() {
		System.out.println("registered cars : " + cars.size());
		for (int i= 0; i<cars.size(); i ++) {
			cars.get(i).printInfo();
		}
	}
	
	public int size() {
		return cars.size();
	}
	
	public CarInput get(int index) {
		return (Car) cars.get(index);
	}

	public void shwEditMenu() {
		System.out.println("**** Cars Info Edit Menu  ****");
		System.out.println("1.Edit ID");
		System.out.println("2.Edit Name");
		System.out.println("3.Edit Year");
		System.out.println("4.Edit price");
		System.out.println("5.Exit");
		System.out.print("Please Select one number between 1 - 5 : ");
	}
}
