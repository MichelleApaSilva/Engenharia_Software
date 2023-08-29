package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAutenticar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAutenticar frame = new TelaAutenticar();
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
	public TelaAutenticar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 434, 270);
		contentPane.add(panel);
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio:");
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setBounds(106, 109, 46, 14);
		panel.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(116, 134, 46, 14);
		panel.add(lblSenha);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(162, 106, 156, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(162, 134, 156, 20);
		panel.add(textField_1);
		
		JLabel lbNomeBibli = new JLabel("Biblioteca Express");
		lbNomeBibli.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 30));
		lbNomeBibli.setBounds(100, 33, 248, 41);
		panel.add(lbNomeBibli);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaPrincipal tela = new TelaPrincipal();
				tela.setVisible(true);
				setVisible(false);
			}
		});
		btnConectar.setBounds(192, 172, 89, 23);
		panel.add(btnConectar);
	}
}
