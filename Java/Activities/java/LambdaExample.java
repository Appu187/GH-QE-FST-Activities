import java.util.List;
import java.util.ArrayList;

public class LambdaExample {

    public static void main(String[] args) {

        // Create an ArrayList
        List<String> list = new ArrayList<String>();

        // Add values to the list
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");

        // Loop through ArrayList using lambda
        list.forEach(
            (names) -> System.out.println(names)
        );
    }
}