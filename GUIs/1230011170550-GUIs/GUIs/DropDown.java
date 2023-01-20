package GUIs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DropDown implements ActionListener {

    JComboBox<String> box = new JComboBox<String>();

    public static void main(String[] args) {
        new DropDown();

    }

    public DropDown() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(300, 300);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
        box.addItem("Popup Message");
        box.addItem("Exit");
        box.addActionListener(this);
        contentPane.add(box);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String option = (String) box.getSelectedItem();
        if (option.equals("Popup Message")) {
            JOptionPane.showMessageDialog(null, "This is a mesage");
        }
        if (option.equals("Exit")) {
            System.exit(0);
        }
    }

}