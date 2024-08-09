public class Main {
    public static void main(String[] args) {
        Set<String> set = new Set<>();

        set.add("Sun");
        set.add("Moon");
        set.add("Star");
        set.add("Sun");

        System.out.println(set.size());
    }
}