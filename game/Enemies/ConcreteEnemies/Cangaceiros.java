package Enemies.ConcreteEnemies;

import Enemies.Enemy;

public class Cangaceiros extends Enemy {
    public Cangaceiros(String name, String catchphrase) {
        this.name = name;
        this.catchphrase = catchphrase;
    }

    public void action() {
        System.out.printf("O Cangaceiro %s está em posição de ataque e diz: %s\n\n", this.name, this.catchphrase);
    }
}
