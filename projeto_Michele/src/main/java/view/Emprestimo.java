package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Emprestimo extends JInternalFrame {
	private JTextField textCpfAluno;
	private JTextField textNomeAluno;
	private JTextField textCurso;
	private JTextField textPeriodo;
	private JTextField textPendencia;
	private JTextField textNomeLivro;
	private JTextField textAutor;
	private JTextField textEditora;
	private JTextField textExemplares;
	private JTextField textIsbn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emprestimo frame = new Emprestimo();
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
	public Emprestimo() {
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 477, 434);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Empr\u00E9stimo de Livro");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 434, 25);
		getContentPane().add(lblNewLabel);
		
		JPanel panelDadosAluno = new JPanel();
		panelDadosAluno.setBorder(new TitledBorder(null, "Dados Aluno", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDadosAluno.setToolTipText("");
		panelDadosAluno.setBounds(10, 27, 441, 135);
		getContentPane().add(panelDadosAluno);
		panelDadosAluno.setLayout(null);
		
		JLabel lblCpf = new JLabel("CPF aluno:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCpf.setBounds(10, 23, 81, 14);
		panelDadosAluno.add(lblCpf);
		
		JLabel lblNomeAluno = new JLabel("Nome do aluno:");
		lblNomeAluno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomeAluno.setBounds(10, 51, 98, 14);
		panelDadosAluno.add(lblNomeAluno);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCurso.setBounds(10, 79, 46, 14);
		panelDadosAluno.add(lblCurso);
		
		JLabel lblPendencia = new JLabel("Possui pend\u00EAncias?");
		lblPendencia.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPendencia.setBounds(10, 107, 124, 14);
		panelDadosAluno.add(lblPendencia);
		
		JLabel lblPeriodo = new JLabel("Per\u00EDodo:");
		lblPeriodo.setBounds(284, 79, 57, 14);
		panelDadosAluno.add(lblPeriodo);
		
		textCpfAluno = new JTextField();
		textCpfAluno.setBounds(110, 23, 182, 20);
		panelDadosAluno.add(textCpfAluno);
		textCpfAluno.setColumns(10);
		
		textNomeAluno = new JTextField();
		textNomeAluno.setColumns(10);
		textNomeAluno.setBounds(110, 51, 182, 20);
		panelDadosAluno.add(textNomeAluno);
		
		textCurso = new JTextField();
		textCurso.setColumns(10);
		textCurso.setBounds(110, 76, 164, 20);
		panelDadosAluno.add(textCurso);
		
		textPeriodo = new JTextField();
		textPeriodo.setColumns(10);
		textPeriodo.setBounds(340, 73, 91, 20);
		panelDadosAluno.add(textPeriodo);
		
		textPendencia = new JTextField();
		textPendencia.setColumns(10);
		textPendencia.setBounds(128, 104, 146, 20);
		panelDadosAluno.add(textPendencia);
		
		JButton btnPesquisarAluno = new JButton("Pesquisar");
		btnPesquisarAluno.setBounds(333, 19, 98, 23);
		panelDadosAluno.add(btnPesquisarAluno);
		
		JPanel panelDadosLivro = new JPanel();
		panelDadosLivro.setLayout(null);
		panelDadosLivro.setToolTipText("");
		panelDadosLivro.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados Livro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelDadosLivro.setBounds(10, 173, 441, 163);
		getContentPane().add(panelDadosLivro);
		
		JLabel lblExemplares = new JLabel("Exemplares Dispon\u00EDveis:");
		lblExemplares.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblExemplares.setBounds(10, 138, 146, 14);
		panelDadosLivro.add(lblExemplares);
		
		textNomeLivro = new JTextField();
		textNomeLivro.setColumns(10);
		textNomeLivro.setBounds(117, 19, 182, 20);
		panelDadosLivro.add(textNomeLivro);
		
		textAutor = new JTextField();
		textAutor.setColumns(10);
		textAutor.setBounds(117, 47, 182, 20);
		panelDadosLivro.add(textAutor);
		
		textEditora = new JTextField();
		textEditora.setColumns(10);
		textEditora.setBounds(117, 75, 182, 20);
		panelDadosLivro.add(textEditora);
		
		textExemplares = new JTextField();
		textExemplares.setColumns(10);
		textExemplares.setBounds(170, 135, 106, 20);
		panelDadosLivro.add(textExemplares);
		
		JButton btnPesquisarLivro = new JButton("Pesquisar");
		btnPesquisarLivro.setBounds(337, 19, 94, 23);
		panelDadosLivro.add(btnPesquisarLivro);
		
		JLabel lblNomeLivro = new JLabel("Nome do Livro:");
		lblNomeLivro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomeLivro.setBounds(10, 22, 97, 17);
		panelDadosLivro.add(lblNomeLivro);
		
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
		textIsbn.setBounds(117, 106, 182, 20);
		panelDadosLivro.add(textIsbn);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(115, 347, 89, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.setBounds(217, 347, 89, 23);
		getContentPane().add(btnConcluir);
		
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

	}
}
