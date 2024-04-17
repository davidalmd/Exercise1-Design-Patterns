package Localities.ConcreteLocalities;

import Enemies.Enemy;
import Enemies.ConcreteEnemies.Mutants;
import Localities.LocalityFactory;

public class Amazonia implements LocalityFactory {
    public Enemy createEnemy() {
        return new Mutants("Boto-cor-de-rosa", "Escondam suas esposas!");
    }

    public void announceLocal() {
        System.out.println("Você está na Amazônia!");
    }
}
