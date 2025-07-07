package class2;

public class DogLauncher {
    public static void main(String[] args) {
        Dog smallDog = new Dog(20);
        Dog hugeDog = new Dog(150);
        smallDog.makeNoise();
        hugeDog.makeNoise();
    }
}
