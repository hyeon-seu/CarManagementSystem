package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Car.Car;
import Car.CarInput;
import Car.CarKind;
import Car.KoreanCar;
import excception.YearFomatException;
import manager.CarManager;

public class CarAdderListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldYear;
	JTextField fieldPrice;

	CarManager carManager;

	public CarAdderListener(JTextField fieldID, JTextField fieldName, JTextField fieldYear, JTextField fieldPrice, CarManager carManager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldYear = fieldYear;
		this.fieldPrice = fieldPrice;
		this.carManager = carManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		CarInput car = new KoreanCar(CarKind.Korean);
		try {
			car.setId(Integer.parseInt(fieldID.getText()));
			car.setName(fieldName.getText());
			car.setYear(Integer.parseInt(fieldYear.getText()));
			car.setPrice(Integer.parseInt(fieldPrice.getText()));
			carManager.addcars(car);
			putObject(carManager, "carmanager.ser");
			car.printInfo();
		} catch (YearFomatException e1) {
			e1.printStackTrace();
		}
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

