package SolidPrinciples;

public class DebitCard implements BankCard
{
    public void doTransaction(long amount){
        System.out.println("payment using Credit card of "+ amount + " rupees");
    }
}
