package Decorator;

public class WhatsAppDecorator extends BasicNotifierDecorator{

    public WhatsAppDecorator(INotifier wrapped) {
        super(wrapped);
    }

    public  void send(String msg){
        super.send(msg);
        String phoneNbr = databaseService.getPhoneNbrFromUserName(getUsername());
        System.out.println("Sending "+msg+ "by WhatsApp on "+phoneNbr);
    }

}
