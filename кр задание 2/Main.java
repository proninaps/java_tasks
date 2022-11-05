//не реализована сортировка по цене
public class Main {
    public static void main(String[] args) {
        Garage garage1 = new Garage(6, new Car[]{new BMW("red", 150, "oil",
                100, 2000000, "X5", "black", 4), new BMW("white",
                150, "oil", 100, 2700000, "X7", "black", 5),
                new Ford("red", 200, "phuel",
                        120, 3000000, "X5", "black", 4, "jip"),
                new BMW("black", 150, "phuel", 100, 2100000, "X3",
                        "white", 2)});
        garage1.sorting_by_quantity();
    }
}