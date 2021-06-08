package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Gui.CarViewer;
import Gui.WindowFrame;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		CarViewer viewer = frame.getCarviewer();
		frame.setupPanel(viewer);

	}

}
