package GUIs;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChooser implements ActionListener{

	JFrame window = new JFrame();
	Container contentPane = window.getContentPane();

	public static void main(String[] args) {
		new ColorChooser();
	}
	
	public ColorChooser() {
		window.setVisible(true);
		window.setSize(300, 300);
		contentPane.setLayout(new BorderLayout());
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1, 3));
		JButton red = new JButton();
		red.addActionListener(this);
		red.setActionCommand("Red");
		red.setText("Red");
		buttonPanel.add(red);
		JButton green = new JButton();
		green.addActionListener(this);
		green.setActionCommand("Green");
		green.setText("Green");
		buttonPanel.add(green);
		JButton blue = new JButton();
		blue.addActionListener(this);
		blue.setActionCommand("Blue");
		blue.setText("Blue");
		buttonPanel.add(blue);
		
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String color = e.getActionCommand();
		if(color.equals("Red")) {
			contentPane.setBackground(Color.RED);
		}
		if(color.equals("Green")) {
			contentPane.setBackground(Color.GREEN);
		}
		if(color.equals("Blue")) {
			contentPane.setBackground(Color.BLUE);
		}
	}

}
