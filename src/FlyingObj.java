import java.awt.image.BufferedImage;

public interface FlyingObj {
    public BufferedImage getImage();

    public int getX();

    public int getY();

    public void step();
}
