package Gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CarViewer extends JFrame {

	public CarViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("NAME");
		model.addColumn("YEAR");
		model.addColumn("PRICE");


		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);

		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setVisible(true);

	}

}
