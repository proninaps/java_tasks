import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListFiles new_list = new ListFiles();
        int id = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Это планер заданий \n" +
                    "- создать задание \n" +
                    "- удалить задание \n" +
                    "- изменить задание \n" +
                    "- посмотреть список всех заданий \n" +
                    "- посмотреть список выполненных заданий\n" +
                    "- посмотреть список невыполненных заданий\n" +
                    "- посмотреть список выполненных заданий с определенным дедлайном\n" +
                    "- посмотреть список выполненных заданий с определенной датой создания \n" +
                    "- посмотреть список невыполненных заданий с определенным дедлайном\n" +
                    "- посмотреть список невыполненных заданий с определенной датой создания \n" +
                    "- посмотреть исключительно детали задания\n" +
                    "*Скопируй то, что хочешь сделать и вставь*");
            String message = in.nextLine();
            System.out.println(message);
            if (message.equals("создать задание")) {
                Scanner task_name_input = new Scanner(System.in);
                System.out.println("Введите название задания ");
                String task_name = in.nextLine();
                Scanner deadline_input = new Scanner(System.in);
                System.out.println("Ведите дедлан в формате день/месяц/год ");
                String deadline = in.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");// задаем формат даты
                LocalDate date_deadline = LocalDate.parse(deadline, formatter);
                Scanner details_input = new Scanner(System.in);
                System.out.println("Введите детали задания ");
                String details = in.nextLine();
                new_list.create_new_task(id, date_deadline, task_name, details);
            } else if (message.equals("удалить задание")) {
                Scanner id_delete_input = new Scanner(System.in);
                System.out.println("Введите id задани, которое хотите удалить ");
                int id_delete = in.nextInt();
                new_list.delete_task(id_delete);
            } else if (message.equals("изменить задание")) {
                Scanner dop_mes_input = new Scanner(System.in);
                System.out.println("Введите какие конкретно изменения хотите сделать\n" +
                        "- добавить детали\n" +
                        "- удалить старые детали и добавить новые\n" +
                        "- изменить название задания\n" +
                        "- изменить дедлайн\n" +
                        "- добавить несколько дней к дедлайну\n" +
                        "- изменить индикатор выполнения");
                String dop_mes = in.nextLine();
                Scanner input = new Scanner(System.in);
                System.out.println("Введите id задания, которое хотите изменить ");
                int id_edit = in.nextInt();
                System.out.println("Введите на что хотите поменять ");
                String change = in.next();
                if (dop_mes.equals("изменить индикатор выполнения")) {
                    new_list.edit_task(id_edit);
                } else {
                    new_list.edit_task(id_edit, change, dop_mes);
                }
            } else if (message.equals("посмотреть список всех заданий")) {
                new_list.print_list();
            } else if (message.equals("посмотреть список выполненных заданий")) {
                new_list.print_compleated_list();
            } else if (message.equals("посмотреть список невыполненных заданий")) {
                new_list.print_outstanding_list();
            } else if (message.equals("посмотреть список выполненных заданий с определенным дедлайном")
                    || message.equals("посмотреть список выполненных заданий с определенной датой создания")) {
                Scanner date_input = new Scanner(System.in);
                System.out.println("Введите дату в формате день/месяц/год ");
                String date = in.nextLine();
                new_list.print_compleated_list(date, message);
            } else if (message.equals("посмотреть список невыполненных заданий с определенным дедлайном")
                    || message.equals("посмотреть список невыполненных заданий с определенной датой создания")) {
                Scanner date_input = new Scanner(System.in);
                System.out.println("Введите дату в формате день/месяц/год ");
                String date = in.nextLine();
                new_list.print_outstanding_list(date, message);
            } else if (message.equals("посмотреть исключительно детали задания")) {
                Scanner id_details_input = new Scanner(System.in);
                System.out.println("Введите id задани, чтобы посмтореть детали ");
                int id_details = in.nextInt();
                new_list.print_detailes(id_details);
            } else if (message.equals("закончить работу")) {
                System.out.println("Спасибо за работу");
                return;
            } else {
                System.out.println("Вы неправильно ввели сообщение, попробуйте еще раз");
            }
            id = id + 1;
        }
    }
}