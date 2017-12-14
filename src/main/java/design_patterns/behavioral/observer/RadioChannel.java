package design_patterns.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Mati on 09.07.2017.
 */
public class RadioChannel implements Observer {
    @Override
    public void update(Observable agency, Object newsItem) {
        // Only add news when news agency implements Publisher interface. We can think of it as only valid news agency
        // implements Publisher. If for some reason we acquire news from unreliable source (does not implements Publisher) just ignore it.
        if (agency instanceof Publisher) {
            System.out.println((String) newsItem + " Radio");
        }
    }
}