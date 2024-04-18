package Observers.ConcreteObservers;

import Observers.ObserverNumber;
import UI.Screen;

public class DiscNumber implements ObserverNumber {
    private Screen screen;

    public DiscNumber(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void onEvent(int number) {
        screen.display(number);
    }
}
