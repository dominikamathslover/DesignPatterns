package Builder;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.buildBUgatti(builder);
        Car car = builder.build();

        Car newCar = new CarBuilder()
                .brand("Bunia")
                .color("czarna perełeczka")
                .model("E39")
                .build();

        System.out.println(car);

    }
}
