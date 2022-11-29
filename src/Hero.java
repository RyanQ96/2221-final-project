import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Hero implements FlyingObj {

    private BufferedImage image;
    private int imageWidth;
    private int imageHeight;
    private int x;
    private int y;

    public Hero() {
        try {
            this.image = ImageIO.read(new File("hero0.png"));
            this.imageWidth = this.image.getWidth();
            this.imageHeight = this.image.getHeight();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.x = 150;
        this.y = 400;
    }

    public void updatePos(int x, int y) {
        this.x = x - this.imageWidth / 2;
        this.y = y - this.imageHeight / 2;
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

    @Override
    public void step() {
        // TODO Auto-generated method stub

    }

}
