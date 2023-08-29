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
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class ConsultarUsuario extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarUsuario frame = new ConsultarUsuario();
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
	public ConsultarUsuario() {
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuMenu = new JMenu("Menu");
		menuBar.add(menuMenu);
		
		JMenuItem menuDadosCadastrais = new JMenuItem("Dados Cadastrais");
		menuDadosCadastrais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DadosCadastrais tela = new DadosCadastrais();
				getParent().add(tela);
				tela.setVisible(true);
				dispose();
			}
		});
		menuMenu.add(menuDadosCadastrais);
		
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
		
		JLabel lblNewLabel = new JLabel("Consultar Usu\u00E1rio");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Consultar", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(painelCampos, BorderLayout.CENTER);
		
		JLabel lblNomeLivro = new JLabel("Nome:");
		lblNomeLivro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomeLivro.setBounds(10, 23, 89, 17);
		painelCampos.add(lblNomeLivro);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(55, 23, 228, 20);
		painelCampos.add(textField);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCPF.setBounds(10, 60, 60, 14);
		painelCampos.add(lblCPF);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(55, 57, 228, 20);
		painelCampos.add(textField_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(76, 88, 89, 23);
		painelCampos.add(btnBuscar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(184, 88, 89, 23);
		painelCampos.add(btnCancelar);

	}

}
