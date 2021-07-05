package behaviourdesignpatter.strategy;

public class AmazonCart {

    public AmazonCart(WalletStategy walletStategy, Product product) {
        this.walletStategy = walletStategy;
        this.product = product;
    }

    private  WalletStategy  walletStategy;
     private Product product;

     public  void pay(){
         this.walletStategy.pay(product.getValue());
     }



}
