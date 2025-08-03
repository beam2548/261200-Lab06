public class FlyingShark extends Shark implements Flyable {
    @Override
    public void fly() {
        System.out.println("FlyingShark is gliding through the air(I know it’s impossible but who cares!?)");
    }

    // Static polymorphism (method overloading)
    public void eat(Flyable flyable) {
        System.out.println("FlyingShark caught a flying creature");
    }

    // This method overrides eat(Fish) from Shark (dynamic polymorphism)
    @Override
    public void eat(Fish fish) {
        System.out.println("FlyingShark is eating " + fish.toString());
    }

    @Override
    public String toString() {
        return "FlyingShark";
    }
}
