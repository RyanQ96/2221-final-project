import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Enemy implements FlyingObj {
    private BufferedImage image;
    private int imageWidth;
    private int imageHeight;
    private int x;
    private int y;
    private int speed = 1;

    public Enemy() {
        try {
            this.image = ImageIO.read(new File("enemy.png"));
            this.imageWidth = this.image.getWidth();
            this.imageHeight = this.image.getHeight();
            Random rand = new Random();
            this.x = rand.nextInt(400 - this.imageWidth);
            this.y = -this.imageHeight;
        } catch (IOException e) {

        }
    }

    @Override
    public void step() {
        this.y += this.speed;
    }

    @Override
    public BufferedImage getImage() {
        // TODO Auto-generated method stub
        return this.image;
    }

    @Override
    public int getX() {
        // TODO Auto-generated method stub
        return this.x;
    }

    @Override
    public int getY() {
        // TODO Auto-generated method stub
        return this.y;
    }
}
