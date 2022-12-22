//Дано натуральное число n. Выведите все числа от 1 до n.

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int result = func(n, i);
    }

    public static int func(int n, int i) {
        if (i == n) {
            System.out.println(n);
            return n;
        }
        System.out.print(i + " ");
        return func(n, i+1);

    }
}