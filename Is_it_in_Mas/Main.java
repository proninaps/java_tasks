import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        int[] array = FullArray(); // заполняем массив 
        int first_el = array[0];// ищем первый элемент для бинарного 
        int last_el = array[array.length-1];// последний эл
        long time_enumeration = System.currentTimeMillis();// начальный счетчик времни
        if (Check_by_enumeration(array, n)==true){// по значению проверки выводим сообщение 
            System.out.println("Элемент входит в массив");
        }
        else {
            System.out.println("Элемент не входит в массив");
        }
        System.out.println("Время перебора" + " " + (System.currentTimeMillis() - time_enumeration));
        long time_binary = System.currentTimeMillis();// аналогично с бинарным
        if (Check_binary(array, first_el, last_el, n)==true){
            System.out.println("Элемент входит в массив");
        }
        else {
            System.out.println("Элемент не входит в массив");
        }
        System.out.println("Время бинарного" + " " + (System.currentTimeMillis() - time_binary));
    }
    public static int[] FullArray(){ // метод заполнения массива 
        int[] array;
        array = new int[100000000];// размер 100000000
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * array.length+1 ));// генерируем рандомные числа в том же диапозоне, что и размер массива
        }
        Arrays.sort(array);// сортируем массив для бинарного поиска
        return array;
    }
    public static boolean Check_by_enumeration(int[] array, int n){//поиск перебором
        boolean check = false;
        for (int i=0; i<array.length; i++) {//проходимся по всему массиву ищем эллемент массива совпадающий с числом n
            if (array[i] == n) {
                check = true; // если находим возвращаем правду если нет оставляем ложь
            }
        }
        return check;
    }
    public static boolean Check_binary(int [] array,int first_el, int last_el, int n) {// бинарный поиск 
        boolean check = false;
        if (first_el<=last_el){// проверяем больше ли первый эллемент второго 
            int mid = first_el + (last_el - first_el) / 2; //ищем середину отрезка 
            if (array[mid] == n) {//если середина отрезка или оставшийся элемент совпадает с n выводим правду 
                check = true;
            } else if (array[mid] > n) {// если середина больше то снова проходим бинарный поиск но в первой половине отрезка
                return Check_binary(array, first_el, mid - 1, n);
            } else if (array[mid] < n) {// меньше - во второй 
                return Check_binary(array, mid + 1, last_el, n);
            }
        else{
            check = false;
            }
        }
        return check;// возвращаем значение проверки
    }
}
