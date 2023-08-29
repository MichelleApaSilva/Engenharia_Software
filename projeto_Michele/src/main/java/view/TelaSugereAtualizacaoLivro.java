package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class TelaSugereAtualizacaoLivro extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSugereAtualizacaoLivro frame = new TelaSugereAtualizacaoLivro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaSugereAtualizacaoLivro() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 608, 463);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Pesquisar", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 50, 572, 53);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CÓDIGO DO EXEMPLAR");
		lblNewLabel.setBounds(10, 20, 119, 22);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(134, 20, 329, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.setBounds(473, 20, 89, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Dados exemplar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 114, 572, 308);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("NOME DO LIVRO");
		lblNewLabel_2.setBounds(10, 37, 119, 22);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(134, 37, 428, 22);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("AUTOR");
		lblNewLabel_2_1.setBounds(10, 70, 119, 22);
		panel_1.add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(134, 70, 428, 22);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("ANO DE LANÇAMENTO");
		lblNewLabel_2_1_1.setBounds(10, 103, 119, 22);
		panel_1.add(lblNewLabel_2_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(134, 103, 428, 22);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("EDIÇÃO");
		lblNewLabel_2_1_1_1.setBounds(10, 132, 119, 22);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(134, 132, 428, 22);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("EDITORA");
		lblNewLabel_2_1_1_1_1.setBounds(10, 165, 119, 22);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(134, 165, 428, 22);
		panel_1.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.setBounds(170, 274, 133, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("SOLICITAR");
		btnNewButton_1_1.setBounds(354, 274, 133, 23);
		panel_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("ISBN");
		lblNewLabel_2_1_1_1_1_1.setBounds(10, 198, 119, 22);
		panel_1.add(lblNewLabel_2_1_1_1_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(134, 198, 428, 22);
		panel_1.add(textField_6);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("OBSERVAÇÃO");
		lblNewLabel_2_1_1_1_1_1_1.setBounds(10, 231, 119, 22);
		panel_1.add(lblNewLabel_2_1_1_1_1_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(134, 231, 428, 22);
		panel_1.add(textField_7);
		
		JLabel lblNewLabel_1 = new JLabel("SUGESTÕES DE LIVROS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 11, 572, 28);
		getContentPane().add(lblNewLabel_1);

	}
}
