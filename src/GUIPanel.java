import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 *
 * @author Rui Q.
 */
public class GUIPanel extends JPanel {

    /**
     * Default constructor--private to prevent instantiation.
     */
    public static int WIDTH = 400;
    public static int HEIGHT = 640;
    public BufferedImage background;

    public GUIPanel() {
        // no code needed here
        try {
            this.background = ImageIO.read(new File("background.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(this.background, 0, 0, null);
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        GUIPanel panel = new GUIPanel();
        frame.add(panel);
        frame.setSize(panel.WIDTH, panel.HEIGHT);
        frame.setAlwaysOnTop(true);
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // call
    }

}
