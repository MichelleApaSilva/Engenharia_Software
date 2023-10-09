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
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textidUsuario;

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
		setBounds(100, 100, 543, 330);
		
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
		textField.setBounds(55, 58, 295, 20);
		painelCampos.add(textField);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(10, 62, 43, 17);
		painelCampos.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 97, 211, 20);
		painelCampos.add(textField_1);
		
		JLabel lblDt_nasc = new JLabel("Data de Nascimento:");
		lblDt_nasc.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDt_nasc.setBounds(10, 103, 123, 14);
		painelCampos.add(lblDt_nasc);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(65, 136, 285, 20);
		painelCampos.add(textField_3);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefone.setBounds(10, 141, 60, 14);
		painelCampos.add(lblTelefone);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(44, 214, 306, 20);
		painelCampos.add(textField_4);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCPF.setBounds(10, 217, 168, 14);
		painelCampos.add(lblCPF);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(55, 175, 295, 20);
		painelCampos.add(textField_6);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(10, 179, 60, 14);
		painelCampos.add(lblEmail);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setBounds(376, 16, 129, 35);
		painelCampos.add(btnInserir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(376, 64, 129, 35);
		painelCampos.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(376, 112, 129, 35);
		painelCampos.add(btnExcluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(376, 160, 129, 35);
		painelCampos.add(btnConsultar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(376, 208, 129, 35);
		painelCampos.add(btnFechar);
		
		textidUsuario = new JTextField();
		textidUsuario.setColumns(10);
		textidUsuario.setBounds(80, 19, 270, 20);
		painelCampos.add(textidUsuario);
		
		JLabel lblIdUsurio = new JLabel("Id Usuário:");
		lblIdUsurio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdUsurio.setBounds(10, 25, 78, 17);
		painelCampos.add(lblIdUsurio);

	}
}
