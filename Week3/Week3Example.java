import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week3Example {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr));
        List<String> list = new ArrayList<>();
        list.add("A"); list.add("B");
        printList(list);
    }

    static void printList(List<String> list) {
        for (String s : list) System.out.println(s);
    }
}
