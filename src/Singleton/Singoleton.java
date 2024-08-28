package Singleton;

public class Singoleton {

    private static volatile Singoleton instance;
    private String data;

    private Singoleton(String data) {
        this.data = data;
    }

    public static Singoleton getInstance(String data) {

        Singoleton result = instance;

        if (result == null) {
            synchronized (Singoleton.class) {
                result = instance;
                if (result == null) {
                    instance= result = new Singoleton(data);
                }
            }
        }
        return result;
    }


}
