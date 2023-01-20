package GUIs;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ColorButton implements ActionListener {

	JButton button = new JButton();

	public static void main(String[] args) {
		new ColorButton();
	}

	public ColorButton() {
		/*
		 * Need to change UI manager look and feel from the native system to
		 * javax.swing.plaf.synth.SynthLookAndFeel or
		 * javax.swing.plaf.metal.MetalLookAndFeel
		 * MacOS native look and feel does not allow changing color of buttons
		 * Disabling the try catches below will result in a behavior where only
		 * the background around the button changes color and not the button itself
		 */

		try {
			UIManager.setLookAndFeel("javax.swing.plaf.synth.SynthLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JFrame window = new JFrame();
		window.setVisible(true);
		window.setSize(100, 100);
		button.setOpaque(true);
		button.addActionListener(this);
		window.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Color newColor = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
		button.setBackground(newColor);
	}
}
