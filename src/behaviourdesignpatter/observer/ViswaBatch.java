package behaviourdesignpatter.observer;

import java.util.ArrayList;
import java.util.List;

public class ViswaBatch implements  ViswaSession{

   private List<ObserverStudent> registerStudent;
   private  String studyTopic;

    public  ViswaBatch(){
        this.registerStudent=new ArrayList<>();
    }





    @Override
    public void register(ObserverStudent student) {
        System.out.println("registering student");
        this.registerStudent.add(student);
    }

    @Override
    public void unregister(ObserverStudent observerStudent) {
        System.out.println("removeing student");

    }

    @Override
    public void notifyObservingStudent() {
       for(ObserverStudent student:registerStudent){
           student.update();
       }
    }

    @Override
    public Object getUpdate(ObserverStudent student) {

         if(registerStudent.contains((student))){
             return  this.studyTopic;
         }


        return null;
    }

   public  void addStudyTopic(String studyTopic){
       System.out.println("adding topic");
       this.studyTopic=studyTopic;
       notifyObservingStudent();
   }





}
