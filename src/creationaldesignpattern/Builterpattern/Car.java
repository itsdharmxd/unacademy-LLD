package creationaldesignpattern.Builterpattern;

public class Car {
    /**
     *mandatory
     */
    private  String steeringWheel,mirror,brake;
    /**
     * optional
     */
    private  String seatCover,ac,musicSystem;
     Car(CarBuilder carBuilder) {
        this.steeringWheel = carBuilder.steeringWheel;
        this.mirror = carBuilder.mirror;
        this.brake = carBuilder.brake;
        this.seatCover=carBuilder.seatCover;
        this.ac=carBuilder.ac;
        this.musicSystem=carBuilder.musicSystem;
    }

    @Override
    public String toString() {
        return "Car{" +
                "steeringWheel='" + steeringWheel + '\'' +
                ", mirror='" + mirror + '\'' +
                ", brake='" + brake + '\'' +
                ", seatCover='" + seatCover + '\'' +
                ", ac='" + ac + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                '}';
    }

    public static class CarBuilder{
       /**
        *mandatory
        */
       private  String steeringWheel,mirror,brake;
       /**
        * optional
        */
       private  String seatCover,ac,musicSystem;

       public CarBuilder(String steeringWheel, String mirror, String brake) {
           this.steeringWheel = steeringWheel;
           this.mirror = mirror;
           this.brake = brake;
       }

       public CarBuilder setSeatCover(String seatCover) {
           this.seatCover = seatCover;
           return this;
       }

       public CarBuilder setAc(String ac) {
           this.ac = ac;
           return this;
       }

       public CarBuilder setMusicSystem(String musicSystem) {
           this.musicSystem = musicSystem;
           return  this;
       }
       public Car build(){
           return new Car(this);
       }
   }


}
