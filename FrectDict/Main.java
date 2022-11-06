import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String string1 = "а Я, мы, Мы. Я мы. Были там, Там были.";
        System.out.println(FrectDict(string1));
    }
    public static HashMap<String, Integer> FrectDict(String string) {
        string = string.replaceAll("\\p{Punct}", "");
        string = string.toLowerCase();
        var words = string.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        int count_of_words = 0;
        for (var i = 0; i < words.length; i++) {
            if (map.containsKey(words[i]) == true){
                count_of_words+=1;
                map.put(words[i], count_of_words);
            }
            else{
                count_of_words=1;
                map.put(words[i], count_of_words);
            }
        }
        return map;
    }
}