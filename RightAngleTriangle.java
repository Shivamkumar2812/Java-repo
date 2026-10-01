public class RightAngleTriangle {
    
    /**
     * Prints a right-angle triangle with stars in increasing shape
     * @param n Number of rows for the triangle
     */
    public static void printRightAngleTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    /**
     * Alternative method: Right-aligned triangle
     * @param n Number of rows for the triangle
     */
    public static void printRightAlignedTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int rows = 5;
        
        System.out.println("Right-Angle Triangle (Left-aligned):");
        printRightAngleTriangle(rows);
        
        System.out.println("\nRight-Angle Triangle (Right-aligned):");
        printRightAlignedTriangle(rows);
        
        // Custom size
        System.out.println("\nCustom Size (7 rows):");
        printRightAngleTriangle(7);
    }
}
