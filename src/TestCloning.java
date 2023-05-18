package src;

public class TestCloning extends CloneFactory {
    public static void main(String[] args) {
        CloneFactory dogFactory = new CloneFactory();

        Dog myDog = new Dog("Blanco", "Grande");
        System.out.println("Perro original: " + myDog.color + ", " + myDog.size + "; ID: " + System.identityHashCode(myDog));

        for (int i = 0; i < 5; i++) {
            Dog clonedDog = (Dog) dogFactory.getClone(myDog);
            System.out.println("ID: " + System.identityHashCode(clonedDog));
            System.out.println(clonedDog.color);
            System.out.println(clonedDog.size);
        }
    }
}
