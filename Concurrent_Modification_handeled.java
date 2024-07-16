import java.util.ArrayList;
import java.util.List;

public class Concurrent_Modification_handeled {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");

        // Print the original list
        System.out.println("Original List:");
        System.out.println(al);

        // Iterate over the list using traditional for loop
        for (int i = 0; i < al.size(); i++) {
            String s = al.get(i);
            System.out.println(s);

            // Update the list
            al.add("e");
        }

        // Print updated liss
        System.out.println("Modified List:");
        System.out.println(al);
    }
}

