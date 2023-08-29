package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LocalizarLivro extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalizarLivro frame = new LocalizarLivro();
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
	public LocalizarLivro() {
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		JMenu menuMenu = new JMenu("Menu");
		barraMenu.add(menuMenu);
		
		JMenuItem menuAjuda = new JMenuItem("Ajuda");
		menuMenu.add(menuAjuda);
		
		JMenuItem menuVoltar = new JMenuItem("Voltar");
		menuVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaPrincipal().setVisible(true);
		        dispose();
			}
		});
		menuMenu.add(menuVoltar);
		
		JLabel lblNewLabel = new JLabel("Localizar livro");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados do Livro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(painelCampos, BorderLayout.CENTER);
		
		JLabel lblNomeLivro = new JLabel("Nome do Livro:");
		lblNomeLivro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomeLivro.setBounds(10, 23, 89, 17);
		painelCampos.add(lblNomeLivro);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(96, 23, 259, 20);
		painelCampos.add(textField);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAutor.setBounds(10, 60, 60, 14);
		painelCampos.add(lblAutor);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(55, 57, 300, 20);
		painelCampos.add(textField_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(175, 108, 89, 23);
		painelCampos.add(btnBuscar);

	}

}
