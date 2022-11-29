import components.set.Set;
import components.set.Set1L;

public class GameModel {
    private Hero hero;
    private Set<FlyingObj> enemies;

    public GameModel() {
        this.hero = new Hero();
        this.enemies = new Set1L<>();
        this.enemies.add(new Enemy());
    }

    public void generateNewEnemy() {
        this.enemies.add(new Enemy());
    }

    public Set<FlyingObj> getFlyingObj() {
        Set<FlyingObj> res = new Set1L<FlyingObj>();
        res.add(this.hero);
        System.out.println(this.enemies.size());
        for (FlyingObj obj : this.enemies) {
            res.add(obj);
        }
        return res;
    }

    public void updateHeroPos(int x, int y) {
        this.hero.updatePos(x, y);
    }

    public void enemiesMoveStep() {
        for (FlyingObj obj : this.enemies) {
            obj.step();
        }
    }

}
