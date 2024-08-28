package Builder;

public class Director {

    public void buildBUgatti(CarBuilder builder){
        builder.brand("Bugatti");
        builder.color("Blue");

    }
    public void buildLambo(CarBuilder builder){
        builder.brand("Lamborghini");
        builder.model("Aventador");
        builder.color("Yellow");
    }

}
