//Реализовать класс Car и дочерние классы отдельных моделей автомобиля.
//Все классы должны содержать атрибуты цвет, максимальная скорость, тип коробки передач, текущая скорость, цена;
//методы start(), stop(), accelerate(int speed). Продумать атрибуты и/или методы для отдельных моделей автомобилей.
//Защитить классы от изменения данных извне.
//Реализуйте класс Garage, который в себе будет хранить экземпляры автомобилей.
//Атрибуты – максимальная вместимость, какие автомобили и в каком количестве хранятся в гараже.
//Реализуйте методы, которые выводят на консоль построчно автомобили и их количество, отсортированных по количеству в гараже,
//отсортированных по цене автомобиля (если они есть в наличии)
public class Car {
    private String colour;
    private int max_speed;
    private String transmission;
    private int current_speed;
    private int price;
    Car(String colour, int max_speed, String transmission, int current_speed, int price){
        this.colour = colour;
        this.transmission = transmission;
        this.max_speed = max_speed;
        this.current_speed = current_speed;
        this.price = price;
    }
    public int start(){
        return this.current_speed;
    }
    public void stop(){
        this.current_speed = 0;
    }
    public void accelerate(int speed){
        this.current_speed +=speed;
    }
}
