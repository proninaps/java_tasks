import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int[] array = FullArray();
        int first_el = array[0];
        int last_el = array[array.length-1];
        long time_enumeration = System.currentTimeMillis();
        if (Check_by_enumeration(array, n)==true){
            System.out.println("Элемент входит в массив");
        }
        else {
            System.out.println("Элемент не входит в массив");
        }
        System.out.println("Время перебора" + " " + (System.currentTimeMillis() - time_enumeration));
        long time_binary = System.currentTimeMillis();
        if (Check_binary(array, first_el, last_el, n)==true){
            System.out.println("Элемент входит в массив");
        }
        else {
            System.out.println("Элемент не входит в массив");
        }
        System.out.println("Время бинарного" + " " + (System.currentTimeMillis() - time_binary));
    }
    public static int[] FullArray(){
        int[] array;
        array = new int[100000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * array.length+1 ));
        }
        Arrays.sort(array);
        return array;
    }
    public static boolean Check_by_enumeration(int[] array, int n){
        boolean check = false;
        for (int i=0; i<array.length; i++) {
            if (array[i] == n) {
                check = true;
            }
        }
        return check;
    }
    public static boolean Check_binary(int [] array,int first_el, int last_el, int n) {
        boolean check = false;
        if (first_el<=last_el){
            int mid = first_el + (last_el - first_el) / 2; //=5 =2 =1
            if (array[mid] == n) {
                check = true;
            } else if (array[mid] > n) {
                return Check_binary(array, first_el, mid - 1, n);
            } else if (array[mid] < n) {
                return Check_binary(array, mid + 1, last_el, n);
            }
        else{
            check = false;
            }
        }
        return check;
    }
}