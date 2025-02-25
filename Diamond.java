public class Diamond {
    public static void main(String[] args) {
        int g = 5;

        // Upper triangle
        for (int r = 1; r <= g; r++) {
            for (int j = g - r; j > 0; j--) {
                System.out.print(" "); 
            }
            for (int j = 0; j < (2 * r - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower inverted triangle
        for (int r = g - 1; r > 0; r--) {
            for (int j = g - r; j > 0; j--) {
                System.out.print(" "); 
            }
            for (int j = 0; j < (2 * r - 1); j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
