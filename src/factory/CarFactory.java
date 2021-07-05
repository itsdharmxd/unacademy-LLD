package factory;

public class CarFactory {

   public  static  Car createCar(String steeringWheel,String brakes,String mirrors ,String typeof){
       if(typeof.equals("BASIC"))
           return  new BasicCar(steeringWheel, brakes, mirrors);
       else if(typeof.equals("SPORT"))
           return  new SportsCar(steeringWheel, brakes, mirrors);
     else throw new RuntimeException("this car not present");
   }


}
