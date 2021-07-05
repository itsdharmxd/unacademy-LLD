package behaviourdesignpatter.strategy;

public class PhonePay implements WalletStategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paying by Phone pay ="+amount);
    }
}
