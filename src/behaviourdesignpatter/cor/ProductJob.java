package behaviourdesignpatter.cor;

public class ProductJob implements  JobChain{
    private  JobChain jobChain;


    @Override
    public void setNextChain(JobChain jobChain) {
        this.jobChain=jobChain;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillType()==("Product"))
            System.out.println("selected in product");
        else{
            System.out.println("rejected in product");
            this.jobChain.getJob(person);
        }
    }
}
