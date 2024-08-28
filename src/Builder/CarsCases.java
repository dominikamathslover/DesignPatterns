package Builder;

import java.util.ArrayList;

public class CarsCases {

    ArrayList<Car> cars = new ArrayList<Car>();

    public CarsCases(){
    CarBuilder builder = new CarBuilder();
    Car car1 = new Car(2122,"Bugatti","Chiron","Blue");
    Car car2 = new Car(2123, "Bugatti", "Divo", "Blue ");
    Car car3 = new Car(2124, "Bugatti", "Centodieci", "White");
    Car car4 = new Car(2125, "Bugatti", "Aventador", "Black");
    Car car5 = new Car(2126, "Lamborghini", "Aventador", "Silver");


    cars.add(car1);
    cars.add(car2);
    cars.add(car3);
    cars.add(car4);
    cars.add(car5);
    }



}
