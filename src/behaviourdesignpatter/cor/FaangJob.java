package behaviourdesignpatter.cor;

public class FaangJob implements  JobChain{

    private  JobChain jobChain;


    @Override
    public void setNextChain(JobChain jobChain) {
            this.jobChain=jobChain;
    }

    @Override
    public void getJob(Person person) {
       if(person.getSkillType()==("Faang"))
           System.out.println("selected in faang");
       else{
           System.out.println("rejected in faang");
           this.jobChain.getJob(person);
       }
    }
}
