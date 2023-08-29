package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class TelaDisciplina extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDisciplina frame = new TelaDisciplina();
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
	public TelaDisciplina() {
		setBounds(100, 100, 450, 300);

	}

}
