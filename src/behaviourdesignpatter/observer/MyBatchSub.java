package behaviourdesignpatter.observer;

public class MyBatchSub implements  ObserverStudent{
    private  String name;
    private  ViswaSession viswaSession;

    public MyBatchSub(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String sesssionPlan=(String) viswaSession.getUpdate(this);
        System.out.println("fetching the session");
    }

    @Override
    public void setViswaSession(ViswaSession viswaSession) {
   this.viswaSession=viswaSession;
    }

    @Override
    public String getName() {
        return name;
    }
}
