package Enemies.ConcreteEnemies;

import Enemies.Enemy;

public class Criminosos extends Enemy {
    public Criminosos(String name, String catchphrase) {
        this.name = name;
        this.catchphrase = catchphrase;
    }

    public void action() {
        System.out.printf("O Criminoso %s está em posição de ataque e diz: %s\n\n", this.name, this.catchphrase);
    }
}
