import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import components.set.Set;

/**
 *
 *
 * @author Rui Q.
 */
public class GameView extends JPanel implements MouseMotionListener {

    /**
     * Default constructor--private to prevent instantiation.
     */
    public static int WIDTH = 400;
    public static int HEIGHT = 640;
    public BufferedImage background;
    public BufferedImage hero;
    public GameController controller;
    public Timer timer;
    public Graphics g;

    public Set<FlyingObj> FlyingObjs;

    public GameView() {
        // no code needed here
        try {
            this.background = ImageIO.read(new File("background.png"));
            this.hero = ImageIO.read(new File("hero0.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        JFrame frame = new JFrame("GUI");
        frame.add(this);
        frame.setSize(this.WIDTH, this.HEIGHT);
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // call

        this.action();
    }

    public void action() {
        this.addMouseMotionListener(this);
        this.timer = new Timer();

        this.timer.schedule(new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                GameView.this.controller.step();
                GameView.this.repaint();
            }

        }, 10, 10);
    }

    public void updateFlyingObjs(Set<FlyingObj> objSet) {

        this.FlyingObjs = objSet;
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(this.background, 0, 0, null);
        this.paintFlyObj(g);
    }

    public void paintFlyObj(Graphics g) {
        if (this.FlyingObjs.size() > 0) {
            for (FlyingObj obj : this.FlyingObjs) {
                g.drawImage(obj.getImage(), obj.getX(), obj.getY(), null);
            }
        }
    }

    public void registerController(GameController controller) {
        this.controller = controller;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        int x = e.getX();
        int y = e.getY();
        this.controller.mouseMovedTo(x, y);
        System.out.println("move to: " + x + ", " + y);
    }
}
