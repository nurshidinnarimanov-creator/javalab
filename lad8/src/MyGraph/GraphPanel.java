package MyGraph;

import javax.swing.*;
import java.awt.*;

public class GraphPanel extends JPanel {

    private final FunctionType type;
    private final int centerX = 430;
    private final int centerY = 300;
    private final int step = 25;

    public GraphPanel(FunctionType type) {
        this.type = type;
        setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawGrid(g);
        drawAxes(g);
        drawFunction(g);
    }

    private void drawGrid(Graphics g) {
        g.setColor(new Color(220, 220, 220));

        for (int x = 0; x < getWidth(); x += step) {
            g.drawLine(x, 0, x, getHeight());
        }

        for (int y = 0; y < getHeight(); y += step) {
            g.drawLine(0, y, getWidth(), y);
        }
    }

    private void drawAxes(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(0, centerY, getWidth(), centerY);
        g.drawLine(centerX, 0, centerX, getHeight());

        for (int x = centerX; x < getWidth(); x += step) {
            g.drawLine(x, centerY - 4, x, centerY + 4);
        }
        for (int x = centerX; x > 0; x -= step) {
            g.drawLine(x, centerY - 4, x, centerY + 4);
        }
        for (int y = centerY; y < getHeight(); y += step) {
            g.drawLine(centerX - 4, y, centerX + 4, y);
        }
        for (int y = centerY; y > 0; y -= step) {
            g.drawLine(centerX - 4, y, centerX + 4, y);
        }
    }

    private void drawFunction(Graphics g) {
        g.setColor(Color.RED);

        switch (type) {
            case LINEAR_SET -> drawLinearSet(g);
            case THREE_X2 -> drawCurve(g, 0.25, x -> 3 * x * x);
            case MINUS_X2_PLUS_X3 -> drawCurve(g, 0.40, x -> -x * x + x * x * x);
            case X3_X2_X -> drawCurve(g, 0.40, x -> x * x * x + x * x + x);
            case X5 -> drawCurve(g, 0.02, x -> Math.pow(x, 5));
            case SIN_X -> drawCurve(g, 1.00, Math::sin);
            case COS_X_MINUS_1_PLUS_X -> drawCurve(g, 0.60, x -> Math.cos(x - 1) + x);
        }
    }

    private void drawLinearSet(Graphics g) {
        Color[] colors = {
                Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA, Color.ORANGE,
                Color.CYAN, Color.PINK, new Color(120, 40, 200),
                new Color(0, 120, 80), new Color(150, 70, 20)
        };

        int colorIndex = 0;
        for (double k = 0.1; k <= 1.0; k += 0.1) {
            g.setColor(colors[colorIndex++]);
            final double slope = k;
            drawCurve(g, 1.0, x -> slope * x);
        }
    }

    private void drawCurve(Graphics g, double scaleY, MathFunction function) {
        int prevX = 0;
        int prevY = 0;
        boolean firstPoint = true;

        for (double x = -15; x <= 15; x += 0.02) {
            double y = function.calculate(x);

            int screenX = centerX + (int) (x * step);
            int screenY = centerY - (int) (y * step * scaleY);

            if (!firstPoint) {
                g.drawLine(prevX, prevY, screenX, screenY);
            }

            prevX = screenX;
            prevY = screenY;
            firstPoint = false;
        }
    }

    private interface MathFunction {
        double calculate(double x);
    }
}
