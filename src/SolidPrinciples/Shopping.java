package SolidPrinciples;

public class Shopping
{
    private final BankCard bankCard;

    public Shopping(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }
}
