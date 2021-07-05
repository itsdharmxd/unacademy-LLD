package singleton;

public class Singleton {

     static private   Singleton singleton;

     private  Singleton(){};



      //synchronize is from blocking in threading
     static public synchronized Singleton getInstance(){

         if(singleton==null){
             singleton =new Singleton();
         }

         return  singleton;
     }


}
