package behaviourdesignpatter.strategy;

public class GooglePay implements WalletStategy{


    @Override
    public void pay(int amount) {
        System.out.println("Paying by google pay ="+amount);
    }
}
