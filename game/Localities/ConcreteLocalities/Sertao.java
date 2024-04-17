package Localities.ConcreteLocalities;

import Enemies.Enemy;
import Enemies.ConcreteEnemies.Cangaceiros;
import Localities.LocalityFactory;

public class Sertao implements LocalityFactory {
    public Enemy createEnemy() {
        return new Cangaceiros("Lampião", "Num sei pruquê eu nunca vi home corado na minha frente.");
    }

    public void announceLocal() {
        System.out.println("Você está no Sertão Brasileiro!");
    }
}
