package abstractfactory.abstractfactory;

public class CarFactory {
    public  static  Car getCar(CarAbstactFactory carAbstactFactory){
        return  carAbstactFactory.createCar();

    }
}
