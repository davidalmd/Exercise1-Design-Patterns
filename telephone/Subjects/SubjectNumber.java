package Subjects;

import Observers.ObserverNumber;

public interface SubjectNumber {
    public void addObserver(ObserverNumber observer);
    public void removeObserver(ObserverNumber observer);
    public void notifyObservers(int number);
}
