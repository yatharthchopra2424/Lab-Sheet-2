package source;

import java.util.Arrays;

public class TwoDimensionalArray {

    private int[][] array;
    private int rows, columns;

    public TwoDimensionalArray(int initialRows, int initialColumns) {
        this.rows = initialRows;
        this.columns = initialColumns;
        array = new int[rows][columns];
    }

    // Method to add a new row
    public void insertRow(int[] newRow) {
        if (newRow.length != columns) {
            System.out.println("Row length must match the number of columns.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            boolean isRowEmpty = true;
            for (int j = 0; j < columns; j++) {
                if (array[i][j] != 0) {
                    isRowEmpty = false;
                    break;
                }
            }
            if (isRowEmpty) {
                array[i] = Arrays.copyOf(newRow, columns);
                return;
            }
        }

        array = Arrays.copyOf(array, rows + 1);
        array[rows] = Arrays.copyOf(newRow, columns);
        rows++;
    }

    // Method to add a new column
    public void insertColumn(int[] newCol) {
        if (newCol.length != rows) {
            System.out.println("Column length must match the number of rows.");
            return;
        }

        for (int j = 0; j < columns; j++) {
            boolean isColumnEmpty = true;
            for (int i = 0; i < rows; i++) {
                if (array[i][j] != 0) {
                    isColumnEmpty = false;
                    break;
                }
            }
            if (isColumnEmpty) {
                for (int i = 0; i < rows; i++) {
                    array[i][j] = newCol[i];
                }
                return;
            }
        }

        int[][] newArray = new int[rows][columns + 1];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(array[i], 0, newArray[i], 0, columns);
            newArray[i][columns] = newCol[i];
        }
        array = newArray;
        columns++;
    }

    public void removeRow(int index) {
        if (index < 0 || index >= rows) {
            System.out.println("Invalid index. Row index must be between 0 and " + (rows - 1));
            return;
        }
        for (int i = index; i < rows - 1; i++) {
            array[i] = array[i + 1];
        }
        array = Arrays.copyOf(array, rows - 1);
        rows--;
    }

    // Method to remove the last column
    public void removeColumn() {
        if (columns <= 1) {
            System.out.println("Cannot remove the last column. The array must have at least one column.");
            return;
        }
        int[][] newArray = new int[rows][columns - 1]; // Reduce the number of columns
        for (int i = 0; i < rows; i++) {
            System.arraycopy(array[i], 0, newArray[i], 0, columns - 1); // Copy all except the last column
        }
        array = newArray;
        columns--;
    }

    // Method to print the 2D array (traversal)
    public void traverse() {
        for (int i = 0; i < rows; i++) {
            boolean isRowEmpty = true;
            for (int j = 0; j < columns; j++) {
                if (array[i][j] != 0) {
                    isRowEmpty = false;
                    break;
                }
            }
            if (isRowEmpty) {
                continue;
            } else {
                System.out.println(Arrays.toString(array[i]));
            }
        }
    }

    // Method to find the transpose of the matrix
    public int[][] transposeMatrix(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = array[i][j];
            }
        }
        return transpose;
    }
}
