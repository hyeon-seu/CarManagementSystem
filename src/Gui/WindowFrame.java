package Gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import manager.CarManager;

public class WindowFrame extends JFrame{

	CarManager carManager;

	MenuSelection menuselection;
	CarAdder caradder;
	CarViewer carviewer;

	public WindowFrame(CarManager carManager) {
		this.carManager = carManager;
		this.menuselection = new MenuSelection(this);
		this.caradder = new CarAdder(this,this.carManager);
		this.carviewer = new CarViewer(this,this.carManager);

		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setupPanel(menuselection);

		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public CarAdder getCaradder() {
		return caradder;
	}

	public void setCaradder(CarAdder caradder) {
		this.caradder = caradder;
	}

	public CarViewer getCarviewer() {
		return carviewer;
	}

	public void setCarviewer(CarViewer carviewer) {
		this.carviewer = carviewer;
	}


}
