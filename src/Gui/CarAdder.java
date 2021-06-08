package Gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class CarAdder extends JPanel {

	WindowFrame frame;

	public CarAdder(WindowFrame frame) {
		this.frame =frame;

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
		panel.add(labelPrice);
		panel.add(fieldPrice);

		panel.add(new JButton("Save"));
		panel.add(new JButton("Cancel"));

		SpringUtilities.makeCompactGrid(panel,5,2,6,6,6,6);

		this.add(panel);
		this.setVisible(true);
	}

}
