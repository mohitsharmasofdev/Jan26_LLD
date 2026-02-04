package Polymorphism.Overriding.Notification;

public class UpdatedNotificationService {
    public void sendNotification(Notification notification){
        notification.notifyUser();
    }

//    public void sendNotification(EmailNotification notification){
//        notification.notifyUser();
//    }
//
//    public void sendNotification(SMSNotification notification){
//        notification.notifyUser();
//    }

    public void sendAll(Notification[] notifications){

        for(Notification notification : notifications){
            notification.notifyUser();
        }

//        for(SMSNotification notification : smsNotifications){
//            notification.notifyUser();
//        }
//
//        for(EmailNotification notification : emailNotifications){
//            notification.notifyUser();
//        }

    }
}
