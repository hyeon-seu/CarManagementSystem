package Gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Car.CarInput;
import manager.CarManager;

public class CarViewer extends JPanel {

	WindowFrame frame;

	CarManager carManager;

	public CarManager getCarManager() {
		return carManager;
	}

	public void setCarManager(CarManager carManager) {
		this.carManager = carManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("NAME");
		model.addColumn("YEAR");
		model.addColumn("PRICE");

		for(int i =0; i<carManager.size(); i++) {
			Vector row =new Vector();
			CarInput Ci= carManager.get(i);
			row.add(Ci.getId());
			row.add(Ci.getName());
			row.add(Ci.getYear());
			row.add(Ci.getPrice());
			model.addRow(row);
		}


		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}

	public CarViewer(WindowFrame frame,CarManager carManager) {
		this.frame =frame;
		this.carManager = carManager;

		System.out.println("***"+carManager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("NAME");
		model.addColumn("YEAR");
		model.addColumn("PRICE");

		for(int i =0; i<carManager.size(); i++) {
			Vector row =new Vector();
			CarInput Ci= carManager.get(i);
			row.add(Ci.getId());
			row.add(Ci.getName());
			row.add(Ci.getYear());
			row.add(Ci.getPrice());
			model.addRow(row);
		}


		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}
}
