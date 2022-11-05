public class BMW extends Car{
    private String model;
    private String interior_color;
    private int seats_number;
    public BMW(String colour, int max_speed, String transmission, int current_speed, int price, String model, String interior_color, int seats_number){
        super(colour, max_speed, transmission, current_speed, price);
        this.model = model;
        this.interior_color = interior_color;
        this.seats_number = seats_number;

    }

}
