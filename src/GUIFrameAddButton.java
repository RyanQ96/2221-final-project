import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 *
 * @author Rui Q.
 */
public final class GUIFrameAddButton extends JFrame {

    /**
     * Default constructor--private to prevent instantiation.
     */
    public final int WIDTH = 400;
    public final int HEIGHT = 654;
    private final JButton resetButton;
    private final JButton createButton;
    private final JButton deleteButton;
    private final JButton refreshButton;

    public GUIFrameAddButton() {
        // no code needed here
        this.setSize(this.WIDTH, this.HEIGHT);
        this.resetButton = new JButton("Reset");
        this.createButton = new JButton("Create");
        this.deleteButton = new JButton("Delete");
        this.refreshButton = new JButton("Refresh");
        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(this.resetButton);
        panel.add(this.createButton);
        panel.add(this.deleteButton);
        panel.add(this.refreshButton);
        this.add(panel);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        new GUIFrameAddButton();
    }

}
