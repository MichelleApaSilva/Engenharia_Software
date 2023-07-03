package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
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
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DadosCadastrais extends JInternalFrame {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosCadastrais frame = new DadosCadastrais();
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
	public DadosCadastrais() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuMenu = new JMenu("Menu");
		menuBar.add(menuMenu);
		
		JMenuItem menuConsultarUsu = new JMenuItem("Consultar Usu\u00E1rio");
		menuConsultarUsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarUsuario tela = new ConsultarUsuario();
				getParent().add(tela);
				tela.setVisible(true);
				dispose();
			}
		});
		menuMenu.add(menuConsultarUsu);
		
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
		
		JLabel lblSolicitarCompra = new JLabel("Dados Cadastrais");
		lblSolicitarCompra.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolicitarCompra.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblSolicitarCompra, BorderLayout.NORTH);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(painelCampos, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(55, 23, 189, 20);
		painelCampos.add(textField);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(10, 25, 43, 17);
		painelCampos.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 53, 105, 20);
		painelCampos.add(textField_1);
		
		JLabel lblDt_nasc = new JLabel("Data de Nascimento:");
		lblDt_nasc.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDt_nasc.setBounds(10, 56, 123, 14);
		painelCampos.add(lblDt_nasc);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCurso.setBounds(10, 87, 60, 14);
		painelCampos.add(lblCurso);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(55, 84, 189, 20);
		painelCampos.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(65, 112, 179, 20);
		painelCampos.add(textField_3);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefone.setBounds(10, 115, 60, 14);
		painelCampos.add(lblTelefone);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(121, 170, 89, 23);
		painelCampos.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(225, 170, 89, 23);
		painelCampos.add(btnCancelar);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(299, 23, 123, 20);
		painelCampos.add(textField_4);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCPF.setBounds(262, 26, 168, 14);
		painelCampos.add(lblCPF);
		
		JLabel lblPeriodo = new JLabel("Per\u00EDodo:");
		lblPeriodo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPeriodo.setBounds(254, 87, 60, 14);
		painelCampos.add(lblPeriodo);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(306, 84, 116, 20);
		painelCampos.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(55, 143, 189, 20);
		painelCampos.add(textField_6);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(10, 149, 60, 14);
		painelCampos.add(lblEmail);

	}
}
