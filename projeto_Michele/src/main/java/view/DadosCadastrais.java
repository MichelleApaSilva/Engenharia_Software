package view;

import java.awt.EventQueue;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import model.Usuario;
import control.UsuarioControle;

public class DadosCadastrais extends JInternalFrame {
	private Usuario objeto;
	private UsuarioControle controle = new UsuarioControle();
	
	private JFrame frame;
	private JTextField textNome;
	private JTextField textNascimento;
	private JTextField textTelefone;
	private JTextField textCpf;
	private JTextField textEmail;
	private JTextField textIdUsuario;
	private JTextField textEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DadosCadastrais frame = new DadosCadastrais();
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
	public DadosCadastrais() {
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 558, 344);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuMenu = new JMenu("Menu");
		menuBar.add(menuMenu);
		
		JMenuItem menuConsultarUsu = new JMenuItem("Consultar Usu\u00E1rio");
		menuConsultarUsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarUsuario tela = new ConsultarUsuario();
				getParent().add(tela);
				tela.setVisible(true);
				dispose();
			}
		});
		menuMenu.add(menuConsultarUsu);
		
		JMenuItem menuAjuda = new JMenuItem("Ajuda");
		menuMenu.add(menuAjuda);
		
		JMenuItem menuVoltar = new JMenuItem("Voltar");
		menuVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TelaPrincipal().setVisible(true);
		        dispose();
			}
		});
		menuMenu.add(menuVoltar);
		
		JLabel lblSolicitarCompra = new JLabel("Dados Cadastrais");
		lblSolicitarCompra.setHorizontalAlignment(SwingConstants.CENTER);
		lblSolicitarCompra.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblSolicitarCompra, BorderLayout.NORTH);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Dados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(painelCampos, BorderLayout.CENTER);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(55, 57, 295, 20);
		painelCampos.add(textNome);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNome.setBounds(10, 59, 43, 17);
		painelCampos.add(lblNome);
		
		textNascimento = new JTextField();
		textNascimento.setColumns(10);
		textNascimento.setBounds(129, 95, 221, 20);
		painelCampos.add(textNascimento);
		
		JLabel lblDtNascimento = new JLabel("Data de Nascimento:");
		lblDtNascimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDtNascimento.setBounds(10, 97, 123, 17);
		painelCampos.add(lblDtNascimento);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(65, 165, 285, 20);
		painelCampos.add(textTelefone);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefone.setBounds(10, 167, 60, 17);
		painelCampos.add(lblTelefone);
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(44, 130, 306, 20);
		painelCampos.add(textCpf);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCPF.setBounds(10, 132, 168, 17);
		painelCampos.add(lblCPF);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(55, 200, 295, 20);
		painelCampos.add(textEmail);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEmail.setBounds(10, 202, 60, 17);
		painelCampos.add(lblEmail);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objeto = new Usuario(null, textNome.getText(), textCpf.getText(), textTelefone.getText(), textEmail.getText(), textEndereco.getText());
				controle.inserir(objeto);
				JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
				textIdUsuario.setText(String.valueOf(objeto.getIdUsuario()));
			}
		});
		btnInserir.setBounds(384, 16, 129, 35);
		painelCampos.add(btnInserir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (objeto!=null) {
					objeto.setNome(textNome.getText());
					objeto.setCpf(textCpf.getText());
					objeto.setTelefone(textTelefone.getText());
					objeto.setEmail(textEmail.getText());
					objeto.setEndereco(textEndereco.getText());
					controle.alterar(objeto);
					JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
				}else {
					JOptionPane.showMessageDialog(null, "Não há objeto a ser modificado.");
				}

			}
		});
		btnAlterar.setBounds(384, 67, 129, 35);
		painelCampos.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (objeto!=null) {
					controle.excluir(objeto);
					objeto = null;
					textNome.setText("");
					textCpf.setText("");
					textTelefone.setText("");
					textEmail.setText("");
					textEndereco.setText("");
					JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
				}else {
					JOptionPane.showMessageDialog(null, "Não há objeto a ser excluído.");
				}
			}
		});
		btnExcluir.setBounds(384, 118, 129, 35);
		painelCampos.add(btnExcluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer valor = Integer.parseInt(textIdUsuario.getText());
				objeto = controle.buscarPorId(valor);
				if (objeto!=null) {					
					textIdUsuario.setText(String.valueOf(objeto.getIdUsuario()));
					textNome.setText(objeto.getNome());
					textCpf.setText(objeto.getCpf());
					textTelefone.setText(objeto.getTelefone());
					textEmail.setText(objeto.getEmail());
					textEndereco.setText(objeto.getEndereco());
					}else {
						JOptionPane.showMessageDialog(null, "Não há Veterinário com esse código");
						textIdUsuario.setText("");
					}

			}
		});
		btnConsultar.setBounds(384, 169, 129, 35);
		painelCampos.add(btnConsultar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnFechar.setBounds(384, 220, 129, 35);
		painelCampos.add(btnFechar);
		
		textIdUsuario = new JTextField();
		textIdUsuario.setColumns(10);
		textIdUsuario.setBounds(80, 16, 270, 20);
		painelCampos.add(textIdUsuario);
		
		JLabel lblIdUsurio = new JLabel("Id Usuário:");
		lblIdUsurio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdUsurio.setBounds(10, 18, 78, 17);
		painelCampos.add(lblIdUsurio);
		
		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEndereco.setBounds(10, 237, 123, 17);
		painelCampos.add(lblEndereco);
		
		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		textEndereco.setBounds(70, 235, 280, 20);
		painelCampos.add(textEndereco);

	}
}
