package Structuredesignpatter;

public class SportsCarDecorator extends  CarDecorator {
    public SportsCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void manufactureCar() {
        super.manufactureCar();
        System.out.println("INcludeing the featire of Sports car");
    }
}
