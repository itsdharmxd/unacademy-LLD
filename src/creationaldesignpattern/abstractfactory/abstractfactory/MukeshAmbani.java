package creationaldesignpattern.abstractfactory.abstractfactory;

public class MukeshAmbani {
    public static void main(String[] args) {
      //  Car basicCar= CarFactory.createCar("SW","B","M","BASIC");
           Car basicCar= CarFactory.getCar(new BasicCarFactory("SW","B","M"));
    }

}
