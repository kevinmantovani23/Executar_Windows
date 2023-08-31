package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CancelController;
import controller.RunController;
import controller.SearchController;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class TelaExecutar extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton, btnNewButton_1, btnNewButton_2;
	private JTextField textField;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaExecutar frame = new TelaExecutar();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaExecutar() {
		setTitle("Executar - " + System.getProperty("os.name"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o caminho do executável ou clique em procurar");
		lblNewLabel.setBounds(115, 78, 400, 28);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Abrir:");
		lblNewLabel_1.setBounds(18, 169, 46, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("OK");
		btnNewButton.setBounds(105, 229, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(218, 229, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Procurar");
		btnNewButton_2.setBounds(328, 229, 89, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(75, 167, 354, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		CancelController cancel = new CancelController (this); // Pega o JFrame e leva para a classe CancelController
		RunController run = new RunController(textField, this);  // Pega o texto digitado e o JFrame, e os levam para a classe RunController
		SearchController search = new SearchController(textField); // Ativa o JFileChooser
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 11, 95, 95);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\ws-eclipse\\Desafio_Executar\\Executar_Simulador\\img\\Sem Título-1.png"));
		contentPane.add(lblNewLabel_2);
		btnNewButton.addActionListener(run); // Faz o botão "OK" executar o ActionListener da classe RunController
		btnNewButton_1.addActionListener(cancel); // Faz o botão "Cancelar" executar o ActionListener da classe CancelController
		btnNewButton_2.addActionListener(search); // Faz o botão "pesquisar" executar o ActionListener da classe SearchController
		
	}
}
