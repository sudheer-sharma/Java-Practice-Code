
public class Hierarchial_Interitance {

    public static void main(String[] args) {
        Mammals m1 = new Mammals();
        Fish f1 = new Fish();
        Bird b1 = new Bird();

        m1.name = "Mammals is mammal";
        f1.name = "fish is a fish";
        b1.name = "birds is fly";

        System.out.println(m1.name);
        System.out.println(f1.name);
        System.out.println(b1.name);

        b1.Flys();
        m1.breath();
    }
}

class Animals {

    String name;

    void eats() {
        System.out.println("Eat all Animals");
    }

    void breath() {
        System.out.println("Breath is animals");
    }
}

class Mammals extends Animals {

    void volk() {
        System.out.println("All animals is a wolk");
    }
}

class Fish extends Animals {

    void swim() {
        System.out.println("fish is a fly");
    }
}

class Bird extends Animals {

    void Flys() {
        System.out.println("Birds is Fly");
    }
}
