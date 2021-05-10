package Car;

import java.util.Scanner;

public interface CarInput {

	public int getId();
	public void setId(int id);
	public void setName(String name);
	public void setYear(int year);
	public void setPrice(int price) ;
	public void getUserInput(Scanner input);
	public void printInfo();

}
