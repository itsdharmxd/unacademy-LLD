package Structuredesignpatter;

public class LuxuryCarDecorator extends CarDecorator{
    public LuxuryCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void manufactureCar() {
        super.manufactureCar();
        System.out.println("INcludeing the featire of Kux car");
    }
}
