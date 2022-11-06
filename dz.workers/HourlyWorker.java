//Для «почасовщиков» формула для расчета такая: «среднемесячная зарплата = 20.8*8*ставка в час»,
public class HourlyWorker extends Workers{
    int hourly_rate;
    HourlyWorker(String name, int hourly_rate){
        super(name);
        this.hourly_rate = hourly_rate;
    }
    double monthly_salary(){
       double monthly_salary =  20.8*8*this.hourly_rate;
       return monthly_salary;
    }
}
