public class Week2Example {
    public static void main(String[] args) {
        int x = 7;
        int y = 3;
        System.out.println("sum=" + (x + y));
        System.out.println("max=" + (x > y ? x : y));
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) continue;
            System.out.println("i=" + i);
        }
    }
}
