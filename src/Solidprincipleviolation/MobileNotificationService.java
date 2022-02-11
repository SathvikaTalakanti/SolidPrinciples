package Solidprincipleviolation;

public class MobileNotificationService implements OtpNotification
{

    public void sendOTP() {
        System.out.println("sent otp to Mobile");
    }
    public void sendMessage(long money) {
        System.out.println("sent msg to mobile and "+money+" rupees is withdrawn");
    }

}
