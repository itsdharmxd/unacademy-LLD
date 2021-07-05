package Builterpattern;

public class MangoPeople {


    public static void main(String[] args) {
         Car car =new Car.CarBuilder("SW","M","B").setMusicSystem("MS").build();
        System.out.println(car);

    }
}
