import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set {
    // Set is often used to eliminate duplicate values from a list data
    public static void main(String[] args) {
        // HashSet is used when order of insertion does not matter
        HashSet<Integer> s = new HashSet<Integer>();
        s.add(1);
        s.add(1);
        s.remove(1);
        s.size();
        s.contains(1);

        // TreeSet automatically sorts input alphabetically or numerically
        // depending on the type of data
        TreeSet<Integer> t = new TreeSet<Integer>();

        // LinkedHashSet retains the order of insertion
        // and it is faster for certain operations than normal HashSet
        LinkedHashSet<Integer> x = new LinkedHashSet<Integer>();
    }
}
