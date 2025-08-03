public class FlyingFish extends Fish implements Flyable {
    @Override
    public void swim() {
        System.out.println("FlyingFish is swimming!");
    }

    @Override
    public void fly() {
        System.out.println("FlyingFish is gliding through the air (I know it's impossible but who cares?)");
    }

    @Override
    public String toString() {
        return "FlyingFish";
    }
}
