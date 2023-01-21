import java.awt.*; // Reyaad Raffik CS212
import java.awt.event.*;
import javax.swing.*;

public class LightRow implements ActionListener {

    JFrame window = new JFrame();
    String inputValue = JOptionPane.showInputDialog("How many buttons?"); // Asks the user how many buttons they wish to
                                                                          // make.
    int row = Integer.valueOf(inputValue); // Takes in the user input of how many buttons they want to create.
    JButton[] buttons = new JButton[row];
    Container contentPane = window.getContentPane();
    Color[] Colors = { Color.GREEN, Color.MAGENTA };

    public Color invert(Color background) { // Takes in the color of the button and inverts it to be the othre color.
        if (background.equals(Color.GREEN)) {
            return Color.MAGENTA;
        }
        return Color.GREEN;
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
            contentPane.add(button); // Adds each button to the content pane.
            buttons[i] = button; // Adds each button that was made to the list of the JButtons.
            buttons[i].setBackground(Colors[((int) (Math.random() * 2))]); // Sets each button to be a random color,
                                                                           // between the color green and magenta.
            buttons[i].addActionListener(this); // When the button is pressed, it will then follow the actionPerformed.
            buttons[i].setOpaque(true);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource(); // Will retrieve the source of the button that was pressed.
        for (int i = 0; i < row; i++) {
            if (source == buttons[i]) {
                if (i == 0) {
                    // If the first button is pressed, it will invert the color of the button
                    // pressed and the button adjacent to it.
                    buttons[i].setBackground(invert(buttons[0].getBackground()));
                    buttons[i + 1].setBackground(invert(buttons[1].getBackground()));
                } else if (i == row - 1) {
                    // If the last button is pressed, it will invert the color of the last button
                    // and the button adjacent to it.
                    buttons[row - 1].setBackground(invert(buttons[row - 1].getBackground()));
                    buttons[row - 2].setBackground(invert(buttons[row - 2].getBackground()));
                } else {
                    // If it is any other button pressed, it will change the color of that button
                    // and the buttons adjacent to it.
                    buttons[i].setBackground(invert(buttons[i].getBackground()));
                    buttons[i - 1].setBackground(invert(buttons[i - 1].getBackground()));
                    buttons[i + 1].setBackground(invert(buttons[i + 1].getBackground()));
                }
            }
        }
    }

}