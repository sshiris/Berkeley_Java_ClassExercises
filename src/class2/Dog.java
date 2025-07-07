package class2;

public class Dog {
    public int weightPounds;

    public Dog(int weightPounds) {
        this.weightPounds = weightPounds;
    }

    public void makeNoise() {
        if (weightPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightPounds < 30) {
            System.out.println("bark, bark.");
        } else {
            System.out.println("woof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightPounds > d2.weightPounds) {
            return d1;
        }
        return d2;
    }
}
