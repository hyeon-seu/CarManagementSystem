package manager;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import Gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		CarManager carManager = getObject("carmanager.ser");
		if(carManager == null) {
			carManager = new CarManager(input);
		}
		else {
			carManager.input = input;
		}
		
		WindowFrame fram = new WindowFrame(carManager);
		selectMenu(input, carManager);
		putObject(carManager, "carmanager.ser");

	}
	public static void selectMenu(Scanner input, CarManager carManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					carManager.addcars();	
					logger.log("add a car");
					break;
				case 2:
					carManager.deletecars();
					logger.log("delete a car");
					break;
				case 3:
					carManager.editcars();
					logger.log("edit a car");
					break;
				case 4:
					carManager.viewcars();   
					logger.log("edit a list of car");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}	
	}

	public static void showMenu() {
		System.out.println("**** Cars Management System Menu ****");
		System.out.println("1. Add Car");
		System.out.println("2. Delete Car");
		System.out.println("3. Edit Car");
		System.out.println("4. View Cars");
		System.out.println("5. Exit");
		System.out.print("Please Select one number between 1 - 5 : ");
	}

	public static CarManager getObject(String filename) {
		CarManager carManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			carManager =(CarManager)in.readObject();

			in.close();
			file.close();

		} catch (FileNotFoundException e) {
			return carManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return carManager;

	}
	public static void putObject(CarManager carManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(carManager);

			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}










