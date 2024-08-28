package Builder;

public class CarBuilder  {

    private int id;
    private String brand;
    private String model;
    private String color;

    public CarBuilder(){
    }

    public CarBuilder(int id){
        this.id=id;
    }
    public CarBuilder(String brand,String model,String color){
        this.brand=brand;
        this.model=model;
        this.color = color;
    }

    public CarBuilder brand(String brand){
        this.brand=brand;
        return new CarBuilder();
    }

    public CarBuilder model(String model){
        this.model=model;
        return new CarBuilder();
    }

    public CarBuilder color(String color){
        this.color=color;
        return new CarBuilder();
    }


    public CarBuilder(int id, String brand,String model,String color){
        this.id=id;
        this.brand=brand;
        this.model=model;
        this.color = color;
    }

    public Car build(){
        return new Car(id,brand,model,color);
    }


}
