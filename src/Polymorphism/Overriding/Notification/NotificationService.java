package Polymorphism.Overriding.Notification;

public class NotificationService {
    public void sendNotification(Notification notification){
        notification.notifyUser();
    }

    public void sendNotification(EmailNotification notification){
        notification.notifyUser();
    }

    public void sendNotification(SMSNotification notification){
        notification.notifyUser();
    }

    public void sendAll(Notification[] notifications ,
                        SMSNotification[] smsNotifications,
                        EmailNotification[] emailNotifications){

        for(Notification notification : notifications){
            notification.notifyUser();
        }

        for(SMSNotification notification : smsNotifications){
            notification.notifyUser();
        }

        for(EmailNotification notification : emailNotifications){
            notification.notifyUser();
        }

    }
}
