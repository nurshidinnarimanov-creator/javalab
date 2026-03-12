package MyGraph;

import javax.swing.*;

public class GraphFrame extends JFrame {

    public GraphFrame(String title, FunctionType type) {
        super(title);
        setSize(900, 650);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        add(new GraphPanel(type));
        setVisible(true);
    }
}
