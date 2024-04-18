package Subjects.ConcreteSubjects;
import java.util.ArrayList;
import java.util.List;

import Observers.ObserverNumber;
import Subjects.SubjectNumber;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel implements SubjectNumber {
    private List<Integer> number = new ArrayList<>();
    private List<ObserverNumber> observers = new ArrayList<>();

    public void addDigit(int digitNumber) {
        number.add(digitNumber);
        notifyObservers(digitNumber);
    }

    public List<Integer> getNumber() {
        return number;
    }

    @Override
    public void addObserver(ObserverNumber observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverNumber observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(int number) {
        for (ObserverNumber observer : observers) {
            observer.onEvent(number);
        }
    }
}
