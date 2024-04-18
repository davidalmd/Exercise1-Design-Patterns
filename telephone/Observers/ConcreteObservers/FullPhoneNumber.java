package Observers.ConcreteObservers;

import Observers.ObserverNumber;
import Subjects.ConcreteSubjects.PhoneModel;
import UI.Screen;

public class FullPhoneNumber implements ObserverNumber {
    private final PhoneModel model;
    private Screen screen;
    
    public FullPhoneNumber(PhoneModel model, Screen screen) {
        this.model = model;
        this.screen = screen;
    }

    @Override
    public void onEvent(int number) {
        if (model.getNumber().size() == 12) {
            StringBuilder completeNumber = new StringBuilder();
            for (int digit : model.getNumber()) {
                completeNumber.append(digit);
            }
            screen.display(completeNumber.toString());
        }
    }
}
