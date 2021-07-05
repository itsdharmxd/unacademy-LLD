package Structuredesignpatter;

public class ElonMuskUnit {

    public static void main(String[] args) {

         Car sportsCar =new SportsCarDecorator(new BaseCar());
     sportsCar.manufactureCar();
    }

}
