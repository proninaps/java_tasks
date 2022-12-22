import java.util.LinkedList;

//Задача 2
//        Дано два потока — производитель и потребитель.
//        Производитель генерирует некоторые данные (в примере — числа). Производитель «потребляет» их.
//        Два потока разделяют общий буфер данных, размер которого ограничен.
//        Если буфер пуст, потребитель должен ждать, пока там появятся данные.
//        Если буфер заполнен полностью, производитель должен ждать, пока потребитель заберёт данные и место освободится.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> buffer = new LinkedList<Integer>();
        int size = 10;
        Thread Man = new Thread(new Manufacturer(buffer, size));
        Thread Man2 = new Thread(new Consumer(buffer, size));
        Man.start();
        Man2.start();
    }
}
