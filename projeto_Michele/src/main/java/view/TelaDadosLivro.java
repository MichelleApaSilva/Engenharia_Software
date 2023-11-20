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

public class TelaDadosLivro extends JInternalFrame {
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
	private JButton btnNovo;
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
					TelaDadosLivro frame = new TelaDadosLivro();
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
	public TelaDadosLivro() {
		// controle = new LivroControle();
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 480, 343);
		
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
		panelDadosLivro.setBounds(10, 36, 445, 208);
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
		
		btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*textTitulo.setEnabled(true);
				textAutor.setEnabled(true);
				textEditora.setEnabled(true);
				btnSalvar.setEnabled(true);
				textIsbn.setText(String.valueOf(objeto.getIsbn()));
				controle.inserir(objeto);*/
				definirEstadoEdicao();
				limparCampos();
				textTitulo.requestFocus();
				JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso");
			}
		});
		btnNovo.setBounds(330, 19, 105, 23);
		panelDadosLivro.add(btnNovo);
		
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
				String id = JOptionPane.showInputDialog("Digite o id do livro: ");
				objeto = controle.buscarPorId(Integer.parseInt(id));
				if (objeto != null) {
					textCodExemplar.setText(String.valueOf(objeto.getCodExemplar()));
					textTitulo.setText(objeto.getTitulo());
					textAutor.setText(objeto.getAutor());
					textEditora.setText(objeto.getEditora());					
					textIsbn.setText(String.valueOf(objeto.getIsbn()));
				}else {
					JOptionPane.showMessageDialog(null, "Não existe o livro com o código digitado");
					textCodExemplar.setText("");
				}
			}
		});
		btnConsultar.setBounds(330, 101, 105, 23);
		panelDadosLivro.add(btnConsultar);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if(objeto != null) {
					objeto.setTitulo(textTitulo.getText());
					objeto.setAutor(textAutor.getText());
					objeto.setEditora(textEditora.getText());
					objeto.setIsbn(textIsbn.getText());
					controle.alterar(objeto);
					JOptionPane.showMessageDialog(null, "Livro alterado com sucesso.");
				}else{
					JOptionPane.showMessageDialog(null, "Não há livro para ser modificado.");
				}*/
				definirEstadoEdicao();
				textTitulo.requestFocus();
			}
		});	
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(330, 45, 105, 23);
		panelDadosLivro.add(btnAlterar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (objeto !=null) {
					controle.excluir(objeto);
					objeto = null;
					definirEstadoInicial();
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
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				definirEstadoInicial();
			}
		});
		btnCancelar.setBounds(94, 164, 105, 23);
		panelDadosLivro.add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setEnabled(false);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTitulo.getText().length() < 5) {
					JOptionPane.showMessageDialog(btnSalvar, "O título precisa ter no mínimo 5 caracteres.");
				}else {
					// novo livro
					if (objeto == null) {
						objeto = new Livro(); 
						objeto.setTitulo(textTitulo.getText());
						objeto.setAutor(textAutor.getText());
						objeto.setEditora(textEditora.getText());
						textIsbn.setText(String.valueOf(objeto.getIsbn()));
						controle.inserir(objeto);
						JOptionPane.showMessageDialog(btnSalvar, "Livro cadastrado.");
						textCodExemplar.setText(String.valueOf(objeto.getCodExemplar()));
						/*textTitulo.setEnabled(false);
						textAutor.setEnabled(false);
						textEditora.setEnabled(false);
						textIsbn.setEnabled(false);
						textCodExemplar.setText(String.valueOf(objeto.getCodExemplar()));
						textIsbn.setText(String.valueOf(objeto.getIsbn()));*/
				}else {
					// alterar 
					objeto.setTitulo(textTitulo.getText());
					objeto.setAutor(textAutor.getText());
					objeto.setEditora(textEditora.getText());
					textIsbn.setText(String.valueOf(objeto.getIsbn()));
					controle.alterar(objeto);
					JOptionPane.showMessageDialog(btnSalvar, "Livro atualizado.");
				}
				definirEstadoConsulta();
			}	
		}});
		btnSalvar.setBounds(210, 164, 105, 23);
		panelDadosLivro.add(btnSalvar);	

	}
	
	private void definirEstadoInicial() {
		limparCampos();
		btnNovo.setEnabled(true);
		btnExcluir.setEnabled(false);
		btnAlterar.setEnabled(false);
		btnConsultar.setEnabled(true);
		btnSalvar.setEnabled(false);
		
		textTitulo.setEnabled(false);
		textAutor.setEnabled(false);
		textEditora.setEnabled(false);
		textIsbn.setEnabled(false);
	}
	
	private void definirEstadoEdicao() {
		textTitulo.setEnabled(true);
		textAutor.setEnabled(true);
		textEditora.setEnabled(true);
		textIsbn.setEnabled(true);
		
		btnNovo.setEnabled(true);
		btnExcluir.setEnabled(true);
		btnAlterar.setEnabled(true);
		btnConsultar.setEnabled(true);
		btnSalvar.setEnabled(true);
	}
	
	private void definirEstadoConsulta() {
		textTitulo.setEnabled(false);
		textEditora.setEnabled(false);
		textAutor.setEnabled(false);
		textIsbn.setEnabled(false);
		
		btnNovo.setEnabled(true);
		btnExcluir.setEnabled(true);
		btnAlterar.setEnabled(true);
		btnConsultar.setEnabled(true);
		btnSalvar.setEnabled(false);
	}
	
	private void limparCampos() {
		textCodExemplar.setText("");
		textTitulo.setText("");
		textAutor.setText("");
		textEditora.setText("");
		textIsbn.setText("");
	}
}
