
import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }
    
    //to check if string is in the hashmap
//    public boolean contains(String word){
//    return this.translations.containsKey(word);
//    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}
