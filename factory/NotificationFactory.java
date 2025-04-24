package factory;

public class NotificationFactory {

   public Notifiation createNotification(String typeString) {
       if (typeString.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (typeString.equalsIgnoreCase("MESSAGE")) {
            return new MessageNotification();
        } else {
            throw new IllegalArgumentException("Invalid notification type");
        }
    }

    
}
