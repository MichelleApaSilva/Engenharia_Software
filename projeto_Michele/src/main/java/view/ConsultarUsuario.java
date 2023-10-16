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
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import control.UsuarioControle;
import model.Usuario;

import javax.swing.JScrollPane;

public class ConsultarUsuario extends JInternalFrame {
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTable table;
	private UsuarioControle controle = new UsuarioControle();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarUsuario frame = new ConsultarUsuario();
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
	public ConsultarUsuario() {
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuMenu = new JMenu("Menu");
		menuBar.add(menuMenu);

		JMenuItem menuDadosCadastrais = new JMenuItem("Dados Cadastrais");
		menuDadosCadastrais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DadosCadastrais tela = new DadosCadastrais();
				getParent().add(tela);
				tela.setVisible(true);
				dispose();
			}
		});
		menuMenu.add(menuDadosCadastrais);

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

		JLabel lblNewLabel = new JLabel("Consultar Usu\u00E1rio");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);

		JPanel painelCampos = new JPanel();
		painelCampos.setLayout(null);
		painelCampos.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Consultar",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		getContentPane().add(painelCampos, BorderLayout.CENTER);

		JLabel lblNomeLivro = new JLabel("Nome:");
		lblNomeLivro.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNomeLivro.setBounds(10, 23, 89, 17);
		painelCampos.add(lblNomeLivro);

		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(55, 23, 228, 20);
		painelCampos.add(txtNome);

		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCPF.setBounds(10, 60, 60, 14);
		painelCampos.add(lblCPF);

		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(55, 57, 228, 20);
		painelCampos.add(txtCPF);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Usuario> objetos = new ArrayList<>();
				if (txtNome.getText().equals("") == false) {
					objetos = controle.buscarPorNome(txtNome.getText());
				}else if (txtCPF.equals("") == false) {
					objetos = controle.buscarPorCpf(txtCPF.getText());
				}
				Object dados[][] = new Object[objetos.size()][4];
				int cont = 0;
				for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
					Usuario obj = (Usuario) iterator.next();
					dados[cont][0] = obj.getIdUsuario();
					dados[cont][1] = obj.getNome();
					dados[cont][2] = obj.getCpf();
					dados[cont][3] = obj.getTelefone();
					cont++;
				}

				table.setModel(new DefaultTableModel(dados, new String[] { "Id", "Nome", "CPF", "Telefone" }));
			}
		});
		btnBuscar.setBounds(293, 20, 89, 23);
		painelCampos.add(btnBuscar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(293, 56, 89, 23);
		painelCampos.add(btnCancelar);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 96, 373, 103);
		painelCampos.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, },
				new String[] { "Id", "Nome", "CPF", "Telefone" }) {
			Class[] columnTypes = new Class[] { Object.class, Object.class, Object.class, String.class };

			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

	}
}
