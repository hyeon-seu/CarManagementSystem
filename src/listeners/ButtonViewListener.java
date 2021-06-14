package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import Gui.CarViewer;
import Gui.WindowFrame;
import manager.CarManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		CarViewer carViewer = frame.getCarviewer();
		CarManager carManager = getObject("carmanager.ser");
		carViewer.setCarManager(carManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(carViewer);
		frame.revalidate();
		frame.repaint();
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

}
