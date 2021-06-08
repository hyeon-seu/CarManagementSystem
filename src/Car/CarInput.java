package Car;

import java.util.Scanner;

import excception.YearFomatException;

public interface CarInput {

	public int getId();
	public void setId(int id);
	public String getName();
	public void setName(String name);
	public int getYear();
	public void setYear(int year) throws YearFomatException;
	public int getPrice();
	public void setPrice(int price) ;
	public void getUserInput(Scanner input);
	public void printInfo();
	public void setCarID(Scanner input);
	public void setCarName(Scanner input);
	public void setCarYear(Scanner input);
	public void setCarPrice(Scanner input);
}
