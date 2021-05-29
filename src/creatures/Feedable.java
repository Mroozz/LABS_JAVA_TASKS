package creatures;

public interface Feedable {

    void feed();

    default void feed(double foodWeight) {

    }
}
