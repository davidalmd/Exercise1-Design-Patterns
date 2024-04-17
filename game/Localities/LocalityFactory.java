package Localities;

import Enemies.Enemy;

public interface LocalityFactory {
    public abstract Enemy createEnemy();
    public abstract void announceLocal();
}
