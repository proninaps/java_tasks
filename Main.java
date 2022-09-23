public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World"); // 1 task

        int rand_num = 2;

        System.out.print(rand_num); // 2 task

        int sec_rand_num = ++rand_num;
        System.out.print(sec_rand_num);// 3.1 task

        rand_num += 1;
        System.out.print(rand_num); //3.2 task

        int x = 10;
        int y = 12;
        int z = x;
        x = y;
        y = z;
        System.out.println(x + " " + y); //4.1 task
        int n = 10;
        int m = 12;
        m -= x;
        n += m;
        m = n-m;
        System.out.println(n + " " + m); // 4.2 task

        int a = 3;
        int b = 4;
        double c = Math.sqrt(a*a+b*b);
        System.out.println(c); //5 task

        System.out.println(rand_num%10); // 6 task

        System.out.println(rand_num % 100/10); // 7 task

        int two_digit = 45;
        System.out.println(two_digit/10); // 8 task

        task_9(1, 2, 3); // 9 task

        task_10(4, 7); // 10 task

        task_11(4, 7); // 11 task

        task_12(1, 1, 3, 4); // 12 task
    }
    public static void task_9(int arg_1, int arg_2, int arg_3) {
        System.out.println((arg_1-21) + " " + (arg_2-21) + " " + (arg_3-21));
    }
    public static void task_10(int arg_1, int arg_2) {
        System.out.println((arg_1+arg_2)/2);
    }
    public static void task_11(int arg_1, int arg_2) {
        System.out.println(Math. sqrt(arg_1*arg_2));
    }
    public static void task_12(double arg_1, double arg_2, double arg_3, double arg_4) {
        System.out.println(Math.sqrt(Math.pow(arg_3 - arg_1, 2) + Math.pow(arg_4 - arg_2, 2)));
    }
}
