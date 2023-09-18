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
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CancelamentoEmprestimo extends JInternalFrame {
	private JTextField textCpf;
	private JTextField textNomeAluno;
	private JTextField textCurso;
	private JTextField textPeriodo;
	private JTextField textEmprestimos;
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
					ReservarLivro frame = new ReservarLivro();
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
	public CancelamentoEmprestimo() {
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
		
		JLabel lblNewLabel = new JLabel("Cancelamento de Empr\u00E9stimo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(0, 0, 434, 25);
		getContentPane().add(lblNewLabel);
		
		JPanel panelDadosAluno = new JPanel();
		panelDadosAluno.setLayout(null);
		panelDadosAluno.setToolTipText("");
		panelDadosAluno.setBorder(new TitledBorder(null, "Dados Aluno", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDadosAluno.setBounds(10, 31, 445, 135);
		getContentPane().add(panelDadosAluno);
		
		JLabel lblCpf = new JLabel("CPF aluno:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCpf.setBounds(10, 23, 81, 14);
		panelDadosAluno.add(lblCpf);
		
		JLabel lblNomeAluno = new JLabel("Nome do aluno:");
		lblNomeAluno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomeAluno.setBounds(10, 51, 91, 14);
		panelDadosAluno.add(lblNomeAluno);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCurso.setBounds(10, 79, 46, 14);
		panelDadosAluno.add(lblCurso);
		
		JLabel lblEmprestimos = new JLabel("Possui empr\u00E9stimos?");
		lblEmprestimos.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmprestimos.setBounds(10, 107, 135, 14);
		panelDadosAluno.add(lblEmprestimos);
		
		JLabel lblPeriodo = new JLabel("Per\u00EDodo:");
		lblPeriodo.setBounds(288, 79, 57, 14);
		panelDadosAluno.add(lblPeriodo);
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(106, 17, 182, 20);
		panelDadosAluno.add(textCpf);
		
		textNomeAluno = new JTextField();
		textNomeAluno.setColumns(10);
		textNomeAluno.setBounds(106, 45, 182, 20);
		panelDadosAluno.add(textNomeAluno);
		
		textCurso = new JTextField();
		textCurso.setColumns(10);
		textCurso.setBounds(106, 76, 172, 20);
		panelDadosAluno.add(textCurso);
		
		textPeriodo = new JTextField();
		textPeriodo.setColumns(10);
		textPeriodo.setBounds(344, 73, 91, 20);
		panelDadosAluno.add(textPeriodo);
		
		textEmprestimos = new JTextField();
		textEmprestimos.setColumns(10);
		textEmprestimos.setBounds(155, 104, 120, 20);
		panelDadosAluno.add(textEmprestimos);
		
		JButton btnPesquisarAluno = new JButton("Pesquisar");
		btnPesquisarAluno.setBounds(337, 19, 98, 23);
		panelDadosAluno.add(btnPesquisarAluno);
		
		JPanel panelDadosLivro = new JPanel();
		panelDadosLivro.setLayout(null);
		panelDadosLivro.setToolTipText("");
		panelDadosLivro.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados Livro", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelDadosLivro.setBounds(10, 180, 445, 163);
		getContentPane().add(panelDadosLivro);
		
		JLabel lblExemplares = new JLabel("Exemplares Dispon\u00EDveis:");
		lblExemplares.setBounds(10, 138, 141, 14);
		panelDadosLivro.add(lblExemplares);
		
		textNomeLivro = new JTextField();
		textNomeLivro.setColumns(10);
		textNomeLivro.setBounds(119, 19, 182, 20);
		panelDadosLivro.add(textNomeLivro);
		
		textAutor = new JTextField();
		textAutor.setColumns(10);
		textAutor.setBounds(119, 47, 182, 20);
		panelDadosLivro.add(textAutor);
		
		textEditora = new JTextField();
		textEditora.setColumns(10);
		textEditora.setBounds(119, 75, 182, 20);
		panelDadosLivro.add(textEditora);
		
		textExemplares = new JTextField();
		textExemplares.setColumns(10);
		textExemplares.setBounds(142, 135, 120, 20);
		panelDadosLivro.add(textExemplares);
		
		JButton btnPesquisarLivro = new JButton("Pesquisar");
		btnPesquisarLivro.setBounds(330, 19, 105, 23);
		panelDadosLivro.add(btnPesquisarLivro);
		
		JLabel lblNomeLivro = new JLabel("Nome do Livro:");
		lblNomeLivro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomeLivro.setBounds(10, 22, 99, 17);
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
		textIsbn.setBounds(119, 106, 182, 20);
		panelDadosLivro.add(textIsbn);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(116, 350, 89, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnConcluir = new JButton("Concluir");
		btnConcluir.setBounds(218, 350, 89, 23);
		getContentPane().add(btnConcluir);

	}

}
