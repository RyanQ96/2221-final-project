import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
public class GUIPanelMouseAction extends JPanel {

    /**
     * Default constructor--private to prevent instantiation.
     */
    public static int WIDTH = 400;
    public static int HEIGHT = 640;
    public BufferedImage background;

    public GUIPanelMouseAction() {
        // no code needed here
        try {
            this.background = ImageIO.read(new File("background.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        MouseAdapter l = new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("move to: " + x + ", " + y);
            }
        };
        this.addMouseMotionListener(l);
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
        GUIPanelMouseAction panel = new GUIPanelMouseAction();
        frame.add(panel);
        frame.setSize(panel.WIDTH, panel.HEIGHT);
        frame.setAlwaysOnTop(true);
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // call
    }

}
