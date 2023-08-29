package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class TelaMatricula extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMatricula frame = new TelaMatricula();
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
	public TelaMatricula() {
		setBounds(100, 100, 450, 300);

	}

}
