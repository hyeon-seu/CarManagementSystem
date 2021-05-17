package Car;

import java.util.Scanner;

import excception.YearFomatException;

public abstract class Car implements CarInput { 
	protected CarKind kind = CarKind.Korean;
	protected int id;
	protected String name;
	protected int year;
	protected int price;

	public Car() {
	}

	public Car(CarKind kind) {
		this.kind = kind;
	}

	public Car(int id,String name, int year) {
		this.id = id;
		this.name = name;
	}

	public Car(int id, String name, int year,int price) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.price = price;
	}

	public Car(CarKind kind , int id, String name, int year,int price) {
		this.kind =kind;
		this.id = id;
		this.name = name;
		this.year = year;
		this.price = price;
	}

	public CarKind getKind() {
		return kind;
	}

	public void setKind(CarKind kind) {
		this.kind = kind;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) throws YearFomatException {
		if (year<1950) {
			throw new YearFomatException();
		}
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract void printInfo();

	public void setCarID(Scanner input) {
		System.out.print("Car ID : ");
		int id = input.nextInt();
		this.setId(id);
	}

	public void setCarName(Scanner input) {
		System.out.print("Car NAME : ");
		String name = input.next();
		this.setName(name);
	}
	public void setCarYear(Scanner input) {
		int year = 0;
		while (year<1950) {
			System.out.print("Year of Manufacture for Car : ");
			year = input.nextInt();
			try {
				this.setYear(year);
			} catch (YearFomatException e) {
				System.out.println("Enter only the year after 1950!!");
			}
		}
	}
	public void setCarPrice( Scanner input) {
		System.out.print("The price of a Car($): ");
		int price = input.nextInt();
		this.setPrice(price);
	}

	public String getKindString() {
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
		return skind;
	}
}