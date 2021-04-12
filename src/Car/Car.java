package Car;

import java.util.Scanner;

public class Car {
	protected CarKind kind = CarKind.Korean;
	protected int id;
	protected String name;
	protected int year;
	protected int price;

	public Car() {
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

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void printInfo() {
		System.out.println("id : " + this.id +  "  name : " + this.name + "  year : " + this.year + "  price($) : " + this.price);
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

}
