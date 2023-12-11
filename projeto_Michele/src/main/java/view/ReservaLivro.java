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
import control.ReservaControle;
import control.UsuarioControle;
import model.Livro;
import model.Reserva;
import model.Usuario;

public class ReservaLivro extends JInternalFrame {
	// atributos do projeto
	private Reserva objeto;
	private Usuario usuario;
	// ou colocar no construtor
	private ReservaControle controle = new ReservaControle();
	private UsuarioControle usuarioControle = new UsuarioControle(); 
	
	private JTextField textCpf;
	private JTextField textNome;
	private JTextField textEmprestimos;
	private JTextField textTitulo;
	private JTextField textAutor;
	private JTextField textEditora;
	private JTextField textIsbn;
	private JTable table;
	private JTable table_1;
	private JTextField textIdReserva;
	private JTextField textDataReserva;
	private JTextField textDataExpiracao;
	private JButton btnInserir;
	private JButton btnCancelar_1;
	private JButton btnExcluir;
	private JButton btnAlterar;
	private JButton btnConsultar;
	private JButton btnSalvar;

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
		
		JPanel panelDadosReserva = new JPanel();
		panelDadosReserva.setLayout(null);
		panelDadosReserva.setToolTipText("");
		panelDadosReserva.setBorder(new LineBorder(new Color(0, 0, 0)));
		tabbedPane.addTab("Dados da Reserva", null, panelDadosReserva, null);
		
		JLabel lblIdReserva = new JLabel("Id Reserva: ");
		lblIdReserva.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdReserva.setBounds(10, 23, 81, 14);
		panelDadosReserva.add(lblIdReserva);
		
		JLabel lblDataReserva = new JLabel("Data da Reserva:");
		lblDataReserva.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataReserva.setBounds(10, 48, 120, 14);
		panelDadosReserva.add(lblDataReserva);
		
		JLabel lblDataExpiracao = new JLabel("Data de Expira\u00E7\u00E3o:");
		lblDataExpiracao.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataExpiracao.setBounds(10, 75, 135, 14);
		panelDadosReserva.add(lblDataExpiracao);
		
		textIdReserva = new JTextField();
		textIdReserva.setEnabled(false);
		textIdReserva.setColumns(10);
		textIdReserva.setBounds(130, 17, 158, 20);
		panelDadosReserva.add(textIdReserva);
		
		textDataReserva = new JTextField();
		textDataReserva.setEnabled(false);
		textDataReserva.setColumns(10);
		textDataReserva.setBounds(130, 45, 158, 20);
		panelDadosReserva.add(textDataReserva);
		
		textDataExpiracao = new JTextField();
		textDataExpiracao.setEnabled(false);
		textDataExpiracao.setColumns(10);
		textDataExpiracao.setBounds(130, 72, 158, 20);
		panelDadosReserva.add(textDataExpiracao);
		
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
		lblNomeAluno.setBounds(10, 48, 91, 14);
		panelDadosAluno.add(lblNomeAluno);
		
		JLabel txtEmprestimos = new JLabel("Possui empr\u00E9stimos?");
		txtEmprestimos.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtEmprestimos.setBounds(10, 75, 133, 14);
		panelDadosAluno.add(txtEmprestimos);
		
