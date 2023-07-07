package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaDevolverCopia extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDevolverCopia frame = new TelaDevolverCopia();
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
	public TelaDevolverCopia() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 616, 367);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("DEVOLUÇÕES");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 11, 580, 28);
		getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Pesquisar", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 50, 580, 53);
		getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("CÓDIGO DO EXEMPLAR");
		lblNewLabel.setBounds(10, 20, 119, 22);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(134, 20, 329, 22);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.setBounds(473, 20, 89, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(null, "Dados exemplar", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 76, 580, 261);
		getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CÓDIGO DO EXEMPLAR");
		lblNewLabel_2.setBounds(10, 37, 119, 22);
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(134, 37, 428, 22);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("T�?TULO DO EXEMPLAR");
		lblNewLabel_2_1.setBounds(10, 70, 119, 22);
		panel_1.add(lblNewLabel_2_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(134, 70, 428, 22);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("NOME DO ALUNO");
		lblNewLabel_2_1_1.setBounds(10, 103, 119, 22);
		panel_1.add(lblNewLabel_2_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(134, 103, 428, 22);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("SITUAÇÃO");
		lblNewLabel_2_1_1_1.setBounds(10, 132, 119, 22);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(134, 132, 428, 22);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("TEMPO EM ATRASO");
		lblNewLabel_2_1_1_1_1.setBounds(10, 165, 119, 22);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(134, 165, 428, 22);
		panel_1.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.setBounds(166, 215, 133, 23);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("DEVOLVER");
		btnNewButton_1_1.setBounds(350, 215, 133, 23);
		panel_1.add(btnNewButton_1_1);

	}
}
