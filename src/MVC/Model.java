package MVC;
import java.util.Observable;

public class Model extends Observable {
    int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
        this.setChanged();
        this.notifyObservers();
    }
}
