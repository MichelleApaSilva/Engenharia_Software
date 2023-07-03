package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaLogin extends JInternalFrame {
	private JTextField textUsuario;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Login");
		setBounds(100, 100, 450, 300);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio:");
		lblUsuario.setBounds(106, 109, 46, 14);
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(116, 134, 46, 14);
		panel.add(lblSenha);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(162, 106, 156, 20);
		panel.add(textUsuario);
		textUsuario.setColumns(10);
		
		textSenha = new JTextField();
		textSenha.setBounds(162, 134, 156, 20);
		panel.add(textSenha);
		textSenha.setColumns(10);
		
		JLabel lbNomeBibli = new JLabel("Biblioteca Express");
		lbNomeBibli.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 30));
		lbNomeBibli.setBounds(100, 33, 248, 41);
		panel.add(lbNomeBibli);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.setBounds(192, 172, 89, 23);
		panel.add(btnConectar);

	}
}
