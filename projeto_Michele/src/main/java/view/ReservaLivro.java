package view;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.ScrollPane;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;


import control.ReservaControle;
import model.Reserva;

public class ReservaLivro extends JInternalFrame {
	// atributos do projeto
	private Reserva objeto;
	// ou colocar no construtor
	private ReservaControle controle = new ReservaControle();
	
	private JTextField textCpf;
	private JTextField textNomeAluno;
	private JTextField textEmprestimos;
	private JTextField textTitulo;
	private JTextField textAutor;
	private JTextField textEditora;
	private JTextField textIsbn;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelamentoEmprestimo frame = new CancelamentoEmprestimo();
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
	public ReservaLivro() {
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 559, 508);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmAjuda = new JMenuItem("Ajuda");
		mnMenu.add(mntmAjuda);
		
		JMenuItem mntmVoltar = new JMenuItem("Voltar");
		mntmVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaPrincipal().setVisible(true);
		        dispose();
			}
		});
		mnMenu.add(mntmVoltar);
		getContentPane().setLayout(null);
		
		JLabel txtReservarLivro = new JLabel("Reservar Livro");
		txtReservarLivro.setHorizontalAlignment(SwingConstants.CENTER);
		txtReservarLivro.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtReservarLivro.setBounds(35, 0, 434, 25);
		getContentPane().add(txtReservarLivro);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 31, 403, 255);
		getContentPane().add(tabbedPane);
		
		JPanel panelDadosAluno = new JPanel();
		panelDadosAluno.setBorder(new LineBorder(new Color(0, 0, 0)));
		tabbedPane.addTab("Dados do Aluno", null, panelDadosAluno, null);
		panelDadosAluno.setLayout(null);
		panelDadosAluno.setToolTipText("");
		
		JLabel lblCpf = new JLabel("CPF aluno:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCpf.setBounds(10, 23, 81, 14);
		panelDadosAluno.add(lblCpf);
		
		JLabel lblNomeAluno = new JLabel("Nome do aluno:");
		lblNomeAluno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomeAluno.setBounds(10, 51, 91, 14);
		panelDadosAluno.add(lblNomeAluno);
		
		JLabel txtEmprestimos = new JLabel("Possui empr\u00E9stimos?");
		txtEmprestimos.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtEmprestimos.setBounds(10, 75, 278, 14);
		panelDadosAluno.add(txtEmprestimos);
		
		textCpf = new JTextField();
		textCpf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				
				/*table.setModel(new DefaultTableModel(
						new Object[][] {
							{null, "Bruno", null},
							{null, null, null},
							{null, null, null},
						},
						new String[] {
							"CPF", "Nome", "Possui emprestimos?"
						}
					));*/
			}
		});
		textCpf.setColumns(10);
		textCpf.setBounds(106, 17, 182, 20);
		panelDadosAluno.add(textCpf);
		
		textNomeAluno = new JTextField();
		textNomeAluno.setColumns(10);
		textNomeAluno.setBounds(106, 45, 182, 20);
		panelDadosAluno.add(textNomeAluno);
		
		textEmprestimos = new JTextField();
		textEmprestimos.setColumns(10);
		textEmprestimos.setBounds(155, 72, 133, 20);
		panelDadosAluno.add(textEmprestimos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 100, 378, 116);
		panelDadosAluno.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"CPF", "Nome", "Possui emprestimos?"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panelDadosLivro = new JPanel();
		panelDadosLivro.setLayout(null);
		panelDadosLivro.setToolTipText("");
		panelDadosLivro.setBorder(new LineBorder(new Color(0, 0, 0)));
		tabbedPane.addTab("Dados Livro", null, panelDadosLivro, null);
		
		textTitulo = new JTextField();
		textTitulo.setColumns(10);
		textTitulo.setBounds(95, 19, 182, 20);
		panelDadosLivro.add(textTitulo);
		
		textAutor = new JTextField();
		textAutor.setColumns(10);
		textAutor.setBounds(95, 47, 182, 20);
		panelDadosLivro.add(textAutor);
		
		textEditora = new JTextField();
		textEditora.setColumns(10);
		textEditora.setBounds(95, 75, 182, 20);
		panelDadosLivro.add(textEditora);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo:");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitulo.setBounds(10, 22, 99, 17);
		panelDadosLivro.add(lblTitulo);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAutor.setBounds(10, 48, 60, 14);
		panelDadosLivro.add(lblAutor);
		
		JLabel lblEditora = new JLabel("Editora:");
		lblEditora.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEditora.setBounds(10, 79, 60, 14);
		panelDadosLivro.add(lblEditora);
		
		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIsbn.setBounds(10, 110, 60, 14);
		panelDadosLivro.add(lblIsbn);
		
		textIsbn = new JTextField();
		textIsbn.setColumns(10);
		textIsbn.setBounds(95, 106, 182, 20);
		panelDadosLivro.add(textIsbn);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 135, 349, 81);
		panelDadosLivro.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nome Livro", "Autor", "Editora", "ISBN"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton btnInserir = new JButton("Novo");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*definirEstadoEdicao();
				limparCampos();*/
				textTitulo.requestFocus();
			}
		});
		btnInserir.setBounds(423, 99, 105, 23);
		getContentPane().add(btnInserir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(423, 130, 105, 23);
		getContentPane().add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(423, 164, 105, 23);
		getContentPane().add(btnExcluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(423, 193, 105, 23);
		getContentPane().add(btnConsultar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
			});
		btnSalvar.setBounds(215, 350, 105, 23);
		getContentPane().add(btnSalvar);
		
		JButton btnCancelar_1 = new JButton("Cancelar");
		btnCancelar_1.setBounds(100, 350, 105, 23);
		getContentPane().add(btnCancelar_1);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(423, 224, 105, 23);
		getContentPane().add(btnFechar);
		
		

	}
	

	
}
