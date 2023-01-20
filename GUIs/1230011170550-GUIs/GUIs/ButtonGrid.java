package GUIs;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonGrid {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setVisible(true);
		window.setSize(300, 300);
		Container contentPane = window.getContentPane();
		String inputValue = JOptionPane.showInputDialog("Input a value for row");
		String inputValue2 = JOptionPane.showInputDialog("Input a value for column");
		int row = Integer.valueOf(inputValue);
		int column = Integer.valueOf(inputValue2);
		contentPane.setLayout(new GridLayout(row, column));
		for (int i = 0; i < row * column; i++) {
			contentPane.add(new JButton());
		}
	}

}
