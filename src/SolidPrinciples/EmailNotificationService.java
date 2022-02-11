package SolidPrinciples;

public class EmailNotificationService implements MessageNotification
{
    public void sendMessage(long money ) {
        System.out.println("Email Notification: "+money+" rupees is withdrawn");
    }
}
