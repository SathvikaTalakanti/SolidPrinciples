package SolidPrinciples;
import java.util.Scanner;

public class solidprinciples {
    static void Sending(MobileNotificationService mobileNotificationService){
        mobileNotificationService.sendOTP();
    }
    public static void main(String[] args) {
        System.out.println("Enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        long amount=sc.nextInt();
        BankCard bankCard = new CreditCard();
        Shopping shopping = new Shopping(bankCard);

        Sending(new MobileNotificationService());
        Sending(new MessengerNotificationService());
        EmailNotificationService e1= new EmailNotificationService();
        e1.sendMessage(amount);

        shopping.doPurchaseSomething(amount);

    }

}