		textCpf = new JTextField();
		textCpf.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String cpf = textCpf.getText();
					List<Usuario> usuario = usuarioControle.buscarPorCpf(cpf);
				}
					
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
			}
		});
		textCpf.setColumns(10);
		textCpf.setBounds(106, 17, 182, 20);
		panelDadosAluno.add(textCpf);
		
		textNome = new JTextField();
		textNome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String nome = textNome.getText();
					List<Usuario> usuario = usuarioControle.buscarPorNome(nome);
				}
			}
		});
		textNome.setColumns(10);
		textNome.setBounds(106, 45, 182, 20);
		panelDadosAluno.add(textNome);
		
		textEmprestimos = new JTextField();
		textEmprestimos.setColumns(10);
		textEmprestimos.setBounds(155, 72, 133, 20);
		panelDadosAluno.add(textEmprestimos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 100, 378, 105);
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
		tabbedPane.addTab("Dados do Livro", null, panelDadosLivro, null);
		
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
		
		btnInserir = new JButton("Novo");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				definirEstadoEdicao();
				limparCampos();
			}
		});
		btnInserir.setBounds(423, 99, 105, 23);
		getContentPane().add(btnInserir);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				definirEstadoEdicao();
			}
		});
		btnAlterar.setBounds(423, 130, 105, 23);
		getContentPane().add(btnAlterar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (objeto !=null) {
					controle.excluir(objeto);
					objeto = null;
					definirEstadoInicial();
					JOptionPane.showMessageDialog(null, "Reserva excluído com sucesso.");
				}else {
						JOptionPane.showMessageDialog(null, "Não há objeto a ser excluído.");
					}
				}			
			});
		btnExcluir.setBounds(423, 164, 105, 23);
		getContentPane().add(btnExcluir);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer valor = Integer.parseInt(textIdReserva.getText());
				objeto = controle.buscarPorId(valor);
				String id = JOptionPane.showInputDialog("Digite o id da reserva: ");
				objeto = controle.buscarPorId(Integer.parseInt(id));
				if (objeto != null) {
					textIdReserva.setText(String.valueOf(objeto.getCodReserva()));
					textDataReserva.setText(String.valueOf(objeto.getDataReserva()));
					textDataExpiracao.setText(String.valueOf(objeto.getDataExpiracao()));
				}else {
					JOptionPane.showMessageDialog(null, "Não existe a reserva com o código digitado");
					textIdReserva.setText("");
				}
			}
		});
		btnConsultar.setBounds(423, 193, 105, 23);
		getContentPane().add(btnConsultar);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// nova reserva
				if (objeto == null) {
					objeto = new Reserva(); 
					textIdReserva.setText(String.valueOf(objeto.getCodReserva()));
					textDataReserva.setText(String.valueOf(objeto.getDataReserva()));
					textDataExpiracao.setText(String.valueOf(objeto.getDataExpiracao()));
					controle.inserir(objeto);
					JOptionPane.showMessageDialog(btnSalvar, "Reserva cadastrada com sucesso.");
				// alterar reserva	
				}else{
					textDataReserva.setText(String.valueOf(objeto.getDataReserva()));
					textDataExpiracao.setText(String.valueOf(objeto.getDataExpiracao()));
					controle.alterar(objeto);
					JOptionPane.showMessageDialog(btnSalvar, "Reserva atualizada.");
				}
				definirEstadoConsulta();
			}});
		btnSalvar.setBounds(222, 297, 105, 23);
		getContentPane().add(btnSalvar);
		
		JButton btnCancelar_1 = new JButton("Cancelar");
		btnCancelar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				definirEstadoInicial();
			}
		});
		btnCancelar_1.setBounds(104, 297, 105, 23);
		getContentPane().add(btnCancelar_1);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnFechar.setBounds(423, 224, 105, 23);
		getContentPane().add(btnFechar);	

	}

	private void definirEstadoInicial() {
		limparCampos();
		btnInserir.setEnabled(true);
		btnExcluir.setEnabled(false);
		btnAlterar.setEnabled(false);
		btnConsultar.setEnabled(true);
		btnSalvar.setEnabled(false);
		
		textDataExpiracao.setEnabled(false);
		textDataReserva.setEnabled(false);
		textTitulo.setEnabled(false);
		textAutor.setEnabled(false);
		textEditora.setEnabled(false);
		textIsbn.setEnabled(false);
		textNome.setEnabled(false);
		textCpf.setEnabled(false);
	}
	
	private void definirEstadoEdicao() {
		textDataExpiracao.setEnabled(true);
		textDataReserva.setEnabled(true);
		textTitulo.setEnabled(true);
		textAutor.setEnabled(true);
		textEditora.setEnabled(true);
		textIsbn.setEnabled(true);
		textNome.setEnabled(true);
		textCpf.setEnabled(true);
		
		btnInserir.setEnabled(false);
		btnExcluir.setEnabled(false);
		btnAlterar.setEnabled(false);
		btnConsultar.setEnabled(false);
		btnSalvar.setEnabled(true);
	}
	
	private void definirEstadoConsulta() {
		textDataExpiracao.setEnabled(false);
		textDataReserva.setEnabled(false);
		textTitulo.setEnabled(false);
		textEditora.setEnabled(false);
		textAutor.setEnabled(false);
		textIsbn.setEnabled(false);
		
		btnInserir.setEnabled(true);
		btnExcluir.setEnabled(true);
		btnAlterar.setEnabled(true);
		btnConsultar.setEnabled(true);
		btnSalvar.setEnabled(false);
		
	}
	
	private void limparCampos() {
		textDataExpiracao.setText("");
		textDataReserva.setText("");
		textTitulo.setText("");
		textAutor.setText("");
		textEditora.setText("");
		textIsbn.setText("");
		
		textNome.setText("");
		textCpf.setText("");
	}
}
