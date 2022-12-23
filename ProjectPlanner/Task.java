import java.time.LocalDate;
import java.util.Date;

//Номер (должен генерироваться автоматически)
//        Дата создания
//        Дата выполнения
//        Наименование
//        Детальное описание
public class Task {
    private final int id;
    private final LocalDate creation_date;
    private LocalDate deadline ;
    private String task_name;
    private String details;
    private boolean completed;
    Task(int id, LocalDate creation_date, LocalDate deadline, String task_name, String details, boolean completed){
        this.id = id;
        this.creation_date = creation_date;
        this.deadline  = deadline;
        this.task_name = task_name;
        this.details = details;
        this.completed = completed;
    }
    public void edit_details(String details){  // метод редактирования заданий
    this.details = details;
    }
    public void edit_task_name(String task_name){  // метод редактирования наименования
        this.task_name = task_name;
    }
    public void edit_deadline(LocalDate deadline){  // метод редактирования дедлайна
        this.deadline = deadline;
    }
    public int get_id(){  // метод возвращения id
        return this.id;
    }
    public void edit_completed(){  // метод редактирования выполнения задния
        this.completed = !completed;//меняется на противоположное
    }
    public LocalDate get_creation_date(){  // метод возвращения даты создания
        return this.creation_date;
    }
    public LocalDate get_deadline (){  // метод возвращения дедлайна
        return this.deadline ;
    }
    public String get_task_name (){  // метод возвращения наименования
        return this.task_name ;
    }
    public String get_details (){  // метод возвращения деталей
        return this.details ;
    }
    public boolean get_completed (){  // метод возвращения выполнения задания
        return this.completed ;
    }

}
