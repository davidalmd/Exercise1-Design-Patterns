package UI;

import Observers.ConcreteObservers.DiscNumber;
import Observers.ConcreteObservers.FullPhoneNumber;
import Subjects.ConcreteSubjects.PhoneModel;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 *  System.out.println("hello");
 */
public class Screen {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
        model.addObserver(new DiscNumber(this));
        model.addObserver(new FullPhoneNumber(model, this));
    }

    public void display(String completeNumber) {
        System.out.printf("Agora discando: %s...", completeNumber);
    }

    public void display(int digitNumber) {
        System.out.printf("Pressionando: %d\n", digitNumber);
        System.out.println(digitNumber);
    }

}
