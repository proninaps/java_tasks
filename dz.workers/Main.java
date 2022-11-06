import java.util.*;

//Создать 3 класса(базовый и 2 дочерних) которые описывают некоторых работников с почасовой оплатой (один из дочерних)
// и фиксированой оплатой (второй дочерний).
//        Описать в базовом классе абстрактный метод для расчета среднемесячной зарплаты.
//        Для «почасовщиков» формула для расчета такая: «среднемесячная зарплата = 20.8*8*ставка в час»,
//        для работников с фиксированой оплатой «среднемесячная зарплата = фиксированой месячной оплате».
//        a)Упорядочить всю последовательность рабочих по убыванию среднемесячной зарплаты.
//        При совпадении зарплаты – упорядочить данные в алфавитном порядке по имени. Вывести идентификатор работника,
//        имя и среднемесячную зарплату для всех елементов списка.
//        b)Вывести первые 5 имен работников из полученого выше списка (задача А).
//        c)Вывести последние 3 идентификаторы работников из полученого више списка (задача А).
//        d)Организовать запись и чтение колекции в/из файл(а)
//        e)Организовать обработку некоректного формата входного файла
public class Main {
    public static void main(String[] args) {
        Workers[] mas_of_workers = new Workers[]{new FixWorker("Ann", 60000), new FixWorker("Rick", 100000),
                new HourlyWorker("Cara", 300), new FixWorker("Lana", 120000),
                new HourlyWorker("Jane", 500), new FixWorker("Azia", 120000)};
        sorting_by_salary(mas_of_workers);


    }

    public static void sorting_by_salary(Workers[] mas_of_workers ) {
        HashMap<String, Double> dict = new HashMap<>();
        for (int i = 0; i < mas_of_workers.length; i++) {
            //                        String [] salaryType = {mas_of_workers[i].name, mas_of_workers[i].getClass().getName()};
            dict.put(mas_of_workers[i].name, mas_of_workers[i].monthly_salary());
        }
        Map<String, Double> treedict = new TreeMap<String, Double>(dict); //сортируем по ключу (алфавиту);
        System.out.println(treedict);
       treedict.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue()).forEach(System.out::println);//сортируем по значению


    }
}

//реализована сортировка по возрастанию зарплат