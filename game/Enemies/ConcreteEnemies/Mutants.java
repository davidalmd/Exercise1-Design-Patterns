package Enemies.ConcreteEnemies;

import Enemies.Enemy;

public class Mutants extends Enemy {
    public Mutants(String name, String catchphrase) {
        this.name = name;
        this.catchphrase = catchphrase;
    }

    public void action() {
        System.out.printf("O Mutante %s está em posição de ataque e diz: %s\n\n", this.name, this.catchphrase);
    }
}
