
public class Car {
	int id;
	String name;
	int year;
	int price;
	int speed;
	
	public Car() {
	}
	
	public Car(int id,String name, int year) {
		this.id = id;
		this.name = name;
		this.year = year;
	}
	
	public Car(int id, String name, int year,int price,int speed) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.price = price;
		this.speed = speed;
	}
	public void printInfo() {
		System.out.println("id : " + this.id +  "  name : " + this.name + "  year : " + this.year + "  price : " + this.price + "  speed : " + this.speed);
	}
	
	

}
