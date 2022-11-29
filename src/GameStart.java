
public class GameStart {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GameView view = new GameView();
        GameModel model = new GameModel();
        GameController controller = new GameController(model, view);
    }
}
