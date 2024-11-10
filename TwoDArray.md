# TwoDimensionalArray Class

This class provides operations to manipulate a 2D integer array. The operations include adding and removing rows and columns, traversing the array, and finding the transpose of the matrix.

## 1. `insertRow(int[] newRow)`

### Time Complexity:
- **Best Case**: O(1) — When an empty row is found and the new row is inserted.
- **Worst Case**: O(rows * columns) — If no empty row is found, we copy the entire array and add the new row, which involves iterating through each element of the array.
  
### Space Complexity:
- **O(rows * columns)** — The space complexity depends on the size of the array, which requires space to store the entire 2D array.

### Explanation:
- The method checks for an empty row, and if none is found, it reallocates space and adds the new row. 

## 2. `insertColumn(int[] newCol)`

### Time Complexity:
- **Best Case**: O(rows) — When an empty column is found and the new column is inserted into that column without shifting.
- **Worst Case**: O(rows * columns) — If no empty column is found, the method creates a new array and copies the existing values, which requires iterating through all elements.

### Space Complexity:
- **O(rows * columns)** — Similar to the `insertRow` method, the space complexity is dominated by the size of the array, as a new column is added.

### Explanation:
- The method checks for an empty column and, if not found, reallocates the array, inserting the new column.

## 3. `removeRow(int index)`

### Time Complexity:
- **O(rows)** — In the worst case, when removing a row, the subsequent rows need to be shifted up to fill the gap.
  
### Space Complexity:
- **O(rows)** — The space complexity involves shifting rows in the 2D array, but the space used remains constant as no new arrays are created.

### Explanation:
- The method shifts all rows after the removed one to fill the empty space and reduces the row count.

## 4. `removeColumn()`

### Time Complexity:
- **O(rows * columns)** — When removing the last column, a new array of size `rows x (columns-1)` is created and the values are copied, which involves iterating through each row and column.

### Space Complexity:
- **O(rows * columns)** — Similar to row removal, the space complexity is determined by the size of the array. A new array is created with one less column.

### Explanation:
- The method removes the last column by creating a new array with fewer columns and copying over the existing values.

## 5. `traverse()`

### Time Complexity:
- **O(rows * columns)** — The method iterates through all the rows and columns to check whether each row contains any non-zero values. If the row is not empty, it prints the row.

### Space Complexity:
- **O(1)** — This method only prints values without storing any additional data.

### Explanation:
- This method traverses the array and prints each non-empty row. It skips rows that only contain zeros.

## 6. `transposeMatrix(int[][] array)`

### Time Complexity:
- **O(rows * columns)** — The method iterates over each element of the input matrix to create the transposed matrix. The time complexity depends on the number of elements in the input matrix.

### Space Complexity:
- **O(rows * columns)** — The space complexity is determined by the size of the matrix to store the transposed version, which is the same as the original.

### Explanation:
- This method computes the transpose of a matrix by swapping rows and columns. The transposed matrix is created with the reversed dimensions.

---

## Summary of Complexities

| Method                       | Time Complexity        | Space Complexity     |
|------------------------------|------------------------|----------------------|
| `insertRow`                  | O(rows * columns)      | O(rows * columns)    |
| `insertColumn`               | O(rows * columns)      | O(rows * columns)    |
| `removeRow`                  | O(rows)                | O(rows)              |
| `removeColumn`               | O(rows * columns)      | O(rows * columns)    |
| `traverse`                   | O(rows * columns)      | O(1)                 |
| `transposeMatrix`            | O(rows * columns)      | O(rows * columns)    |

Where:
- `rows` is the number of rows in the 2D array.
- `columns` is the number of columns in the 2D array.

---

### Conclusion

The `TwoDimensionalArray` class provides a variety of operations for managing a 2D array, including insertion, removal, traversal, and matrix transposition. The time complexity for most operations depends on the size of the array, especially when adding or removing rows/columns. The space complexity is typically dominated by the size of the array being manipulated.
