public class Pattern2 {
    public static void main(String[] args) {
        int n = 4; // Total number of rows

        // Outer loop for each row
        for (int i = 0; i < n; i++) {
            // Inner loop for column before the stars
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("#");
            }
            // Inner loop for stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
