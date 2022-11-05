public class Main {
    public static void main(String[] args) {
        Reader[] readers = ReaderList();
        readers[1].returnBook(new Book[]{new Book("'МуМу'", "Тургенев"), new Book("'Я встретил вас'", "Тютчев")});
        readers[0].takeBook(new String[] {"Над пропостью", "Бедные люди"});
        readers[2].returnBook(3);
    }
    public static Reader[] ReaderList(){
        int numberOfReaders = 3;
        Reader[] readers = new Reader[numberOfReaders];
        readers[0] = new Reader("Пронина П.С.", 12345, "IT", "20.04.2003", 3456);
        readers[1] = new Reader("Серов А.В.", 18444, "IT", "27.07.2003", 5051);
        readers[2] = new Reader("Петрова А.С.", 25647, "UM", "12.06.2002", 3674);
        return readers;
    }
}