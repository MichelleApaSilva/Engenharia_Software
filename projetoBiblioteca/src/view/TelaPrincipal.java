package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.Frame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaPrincipal {

	private JFrame frmSistemaBiblioteca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
					window.frmSistemaBiblioteca.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * Construtor da Tela Principal
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaBiblioteca = new JFrame();
		frmSistemaBiblioteca.setTitle("Sistema Biblioteca");
		frmSistemaBiblioteca.setBounds(100, 100, 450, 300);
		frmSistemaBiblioteca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSistemaBiblioteca.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmSistemaBiblioteca.getContentPane().setLayout(null);
		
		JDesktopPane desktop = new JDesktopPane();
		desktop.setBounds(0, 0, 1350, 658);
		desktop.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frmSistemaBiblioteca.getContentPane().add(desktop);
		
		JMenuBar barraMenu = new JMenuBar();
		barraMenu.setBounds(0, 0, 434, 22);
		frmSistemaBiblioteca.setJMenuBar(barraMenu);
		
		JMenu menuCadastrar = new JMenu("Usu\u00E1rio");
		barraMenu.add(menuCadastrar);
		
		JMenuItem menuConsultarUs = new JMenuItem("Consultar");
		menuConsultarUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarUsuario tela = new ConsultarUsuario();
				tela.setVisible(true);
				desktop.add(tela);
			}
		});
		menuConsultarUs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.ALT_DOWN_MASK));
		menuCadastrar.add(menuConsultarUs);
		
		JMenuItem menuDadosCadastrais = new JMenuItem("Dados Cadastrais");
		menuDadosCadastrais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DadosCadastrais tela = new DadosCadastrais();
				tela.setVisible(true);
				desktop.add(tela);
			}
		});
		menuDadosCadastrais.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.ALT_DOWN_MASK));
		menuCadastrar.add(menuDadosCadastrais);
		
		JMenu menuLivro = new JMenu("Livro");
		barraMenu.add(menuLivro);
		
		JMenuItem menuSolicitarCompra = new JMenuItem("Solicitar Compra");
		menuSolicitarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SolicitarCompraL tela = new SolicitarCompraL();
				tela.setVisible(true);
				desktop.add(tela);
			}
		});
		menuLivro.add(menuSolicitarCompra);
		
		JMenuItem menuLocalizar = new JMenuItem("Localizar");
		menuLocalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LocalizarLivro tela = new LocalizarLivro();
				tela.setVisible(true);
				desktop.add(tela);
			}
		});
		menuLivro.add(menuLocalizar);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}