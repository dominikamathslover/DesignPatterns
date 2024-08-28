package Decorator;

public class FacebookDecorator extends BasicNotifierDecorator{

    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public  void send(String msg){
        super.send(msg);
        String fbName = databaseService.getFbNameFromUserName(getUsername());
        System.out.println("Sending "+msg+ "on Facebook to "+fbName);
    }

}
