package Decorator;

public class Main {

    public static void main(String[] args) {
        INotifier notifier = new FacebookDecorator(
                new WhatsAppDecorator(
                        new Notifier("Geekific")
                )
        );
        notifier.send("Like and Subscribe!");
    }

}
