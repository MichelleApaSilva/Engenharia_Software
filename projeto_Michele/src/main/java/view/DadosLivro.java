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

import control.LivroControle;
import model.Livro;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DadosLivro extends JInternalFrame {
	// atributos do projeto
	private Livro objeto;
	// ou colocar no construtor
	private LivroControle controle = new LivroControle();
	
	// campos da tela
	private JTextField textTitulo;
	private JTextField textAutor;
	private JTextField textEditora;
	private JTextField textIsbn;
	private JTextField textCodExemplar;
	private JButton btnInserir;
	private JButton btnExcluir;
	private JButton btnConsultar;
	private JButton btnSalvar;
	private JButton btnAlterar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosLivro frame = new DadosLivro();
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
	public DadosLivro() {
		// controle = new LivroControle();
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 480, 436);
		
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
		
		JLabel lblDadosLivro = new JLabel("Dados do Livro");
		lblDadosLivro.setHorizontalAlignment(SwingConstants.CENTER);
		lblDadosLivro.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDadosLivro.setBounds(0, 0, 434, 25);
		getContentPane().add(lblDadosLivro);
		
		JPanel panelDadosLivro = new JPanel();
		panelDadosLivro.setLayout(null);
		panelDadosLivro.setToolTipText("");
		panelDadosLivro.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados Livro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelDadosLivro.setBounds(10, 36, 445, 172);
		getContentPane().add(panelDadosLivro);
		
		textTitulo = new JTextField();
		textTitulo.setColumns(10);
		textTitulo.setBounds(119, 46, 182, 20);
		panelDadosLivro.add(textTitulo);
		
		textAutor = new JTextField();
		textAutor.setColumns(10);
		textAutor.setBounds(119, 74, 182, 20);
		panelDadosLivro.add(textAutor);
		
		textEditora = new JTextField();
		textEditora.setColumns(10);
		textEditora.setBounds(119, 102, 182, 20);
		panelDadosLivro.add(textEditora);
		
		btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textTitulo.setEnabled(true);
				textAutor.setEnabled(true);
				textEditora.setEnabled(true);
				btnSalvar.setEnabled(true);
				Long valor = new parse Long(textIsbn.getText());
				objeto = new Livro(null, textTitulo.getText(), textAutor.getText(), textEditora.getText(), textIsbn.getText());
				controle.inserir(objeto);
				JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso");
				textCodExemplar.setText(String.valueOf(objeto.getCodExemplar()));
			}
		});
		btnInserir.setBounds(330, 19, 105, 23);
		panelDadosLivro.add(btnInserir);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo:");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitulo.setBounds(10, 49, 99, 17);
		panelDadosLivro.add(lblTitulo);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAutor.setBounds(10, 75, 60, 14);
		panelDadosLivro.add(lblAutor);
		
		JLabel lblEditora = new JLabel("Editora:");
		lblEditora.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEditora.setBounds(10, 106, 60, 14);
		panelDadosLivro.add(lblEditora);
		
		JLabel lblIsbn = new JLabel("ISBN:");
		lblIsbn.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIsbn.setBounds(10, 137, 60, 14);
		panelDadosLivro.add(lblIsbn);
		
		textIsbn = new JTextField();
		textIsbn.setColumns(10);
		textIsbn.setBounds(119, 133, 182, 20);
		panelDadosLivro.add(textIsbn);
		
		JLabel lblCodExemplar = new JLabel("C\u00F3digo do Exemplar:");
		lblCodExemplar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCodExemplar.setBounds(10, 22, 126, 17);
		panelDadosLivro.add(lblCodExemplar);
		
		textCodExemplar = new JTextField();
		textCodExemplar.setColumns(10);
		textCodExemplar.setBounds(146, 19, 155, 20);
		panelDadosLivro.add(textCodExemplar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer valor = Integer.parseInt(textCodExemplar.getText());
				objeto = controle.buscarPorId(valor);
				if (objeto != null) {
					textCodExemplar.setText(String.valueOf(objeto.getCodExemplar()));
					textTitulo.setText(objeto.getTitulo());
					textAutor.setText(objeto.getAutor());
					textEditora.setText(objeto.getEditora());
					textIsbn.setText(objeto.getIsbn());
				}else {
					JOptionPane.showMessageDialog(null, "Não existe o livro com o código digitado");
					textCodExemplar.setText("");
				}
			}
		});
		btnConsultar.setBounds(330, 101, 105, 23);
		panelDadosLivro.add(btnConsultar);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(objeto != null) {
					objeto.setTitulo(textTitulo.getText());
					objeto.setAutor(textAutor.getText());
					objeto.setEditora(textEditora.getText());
					objeto.setIsbn(textIsbn.getText());
					controle.alterar(objeto);
					JOptionPane.showMessageDialog(null, "Livro alterado com sucesso.");
				}else{
					JOptionPane.showMessageDialog(null, "Não há livro para ser modificado.");
				}
			}
		});
		btnAlterar.setBounds(330, 45, 105, 23);
		panelDadosLivro.add(btnAlterar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (objeto !=null) {
					controle.excluir(objeto);
					objeto = null;
					textCodExemplar.setText("");
					textTitulo.setText("");
					textAutor.setText("");
					textEditora.setText("");
					textIsbn.setText("");
					JOptionPane.showMessageDialog(null, "Livro excluído com sucesso.");
				}else {
						JOptionPane.showMessageDialog(null, "Não há objeto a ser excluído.");
					}
				}					
		});
		btnExcluir.setBounds(330, 73, 105, 23);
		panelDadosLivro.add(btnExcluir);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnFechar.setBounds(330, 133, 105, 23);
		panelDadosLivro.add(btnFechar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(116, 350, 89, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTitulo.getText().length() < 5) {
					JOptionPane.showMessageDialog(btnSalvar, "O título precisa ter no mínimo 5 caracteres.");
				}else {
					livro.setTitulo(textTitulo.getText());
					livro.setAutor(textAutor.getText());
					controle.inserir(livro);
					JOptionPane.showMessageDialog(btnSalvar, "Livro cadastrado.");
					textTitulo.setEnabled(false);
					textAutor.setEnabled(false);
					textCodExemplar(String.valueof(livro.getCodExemplar()));
				}
			}
		});
		btnSalvar.setEnabled(false);
		btnSalvar.setBounds(218, 350, 89, 23);
		getContentPane().add(btnSalvar);

	}

}
