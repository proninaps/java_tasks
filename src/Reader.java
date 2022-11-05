//        Методы takeBook(), returnBook().
//Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook():
//        - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//        - takeBook, который будет принимать переменное количество названий книг.
//        Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        - takeBook, который будет принимать переменное количество объектов класса Book
//        (создать новый класс, содержащий имя и автора книги).
//        Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//        Аналогичным образом перегрузить метод returnBook().
//        Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия".
//        Или  "Петров В. В. вернул 3 книги".
public class Reader {
    String FIO;
    int reader_number;
    String facultet;
    String date_of_birth;
    int tel_number;
    Reader(String FIO, int reader_number, String facultet, String date_of_birth, int tel_number){
        this.FIO = FIO;
        this.reader_number = reader_number;
        this.facultet = facultet;
        this.date_of_birth = date_of_birth;
        this.tel_number = tel_number;
    }
    public void takeBook(){
        System.out.println(this.FIO +"взял книгу.");
    }
    public void returnBook(){
        System.out.println(this.FIO +"отдал книгу.");
    }
    public void takeBook(int num_books){
        System.out.println(this.FIO +"взял " + num_books + " книги.");
    }
    public void returnBook(int num_books){
        System.out.println(this.FIO +"отдал " + num_books + " книги.");
    }
    public void takeBook(String[] args){
        String result = "";
        result += (this.FIO +" взял:");
        for (int i = 0; i < args.length; i++) {
            if ( i == args.length-1) {
                result += (" " + args[i] + ".");
            } else {
                result += (" " + args[i] + ",");
            }
        }
        System.out.println(result);
    }
    public void returnBook(String[] args){
        String result = "";
        result += (this.FIO +" отдал:");
        for (int i = 0; i < args.length; i++) {
            if ( i == args.length-1) {
                result += (" " + args[i] + ".");
            } else {
                result += (" " + args[i] + ",");
            }
        }
        System.out.println(result);
    }
    public void returnBook(Book[] args){
        String result = "";
        result += (this.FIO +" отдал:");
        for (int i = 0; i < args.length; i++) {
            if ( i == args.length-1) {
                result += (" " + args[i].book_name + " " + args[i].author_name + ".");
            } else {
                result += (" " + args[i].book_name + " " + args[i].author_name + ",");
            }
        }
        System.out.println(result);
    }
    public void takeBook(Book[] args){
        String result = "";
        result += (this.FIO +" взял:");
        for (int i = 0; i < args.length; i++) {
            if ( i == args.length-1) {
                result += (" " + args[i].book_name + " " + args[i].author_name + ".");
            } else {
                result += (" " + args[i].book_name + " " + args[i].author_name + ",");
            }
        }
        System.out.println(result);
    }

}
