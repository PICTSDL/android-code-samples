import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");

        System.out.println(strings.get(3));

        strings.size();
        strings.set(2,"Twoo");

        List<String> stringList = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();


        map.put("First", 1);
        map.put("Second", 2);
        map.put("Third", 3);

        for (Map.Entry<String, Integer> entry:
             map.entrySet()) {
            System.out.println(entry);
        }
    }
}
