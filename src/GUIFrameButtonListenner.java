import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 *
 * @author Rui Q.
 */
public final class GUIFrameButtonListenner extends JFrame
        implements ActionListener {

    /**
     * Default constructor--private to prevent instantiation.
     */
    public final int WIDTH = 400;
    public final int HEIGHT = 654;
    private final JButton resetButton;
    private final JButton createButton;
    private final JButton deleteButton;
    private final JButton refreshButton;

    public GUIFrameButtonListenner() {
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
        this.resetButton.addActionListener(this);
        this.add(panel);
        this.setAlwaysOnTop(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        System.out.println("reset Button is Clicked!");
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        new GUIFrameButtonListenner();
    }

}
