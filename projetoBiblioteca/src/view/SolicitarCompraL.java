package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SolicitarCompraL extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SolicitarCompraL frame = new SolicitarCompraL();
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
	public SolicitarCompraL() {
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JLabel lblSolicitarCompra = new JLabel("Solicitar Compra de Livros");
		lblSolicitarCompra.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolicitarCompra.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblSolicitarCompra, BorderLayout.NORTH);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Solicita\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(painelCampos, BorderLayout.CENTER);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio:");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUsuario.setBounds(10, 31, 46, 14);
		painelCampos.add(lblUsuario);
		
		JRadioButton rdbtnBibliotecario = new JRadioButton("Bibliotec\u00E1rio");
		rdbtnBibliotecario.setBounds(70, 27, 103, 23);
		painelCampos.add(rdbtnBibliotecario);
		
		JRadioButton rdbtnProfessor = new JRadioButton("Professor");
		rdbtnProfessor.setBounds(175, 27, 109, 23);
		painelCampos.add(rdbtnProfessor);
		
		JPanel painelCampos_1 = new JPanel();
		painelCampos_1.setLayout(null);
		painelCampos_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados do Livro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		painelCampos_1.setBounds(10, 54, 414, 165);
		painelCampos.add(painelCampos_1);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo:");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitulo.setBounds(10, 23, 43, 17);
		painelCampos_1.add(lblTitulo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(55, 21, 259, 20);
		painelCampos_1.add(textField);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAutor.setBounds(10, 51, 60, 14);
		painelCampos_1.add(lblAutor);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(55, 51, 259, 20);
		painelCampos_1.add(textField_1);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(196, 132, 89, 23);
		painelCampos_1.add(btnCancelar);
		
		JLabel lblEditora = new JLabel("Editora:");
		lblEditora.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEditora.setBounds(10, 79, 60, 14);
		painelCampos_1.add(lblEditora);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(55, 76, 259, 20);
		painelCampos_1.add(textField_2);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAno.setBounds(10, 104, 60, 14);
		painelCampos_1.add(lblAno);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(55, 101, 259, 20);
		painelCampos_1.add(textField_3);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(92, 132, 89, 23);
		painelCampos_1.add(btnSalvar);
		
		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		JMenu menuMenu = new JMenu("Menu");
		barraMenu.add(menuMenu);
		
		JMenuItem menuAjuda = new JMenuItem("Ajuda");
		menuMenu.add(menuAjuda);
		
		JMenuItem menuVoltar = new JMenuItem("Voltar");
		menuVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaPrincipal().
				setVisible(true);
		        dispose();
			}
		});
		
		
		
		menuMenu.add(menuVoltar);

	}
}
