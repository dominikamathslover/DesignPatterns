package Decorator;

public class DatabaseService {
    public String getMailFromUserName(String username){
        return username + "@Mail";
    }
    public String getPhoneNbrFromUserName(String username){
        return username + "@Phone";
    }
    public String getFbNameFromUserName(String username){
        return username + "@Facebook";
    }

}
