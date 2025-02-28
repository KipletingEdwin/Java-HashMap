import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John",12345);
        empIds.put("Jane",67890);
        empIds.put("Bob",98765);



        System.out.println(empIds);

        System.out.println(empIds.get("John"));

        System.out.println(empIds.containsKey("John"));

    }
}