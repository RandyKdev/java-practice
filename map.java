import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class map {
    // Used to store key - value pairs
    public static void main(String[] args) {
        // HashMap often used when the keys are of different data types
        HashMap<String, Integer> s = new HashMap<String, Integer>();
        s.put("hey", 2);
        s.containsKey("hey");
        s.containsValue(2);

        // TreeMap sorts data according to keys in alphabetical or numerical order
        TreeMap<String, Integer> t = new TreeMap<String, Integer>();

        // 
        LinkedHashMap<String, Integer> x = new LinkedHashMap<String, Integer>();
    }    
}
