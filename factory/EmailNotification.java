package factory;

public class EmailNotification implements Notifiation {
    
    @Override
    public void notifyUSer() {
        System.out.println("Please this is email notification");
    }
    
    
}
