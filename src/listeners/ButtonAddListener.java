package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Gui.CarAdder;
import Gui.CarViewer;
import Gui.WindowFrame;

public class ButtonAddListener implements ActionListener {

	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		CarAdder adder = frame.getCaradder();
		frame.setupPanel(adder);
	}

}
