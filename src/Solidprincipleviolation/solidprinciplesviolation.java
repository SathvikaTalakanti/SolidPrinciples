package Solidprincipleviolation;

import java.util.Scanner;

public class solidprinciplesviolation
{

    static void Sending(MobileNotificationService mobileNotificationService){
        mobileNotificationService.sendOTP();
    }
    public static void main(String[] args) {
        System.out.println("Enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        long amount=sc.nextInt();
        Shopping shopping = new Shopping();
        Sending(new MobileNotificationService());
        Sending(new MessengerNotificationService());

        shopping.doPurchaseSomething(amount);

    }

}
