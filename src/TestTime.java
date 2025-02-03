public class TestTime {
    public static void main(String[] args) {
        // Create time objects t1 and t2
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);

        // Set times using set methods
        t1.setTime(21, 10, 15);
        t2.setTime(10, 20, 25);

        // Display set times
        System.out.println("Original times:");
        System.out.println("t1: " + t1.toString());
        System.out.println("t2: " + t2.toString());

        // Modify times
        t1.nextSecond();
        t2.previousSecond();

        // Display modified times
        System.out.println("\nModified times:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
    }
}