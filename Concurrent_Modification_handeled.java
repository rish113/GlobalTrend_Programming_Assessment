import java.util.ArrayList;
import java.util.List;

public class Concurrent_Modification_handeled {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");


        System.out.println("Original List:");
        System.out.println(al);


        for (String s : al) {
            System.out.println(s);
        }

        // Update
        al.add("e");

        // Print updated list
        System.out.println("Modified List:");
        System.out.println(al);
    }
}

