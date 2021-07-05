package Structuredesignpatter;

public class ElectricCarDecorator  extends  CarDecorator{

   protected  Car car;

    public ElectricCarDecorator(Car car) {
        super(car);
    }


    @Override
    public void manufactureCar() {
        super.manufactureCar();
        System.out.println("INcludeing the featire of electric car");
    }
}
