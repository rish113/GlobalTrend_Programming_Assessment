import java.util.*;

public class ConcurrentModification {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            System.out.println(s);
            // Now trying to add another while iterating
            al.add("e");
        }
    }
}

