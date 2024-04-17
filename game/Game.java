import Localities.LocalityFactory;
import Localities.ConcreteLocalities.Amazonia;
import Localities.ConcreteLocalities.Rio;
import Localities.ConcreteLocalities.Sertao;
import Enemies.Enemy;

public class Game {
    public static void main(String[] args) {
        LocalityFactory amazonia = new Amazonia();
        amazonia.announceLocal();
        Enemy enemy = amazonia.createEnemy();
        enemy.action();

        LocalityFactory sertao = new Sertao();
        sertao.announceLocal();
        enemy = sertao.createEnemy();
        enemy.action();

        LocalityFactory rio = new Rio();
        rio.announceLocal();
        enemy = rio.createEnemy();
        enemy.action();
    }
}
