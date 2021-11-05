public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Car car2 = new Car("red", "BMW", 5);
        Car car1 = new Car("blue", "Audi", 3);

        factory.buildCar(car2);
        factory.buildCar(car1);
    }
}
