//Реализуйте класс Garage, который в себе будет хранить экземпляры автомобилей.
//Атрибуты – максимальная вместимость, какие автомобили и в каком количестве хранятся в гараже.
//Реализуйте методы, которые выводят на консоль построчно автомобили и их количество, отсортированных по количеству в гараже,
//отсортированных по цене автомобиля (если они есть в наличии)
import java.util.HashMap;
import java.util.Map;
public class Garage {
    int maximum_capacity;
    Car[] mas_of_cars;
    int amount;
    Garage(int maximum_capacity, Car[] mas_of_cars){
        this.maximum_capacity = maximum_capacity;
        this.mas_of_cars = mas_of_cars;
    }
    public void sorting_by_quantity(){
        int BMW_count = 0;
        int Ford_count = 0;
        HashMap<String, Integer> dict = new HashMap<>();
        for(int i=0; i<mas_of_cars.length; i++) {
            if (mas_of_cars[i].getClass() == BMW.class) {
                BMW_count += 1;
            } else if (mas_of_cars[i].getClass() == Ford.class) {
                Ford_count += 1;
            }
        }
        dict.put("BMW", BMW_count);
        dict.put("Ford", Ford_count);
       dict.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
    }
}
