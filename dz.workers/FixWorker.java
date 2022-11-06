public class FixWorker extends Workers{
    int rate;
    FixWorker(String name, int rate){
        super(name);
        this.rate = rate;
    }
    double monthly_salary(){
        double monthly_salary =  this.rate;
        return monthly_salary;
    }
}
