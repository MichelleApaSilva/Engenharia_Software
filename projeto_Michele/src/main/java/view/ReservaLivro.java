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
//import java.awt.List;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import control.LivroControle;
import control.ReservaControle;
import control.UsuarioControle;
import model.Livro;
import model.Reserva;
import model.Usuario;
import java.util.List;


public class ReservaLivro extends JInternalFrame {
	// atributos do projeto
	private Reserva objeto;
	private Livro livro;
	private Usuario usuario;
	// ou colocar no construtor
	private ReservaControle controle = new ReservaControle();
	private LivroControle livroControle = new LivroControle();
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
	private JTextField textIdUsuario;
	private JTextField textCodExemplar;
	private JTextField textNumReservas;

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
		lblDataReserva.setBounds(10, 104, 120, 14);
		panelDadosReserva.add(lblDataReserva);
		
		JLabel lblDataExpiracao = new JLabel("Data de Expira\u00E7\u00E3o:");
		lblDataExpiracao.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataExpiracao.setBounds(10, 131, 135, 14);
		panelDadosReserva.add(lblDataExpiracao);
		
		textIdReserva = new JTextField();
		textIdReserva.setColumns(10);
		textIdReserva.setBounds(130, 17, 158, 20);
		panelDadosReserva.add(textIdReserva);
		
		textDataReserva = new JTextField();
		textDataReserva.setEnabled(false);
		textDataReserva.setColumns(10);
		textDataReserva.setBounds(130, 101, 158, 20);
		panelDadosReserva.add(textDataReserva);

		textDataExpiracao = new JTextField();
		textDataExpiracao.setEnabled(false);
		textDataExpiracao.setColumns(10);
		textDataExpiracao.setBounds(130, 128, 158, 20);
		panelDadosReserva.add(textDataExpiracao);
            
        JLabel lblIdAluno = new JLabel("Id Usu\u00E1rio:");
        lblIdAluno.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblIdAluno.setBounds(10, 51, 120, 14);
        panelDadosReserva.add(lblIdAluno);
            
        textIdUsuario = new JTextField();
        textIdUsuario.setText((String) null);
        textIdUsuario.setColumns(10);
        textIdUsuario.setBounds(130, 48, 158, 20);
        panelDadosReserva.add(textIdUsuario);
            
        textCodExemplar = new JTextField();
        textCodExemplar.setText((String) null);
        textCodExemplar.setColumns(10);
        textCodExemplar.setBounds(130, 75, 158, 20);
        panelDadosReserva.add(textCodExemplar);
            
        JLabel lblCodExemplar = new JLabel("C\u00F3digo Exemplar:");
        lblCodExemplar.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblCodExemplar.setBounds(10, 78, 135, 14);
        panelDadosReserva.add(lblCodExemplar);
        
        JLabel lblNumReservas = new JLabel("N\u00FAmero de Reservas:");
        lblNumReservas.setFont(new Font("Tahoma", Font.ITALIC, 11));
        lblNumReservas.setBounds(10, 159, 135, 14);
        panelDadosReserva.add(lblNumReservas);
        
        textNumReservas = new JTextField();
        textNumReservas.setEnabled(false);
        textNumReservas.setColumns(10);
        textNumReservas.setBounds(130, 156, 158, 20);
        panelDadosReserva.add(textNumReservas);
        
        
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
					List<Usuario> usuarioEncontrados = usuarioControle.buscarPorCpf(cpf);
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
					List<Usuario> usuarioEncontrados = usuarioControle.buscarPorNome(nome);
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
					JOptionPane.showMessageDialog(null, "Reserva exclu�do com sucesso.");
				}else {
						JOptionPane.showMessageDialog(null, "N�o h� objeto a ser exclu�do.");
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
					textCodExemplar.setText(String.valueOf(objeto.getCod_Livro()));
					textIdUsuario.setText(String.valueOf(objeto.getIdUsuario()));
					textDataReserva.setText(String.valueOf(objeto.getDataReserva()));
					textDataExpiracao.setText(String.valueOf(objeto.getDataExpiracao()));
					// rela��o est� com erro
					//textNumReservas.setText(String.valueOf(objeto.getReservas().size()));
					
				}else {
					JOptionPane.showMessageDialog(null, "N�o existe a reserva com o c�digo digitado");
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
					//textDataReserva.setText(String.valueOf(objeto.getDataReserva()));
					textCodExemplar.setText(String.valueOf(objeto.getCod_Livro()));
					textIdUsuario.setText(String.valueOf(objeto.getIdUsuario()));
					textDataReserva.setText(objeto.getDataReserva());
					//textDataReserva.setText(String.valueOf(objeto.getDataReserva()));
					controle.inserir(objeto);
					JOptionPane.showMessageDialog(btnSalvar, "Reserva cadastrada com sucesso.");
				// alterar reserva	
				}else{
					textDataReserva.setText(objeto.getDataReserva());
					//textDataReserva.setText(String.valueOf(objeto.getDataReserva()));
					textDataExpiracao.setText(String.valueOf(objeto.getDataExpiracao()));
					textCodExemplar.setText(String.valueOf(objeto.getCod_Livro()));
					textIdUsuario.setText(String.valueOf(objeto.getIdUsuario()));
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
		//textDataReserva.setText(getCurrentDateTime());
		//LocalDateTime expirationDateTime = LocalDateTime.now().plusDays(5);
       // textDataExpiracao.setText(formatDateTime(expirationDateTime));
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
		//textDataReserva.setText(getCurrentDateTime());
		//LocalDateTime dataExpiracao = LocalDateTime.now().plusDays(5);
		
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
