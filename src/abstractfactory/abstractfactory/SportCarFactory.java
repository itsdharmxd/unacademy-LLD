package abstractfactory.abstractfactory;

public class SportCarFactory implements  CarAbstactFactory{
    private  String steeringWheel,brakes,mirrors;

    public  SportCarFactory(String steeringWheel,String brakes,String  mirrors){
        this.steeringWheel=steeringWheel;
        this.brakes=brakes;
        this.mirrors=mirrors;
        System.out.println("Creating a Sports Car");

    }


    @Override
    public Car createCar() {
        System.out.println("Inside Sports car factory");
        return new SportsCar(steeringWheel,brakes,mirrors);
    }
}
