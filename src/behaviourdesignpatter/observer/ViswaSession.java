package behaviourdesignpatter.observer;

public interface ViswaSession {

    public  void register(ObserverStudent observerStudent) ;

    public  void unregister(ObserverStudent observerStudent);

    public  void notifyObservingStudent();

    public  Object getUpdate(ObserverStudent student);
}
