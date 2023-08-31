package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SearchController implements ActionListener {
	
	private JTextField textField;
	public SearchController (JTextField textField) {
		this.textField = textField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Criando os filtros e pegando o diretório desktop do Sistema
		FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivos Executáveis (.exe)", "exe");
		String diretorioBase = System.getProperty("user.home") +"/Desktop";
		File dir = new File(diretorioBase);
		JFileChooser choose = new JFileChooser();
		// Aplicando o filtro, aceitando apenas arquivos .exe
		choose.setCurrentDirectory(dir);
		choose.setFileSelectionMode(JFileChooser.FILES_ONLY);
		choose.setAcceptAllFileFilterUsed(false);
		choose.addChoosableFileFilter(filtro);
		String caminho = "";
		// Checando se o usuário selecionou algum arquivo, e se sim mostrando seu diretório no JTextField
		int retorno = choose.showOpenDialog(null);
		if (retorno == JFileChooser.APPROVE_OPTION) {
			caminho = choose.getSelectedFile().getAbsolutePath();
			textField.setText(caminho);
		}
		
	}

}
