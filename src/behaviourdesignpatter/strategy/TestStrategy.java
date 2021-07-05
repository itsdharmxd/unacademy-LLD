package behaviourdesignpatter.strategy;

public class TestStrategy {

    public static void main(String[] args) {
        Product product=new Product("Phone",1234);
        AmazonCart amazonCart =new AmazonCart(new GooglePay(),product);
     amazonCart.pay();

    }

}
