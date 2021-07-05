package abstractfactory.abstractfactory;

public class BasicCarFactory implements  CarAbstactFactory {

    private  String steeringWheel,brakes,mirrors;

    public  BasicCarFactory(String steeringWheel,String brakes,String  mirrors){
        this.steeringWheel=steeringWheel;
        this.brakes=brakes;
        this.mirrors=mirrors;
        System.out.println("Creating a Sports Car");

    }


    @Override
    public Car createCar() {
        System.out.println("Inside Basic car factory");
        return new BasicCar(steeringWheel,brakes,mirrors);
    }
}
