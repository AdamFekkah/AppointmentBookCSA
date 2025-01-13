public class Main {
    public static void main(String[] args) {
        AppointmentBook ab = new AppointmentBook();

        // Initialize availability based on the problem's examples
        ab.initializePeriod(2, new boolean[]{
            false, false, false, false, false, false, false, false, false, false, // 0-9
            true, true, true, true, true, // 10-14
            false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, // 15-29
            true, true, true, true, true, true, true, true, true, true, true, true, true, true, // 30-44
            false, false, false, false, false, // 45-49
            true, true, true, true, true, true, true, true, true, true // 50-59
        });

        ab.initializePeriod(3, new boolean[]{
            true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, // 0-14
            false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, // 15-40
            true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, // 41-59
        });

        ab.initializePeriod(4, new boolean[]{
            false, false, false, false, false, // 0-4
            true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, // 5-29
            false, false, false, false, false, false, false, false, false, false, false, false, false, // 30-43
            true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, // 44-59
        });

        // Test findFreeBlock
        System.out.println(ab.findFreeBlock(2, 15)); // Expected: 30
        System.out.println(ab.findFreeBlock(2, 9));  // Expected: 30
        System.out.println(ab.findFreeBlock(2, 20)); // Expected: -1

        // Test makeAppointment
        System.out.println(ab.makeAppointment(2, 4, 22)); // Expected: true
        System.out.println(ab.makeAppointment(3, 4, 3));  // Expected: true
        System.out.println(ab.makeAppointment(2, 4, 30)); // Expected: false

        // Display updated availability for periods 2, 3, and 4
        ab.displayPeriod(2);
        ab.displayPeriod(3);
        ab.displayPeriod(4);
    }
}
