package Localities.ConcreteLocalities;

import Enemies.Enemy;
import Enemies.ConcreteEnemies.Criminosos;
import Localities.LocalityFactory;

public class Rio implements LocalityFactory {
    public Enemy createEnemy() {
        return new Criminosos("Marcinho VP", "CV até o fim!");
    }

    public void announceLocal() {
        System.out.println("Você está no Rio de Janeiro!");
    }
}
