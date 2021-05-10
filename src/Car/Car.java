package Car;

import java.util.Scanner;

public abstract class Car { 
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

	public void setYear(int year) {
		this.year = year;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public abstract void printInfo();
}