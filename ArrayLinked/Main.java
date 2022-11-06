import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        LinkedList<Integer> linked1 = new LinkedList<>();
        AddArray(array1);
        long time = System.currentTimeMillis();
        GetArray(array1);
        System.out.println("Время заполнения+время вывода:" + (System.currentTimeMillis() - time)); // Время заполнения+вывода Array 221мсек,
        // время зполнения+вывода Linked 138015мсек
    }

    public static ArrayList<Integer> AddArray(ArrayList<Integer> array) {
        for(int i=0; i < 1000001; i++){
            Random random = new Random();
            int number = random.nextInt(1000000);
            array.add(number);
        }
        return array;
    }
    public static LinkedList<Integer> AddLinked(LinkedList<Integer> linked) {
        for(int i=0; i < 1000000; i++){
            Random random = new Random();
            int number = random.nextInt(1000000);
            linked.add(number);
        }
        return linked;
    }
    public static void GetArray(ArrayList<Integer> array) {
        for(int i=0; i < 100000; i++){
            Random randomIndex = new Random();
            int index = randomIndex.nextInt(1000000);
            System.out.println(array.get(index));
        }
    }
    public static void GetLinked(LinkedList<Integer> linked) {
        for(int i=0; i < 100000; i++){
            Random randomIndex = new Random();
            int index = randomIndex.nextInt(1000000);
            System.out.println(linked.get(index));
        }
    }
}
