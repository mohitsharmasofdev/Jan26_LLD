package Polymorphism.Overriding.Notification;

public class Client {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        UpdatedNotificationService updatedNotificationService = new UpdatedNotificationService();
        Notification[] notifications = {new Notification(),
        new EmailNotification(), new SMSNotification() , new EmailNotification()};
//        notificationService.sendAll();
        updatedNotificationService.sendAll(notifications);
    }
}
