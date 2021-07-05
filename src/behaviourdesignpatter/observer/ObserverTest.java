package behaviourdesignpatter.observer;

public class ObserverTest {


    public static void main(String[] args) {

         ViswaBatch batch=new ViswaBatch();

         ObserverStudent student1=new MyBatchSub("Mohan");
        ObserverStudent student2=new MyBatchSub("Rahul");
        ObserverStudent student3=new MyBatchSub("Sohan");
        ObserverStudent student4=new MyBatchSub("Lohan");


       batch.register(student1);

        batch.register(student2);
        batch.register(student3);
        batch.register(student4);


        student1.setViswaSession(batch);
        student2.setViswaSession(batch);
        student3.setViswaSession(batch);
        student4.setViswaSession(batch);

  batch.notifyObservingStudent();    }


}
