package behaviourdesignpatter.cor;

public class ServiceJob implements  JobChain{
    private  JobChain jobChain;


    @Override
    public void setNextChain(JobChain jobChain) {
        this.jobChain=jobChain;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillType()==("Service"))
            System.out.println("selected in service");
        else{
            System.out.println("rejected in service");
            this.jobChain.getJob(person);
        }
    }
}
