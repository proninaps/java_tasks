import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList(Arrays.asList("a", "b", "a", "d")); //Array.aslist тобы заполнить коллекцию одним действием
        System.out.println(Dublicates(list));
    }
    public static Collection<String> Dublicates(Collection<String> list){
        return new HashSet(list);//HashSet "удаляет дубликаты" тк Set хранятся только уникальные значения
    }
}