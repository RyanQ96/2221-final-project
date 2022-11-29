import java.util.Random;

public class GameController {
    GameModel model;
    GameView view;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
        this.view.registerController(this);
        this.view.updateFlyingObjs(this.model.getFlyingObj());
    }

    public void mouseMovedTo(int x, int y) {
        this.model.updateHeroPos(x, y);
    }

    public void step() {
        this.model.enemiesMoveStep();
        Random rand = new Random();
        if (rand.nextInt(60) == 0) {
            this.model.generateNewEnemy();
        }
        this.view.updateFlyingObjs(this.model.getFlyingObj());
    }

}
