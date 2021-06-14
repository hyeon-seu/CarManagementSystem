package Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.CarAddCancelListener;
import listeners.CarAdderListener;
import manager.CarManager;

public class CarAdder extends JPanel {

	WindowFrame frame;	
	CarManager carManager;

	public CarAdder(WindowFrame frame,CarManager carManager) {
		this.frame =frame;
		this.carManager = carManager;
	
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());

		JLabel labelID = new JLabel("ID : ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);

		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelYear = new JLabel("Year : ", JLabel.TRAILING);
		JTextField fieldYear = new JTextField(10);
		labelYear.setLabelFor(fieldYear);
		panel.add(labelYear);
		panel.add(fieldYear);

		JLabel labelPrice = new JLabel("Price : ", JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelPrice.setLabelFor(fieldPrice);
		
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new CarAdderListener(fieldID,fieldName,fieldYear,fieldPrice,carManager));
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new CarAddCancelListener(frame));
		
		panel.add(labelPrice);
		panel.add(fieldPrice);

		panel.add(saveButton);
		panel.add(cancelButton);

		SpringUtilities.makeCompactGrid(panel,5,2,6,6,6,6);

		this.add(panel);
		this.setVisible(true);
	}

}
