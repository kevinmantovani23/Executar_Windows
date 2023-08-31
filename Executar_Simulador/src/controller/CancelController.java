package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CancelController implements ActionListener {

	private JFrame main = new JFrame();
	
	// Classe construtora
	public CancelController (JFrame main) {
		this.main = main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		main.dispose(); // Apenas fecha a janela
		
	}

}
