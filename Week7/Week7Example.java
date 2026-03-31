import java.util.*;

public class Week7Example {
    public static void main(String[] args) {
        Map<String, Integer> score = new HashMap<>();
        score.put("A", 90);
        score.put("B", 80);
        score.forEach((k, v) -> System.out.println(k + ":" + v));

        Set<Integer> s = new HashSet<>(Arrays.asList(1, 2, 3, 2));
        s.forEach(System.out::println);
    }
}
