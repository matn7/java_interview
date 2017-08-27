package designPatterns.creational.factory_3;

/**
 * Created by Mati on 09.08.2017.
 */
public class Messerschmitt implements Plane {

    // Concrete Plane implementation
    @Override
    public void model() {
        System.out.println("Messerschmitt BF-109 produced");
    }

}