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
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import java.awt.Choice;
import java.awt.Checkbox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JScrollBar;
import javax.swing.JMenuItem;

public class TelaGeraBoleto extends JInternalFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGeraBoleto frame = new TelaGeraBoleto();
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
	public TelaGeraBoleto() {
		setBounds(100, 100, 608, 390);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("GERAR BOLETOS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 11, 572, 28);
		getContentPane().add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Sele\u00E7\u00E3o dos Boletos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(10, 50, 572, 308);
		getContentPane().add(panel_1);
		
		JButton btnNewButton_1_2 = new JButton("CANCELAR");
		btnNewButton_1_2.setBounds(170, 274, 133, 23);
		panel_1.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_1 = new JButton("SOLICITAR");
		btnNewButton_1_1_1.setBounds(354, 274, 133, 23);
		panel_1.add(btnNewButton_1_1_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", null, null, Boolean.FALSE},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"NOME DO USU\u00C1RIO", "DIAS DE ATRASO", "VALOR DA MULTA", "SELECIONAR?"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Double.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(134);
		table.getColumnModel().getColumn(1).setPreferredWidth(113);
		table.getColumnModel().getColumn(2).setPreferredWidth(116);
		table.getColumnModel().getColumn(3).setPreferredWidth(127);
		table.setBounds(10, 58, 552, 182);
		panel_1.add(table);

	}
}
