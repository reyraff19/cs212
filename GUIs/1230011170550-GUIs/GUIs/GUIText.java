package GUIs;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class GUIText implements ActionListener {

	JButton theButton = new JButton();
	JLabel theLabel = new JLabel();
	JTextArea theTextArea = new JTextArea();

	public static void main(String[] args) {
		new GUIText();
	}

	public GUIText() {
		JFrame window = new JFrame();
		window.setVisible(true);
		window.setSize(300, 300);
		Container contentPane = window.getContentPane();
		contentPane.setLayout(new GridLayout(2, 2));
		contentPane.add(theTextArea);
		contentPane.add(theButton);
		contentPane.add(theLabel);
		theButton.setText("Save");
		theButton.addActionListener(this); // this refers to the class GUIText
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Saving Text Now");
		theLabel.setText(theTextArea.getText());
		theTextArea.setText("");
	}

}
