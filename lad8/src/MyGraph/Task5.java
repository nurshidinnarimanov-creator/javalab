package MyGraph;

import java.awt.*;
import javax.swing.*;

public class Task5 extends JFrame {
    public Task5(String title) {
        super(title);
        setSize(500, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new GraphPanel());
        setVisible(true);
    }

    class GraphPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            int w = getWidth(), h = getHeight();
            int x0 = w / 2, y0 = h / 2;

            g.setColor(Color.BLACK);
            g.drawLine(0, y0, w, y0);
            g.drawLine(x0, 0, x0, h);

            g.setColor(Color.LIGHT_GRAY);
            for (int i = 0; i < w; i += 20) g.drawLine(i, 0, i, h);
            for (int i = 0; i < h; i += 20) g.drawLine(0, i, w, i);

            g.setColor(Color.GREEN);
            int scale = 5;
            for (int i = -10; i <= 10; i++) {
                int x = x0 + i * scale;
                int y = y0 - (int)(Math.pow(i, 5) * 0.05);
                g.fillOval(x, y, 3, 3);
            }
        }
    }

    public static void main(String[] args) {
        new Task5("Task5: y = x⁵");
    }
}