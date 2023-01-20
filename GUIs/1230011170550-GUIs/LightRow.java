import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

public class LightRow implements ActionListener {

    JFrame window = new JFrame();
    String inputValue = JOptionPane.showInputDialog("How many buttons?");
    int row = Integer.valueOf(inputValue);
    JButton[] buttons = new JButton[row];
    Container contentPane = window.getContentPane();
    Color[] Colors = { Color.RED, Color.BLUE };

    public Color invert(Color background) {
        if (background.equals(Color.BLUE)) {
            return Color.RED;
        }
        return Color.BLUE;
    }

    public static void main(String[] args) {
        new LightRow();
    }

    public LightRow() {

        window.setVisible(true);
        window.setSize(300, 300);
        contentPane.setLayout(new GridLayout());
        for (int i = 0; i < row; i++) {
            JButton button = new JButton();
            contentPane.add(button);
            buttons[i] = button;
            buttons[i].setBackground(Colors[((int) (Math.random() * 2))]);
            buttons[i].addActionListener(this);

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        for (int i = 0; i < row; i++) {
            if (source == buttons[0]) {
                buttons[0].setBackground(invert(buttons[0].getBackground()));
                buttons[1].setBackground(invert(buttons[1].getBackground()));
            }

            else if (source == buttons[row - 1]) {
                buttons[row - 1].setBackground(invert(buttons[row - 1].getBackground()));
                buttons[row - 2].setBackground(invert(buttons[row - 2].getBackground()));

            } else if (buttons[i] == source) {
                buttons[i].setBackground(invert(buttons[i].getBackground()));
                buttons[i - 1].setBackground(invert(buttons[i - 1].getBackground()));
                buttons[i + 1].setBackground(invert(buttons[i + 1].getBackground()));

            }

        }
    }

}