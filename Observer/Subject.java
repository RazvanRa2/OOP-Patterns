import java.util.ArrayList;

public class Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int newState) {
        this.state = newState;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update();
        }
    }
}
