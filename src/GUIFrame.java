import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 *
 * @author Rui Q.
 */
public final class GUIFrame extends JFrame {

    /**
     * Default constructor--private to prevent instantiation.
     */
    public final int WIDTH = 400;
    public final int HEIGHT = 654;

    public void GUI() {
        // no code needed here
        this.setSize(this.WIDTH, this.HEIGHT);
        JPanel panel = new JPanel();
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
        new GUIFrame();
    }

}
