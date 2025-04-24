package factory;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notifiation notification = notificationFactory.createNotification("email");
        notification.notifyUSer();
        Notifiation notification2= notificationFactory.createNotification("message");
        notification2.notifyUSer();  
    }
  

}
