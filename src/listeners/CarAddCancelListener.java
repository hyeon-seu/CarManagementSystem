package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Gui.CarAdder;
import Gui.CarViewer;
import Gui.WindowFrame;

public class CarAddCancelListener implements ActionListener {

	WindowFrame frame;

	public CarAddCancelListener(WindowFrame frame) {
		this.frame = frame;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}
}
