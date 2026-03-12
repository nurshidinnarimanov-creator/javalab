package MyGraph;

import javax.swing.*;
import java.awt.*;

public class Graphic extends JFrame {

    public Graphic(String title) {
        super(title);

        setSize(320, 360);
        setLayout(new GridLayout(7, 1, 5, 5));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        addButton("y = kx (k = 0.1 ... 1.0)", FunctionType.LINEAR_SET);
        addButton("y = 3x^2", FunctionType.THREE_X2);
        addButton("y = -x^2 + x^3", FunctionType.MINUS_X2_PLUS_X3);
        addButton("y = x^3 + x^2 + x", FunctionType.X3_X2_X);
        addButton("y = x^5", FunctionType.X5);
        addButton("y = sin x", FunctionType.SIN_X);
        addButton("y = cos(x - 1) + x", FunctionType.COS_X_MINUS_1_PLUS_X);

        setVisible(true);
    }

    private void addButton(String text, FunctionType type) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 14));
        button.addActionListener(e -> new GraphFrame(text, type));
        add(button);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Graphic("Построитель графиков"));
    }
}
