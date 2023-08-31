package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RunController implements ActionListener {
	
	private JTextField textField;
	private JFrame main;
	
	// Classe construtora
	public RunController(JTextField textField, JFrame main) {
		this.textField = textField;
		this.main = main;
	}


	// Ação do botão "OK"
	@Override @SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		try {
			Runtime.getRuntime().exec(textField.getText());
			main.dispose();
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Diretório incorreto.", "ERRO", JOptionPane.ERROR_MESSAGE); // Caso o usuário erre o diretório, essa mensagem é exibida.
		}

	}

}