package gr.aueb.cf.ch4.exercise2;

/**
 * Prints out a pyramid of stars with 4 rows
 */
public class PyramidApp {
    public static void main(String[] args) {
        final int rows = 4;
        final int cols = rows * 2;
        int mid = (cols / 2) - 1; // calculate the middle of the row

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
               if(j <= (mid + i) && j >= (mid - i)) {
                   System.out.print('*');
               } else {
                   System.out.print(' ');
               }
            }
            System.out.println();
        }
    }
}
