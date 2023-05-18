package src;

public class Dog implements Animal {
    String color;
    String size;

    public Dog(String color, String size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public Dog makeCopy() {
        System.out.println("\nPerro clonándose...");

        Dog dogObject;
        try {
            dogObject = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return dogObject;
    }
}
