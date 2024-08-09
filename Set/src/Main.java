public class Main {
    public static void main(String[] args) {
        Set<String> set = new Set<>();

        set.add("Sun");
        set.add("Moon");
        set.add("Star");
        set.add("Sun");

        for (String planet : set) {
            System.out.println(planet);
        }

        System.out.println("Total elements: " + set.size());
    }
}