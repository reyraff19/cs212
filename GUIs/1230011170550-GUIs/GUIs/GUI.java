package GUIs;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setVisible(true);
		window.setSize(500, 500);
		window.setTitle("New Window");
		Container contentPane = window.getContentPane();
		contentPane.setLayout(new BorderLayout());
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new FlowLayout());
		contentPane.add(new JLabel("North", JLabel.CENTER), BorderLayout.NORTH);
		contentPane.add(new JLabel("Center"), BorderLayout.CENTER);
		contentPane.add(new JLabel("West"), BorderLayout.WEST);
		contentPane.add(southPanel, BorderLayout.SOUTH);
		for (int i = 0; i < 3; i++) {
			southPanel.add(new JButton());
		}

		// window.pack();
	}

}
