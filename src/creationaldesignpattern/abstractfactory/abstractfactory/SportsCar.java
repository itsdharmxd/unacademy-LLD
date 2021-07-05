package creationaldesignpattern.abstractfactory.abstractfactory;

public class SportsCar implements Car {
    private  String steeringWheel,brakes,mirrors;

    public  SportsCar(String steeringWheel,String brakes,String  mirrors){
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
