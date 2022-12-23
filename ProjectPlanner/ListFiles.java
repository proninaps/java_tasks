import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ListFiles {
    static ArrayList<Task> task_list = new ArrayList<Task>();// создаем пустой список для заданий
    //доделать айди
    public void create_new_task(int id, LocalDate deadline, String task_name, String details){// метод создания нового задания

        boolean start_completed = false;// на этапе создания задания оно не выполнено
        LocalDate creation_date = LocalDate.now();// получаем актуальную дату создания
        Task new_task = new Task(id, creation_date, deadline, task_name, details, start_completed);//создаем новое задание
        task_list.add(new_task);// добавляем задание в список заданий
        System.out.println("новое задание создано и добавлено в список!!!");// выводим сообщение о успешном создании задания
    }

    public static Task find_by_id(int task_id) {//метод поиска объекта задания по индексу
        Task this_task = null;//создаем переменную пододящего задания
        for (Task test_task : task_list) {
            if ((test_task.get_id()) == task_id) {// перебирем все задания из списка и ищем задание с нужным индексом
                this_task = test_task;
            }
        }
        return this_task;//возвращаем нужное задание
    }
    public void delete_task(int task_id){
        task_list.remove(task_list.indexOf(find_by_id(task_id)));//удаляем задание по индексу с помощью метода поиска задания по индексу
        System.out.println(" задание удалено из списка!!!");// выводим сообщение об удалении задания
    }
    public void edit_task(int task_id, String change, String message){// метод изменения разных изменяемых полей задания
        if(message == "добавить детали"){
            String old_details = find_by_id(task_id).get_details();//получаем значение текущего поля деталей
            String compleated_details = old_details + " " + change; // создаем новое значение деталей добавляя изменения
            find_by_id(task_id).edit_details(compleated_details);// меняем поле деталей на новое
            System.out.println("вы добавили детали к заданию " + task_id + " тепреь они выглядят так: " + compleated_details);
        }
        else if(message.equals("удалить старые детали и добавить новые")){
            find_by_id(task_id).edit_details(change);// меняем значение поля детали на изменение
            System.out.println("вы изменили детали задания " + task_id + " теперь они выглядят так " + change);
        }
        else if(message.equals("изменить название задания")){
            find_by_id(task_id).edit_task_name(change);// меняем поле имя на изменение
            System.out.println("название задания " + task_id + " изменено на " + change);
        }
        else if( message.equals("изменить дедлайн")){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");// задаем формат даты
            LocalDate new_deadline = LocalDate.parse(change, formatter);// переводим строку изменений в дату
            find_by_id(task_id).edit_deadline(new_deadline);// меняем дедлайн на новую дату
            System.out.println("дедлайн задания " + task_id + " изменен на " + change);
        }
        else if( message.equals("добавить несколько дней к дедлайну")){
            int days_number = Integer.parseInt(change); // переводим строку колличества дней в инт
            LocalDate new_deadline = find_by_id(task_id).get_deadline().plusDays(days_number );// создаем новый дедлайн добавляя к нему заданное колличесвто дней
            find_by_id(task_id).edit_deadline(new_deadline);// меняем дедлайн на новый
            System.out.println("к дедлайну задания " + task_id + " добавленно " + change + " дня");
        }
    }
    public void edit_task(int task_id){// создаем перегрузку так как нам не нужен метод изменеий в этом случае
        find_by_id(task_id).edit_completed();// меняем индикатор выполнение на противоположный с помощью метода из класса заданий
        if (find_by_id(task_id).get_completed()){
            System.out.println("теперь задание " + task_id + " выполнено!");// в зависимости от значения поля выводим сообщение
        }else if (!find_by_id(task_id).get_completed()){
            System.out.println("теперь задание " + task_id + " не выполнено :(");
        }
    }
    public void print_task(Task task){
        String compleated_str;
        if(task.get_completed()){
            compleated_str = "выполнено";
        }else{
            compleated_str = "еще не выполнено";// создаем строчную переменную выполнения
        }
        System.out.println("Айди задания " + task.get_id() + " | Название задания: " + task.get_task_name() +
                " | Дата создания: " + task.get_creation_date() + " | Дедлайн: " + task.get_deadline()
                + " | Детали задания: " + task.get_details() + " | Выполнено ли задание? " + compleated_str); // выводи
    }
    public void print_list(){//вывод списка заданий
        for(Task task: task_list){// заходим в цикл и проходимся по всем заданиям списка
            print_task(task);
        }
    }
    public void print_compleated_list(){// список выполненных заданий
        int indicator = 0;
        for(Task task: task_list){
            if(task.get_completed()){// если выполнение положительно то переходим в метод print_list
                print_task(task);
                indicator=+1;
            }
        }
        if(indicator==0){
            System.out.println("Такого задания нет!");
        }
    }
    public void print_outstanding_list(){// список невыполненных заданий
        for(Task task: task_list){
            if(!task.get_completed()){// если выполнение отрицательно то переходим в метод print_list
                print_task(task);
            }
        }
    }
    public void print_compleated_list(String date_str, String message) {// перегрузка список выполненных заданий с конкретным дедлайном или датой создания
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");// задаем формат даты
        LocalDate date_date = LocalDate.parse(date_str, formatter);// переводим строку в дату
        int indikator = 0;
        for (Task task : task_list) {
            if (message == "по дате дедлайна") {
                if (task.get_completed() && task.get_creation_date().compareTo(date_date)==0) {// если условия выполнены то переходим в метод print_list
                    print_task(task);
                    indikator =+1;
                }
            } else if (message == "по дате создания") {
                if (task.get_completed() && task.get_creation_date().compareTo(date_date)==0) {// если условия выполнены то переходим в метод print_list
                    print_task(task);
                    indikator =+1;
                }
            }

        }
        if(indikator==0) {
            System.out.println("В списке нет таких заданий");
        }
    }
    public void print_outstanding_list(String date_str, String message) {// перегрузка список выполненных заданий с конкретным дедлайном или датой создания
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");// задаем формат даты
        LocalDate date_date = LocalDate.parse(date_str, formatter);// переводим строку в дату
        int indikator = 0;
        for (Task task : task_list) {
            if (message == "по дате дедлайна"){
                if (!task.get_completed() && task.get_deadline().compareTo(date_date)==0) {// если условия выполнены то переходим в метод print_list
                    print_task(task);
                    indikator =+1;
                }
            } else if (message == "по дате создания") {
                if (!task.get_completed() && task.get_deadline().compareTo(date_date)==0) {// если условия выполнены то переходим в метод print_list
                    print_task(task);
                    indikator =+1;
                }
            }
        }
        if(indikator==0) {
            System.out.println("В списке нет таких заданий");
        }
    }
    public void print_detailes(int task_id){// дополнительный метод вывода исключительно деталей задания
        System.out.println("детальная информация задания " + task_id + ": " + find_by_id(task_id).get_details());
    }
}
