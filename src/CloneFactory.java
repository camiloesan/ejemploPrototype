package src;

public class CloneFactory {
    public Animal getClone(Dog dogSample) {
        return dogSample.makeCopy();
    }
}
