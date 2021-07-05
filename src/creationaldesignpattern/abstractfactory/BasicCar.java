package creationaldesignpattern.abstractfactory;

public class BasicCar implements Car {
    private  String steeringWheel,brakes,mirrors;
    public  BasicCar(String steeringWheel,String brakes,String  mirrors){
        this.steeringWheel=steeringWheel;
        this.brakes=brakes;
        this.mirrors=mirrors;
        System.out.println("Creating a Sports Car");

    }
    @Override
    public String getStreeringWheel() {
        return null;
    }

    @Override
    public String getBrakes() {
        return null;
    }

    @Override
    public String getMirrors() {
        return null;
    }
}
