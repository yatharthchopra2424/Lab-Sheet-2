package test;

import java.util.Arrays;
import source.TwoDimensionalArray;

public class TwoDimensionalArrayTest {
    public static void main(String[] args) {
        TwoDimensionalArray tdArray = new TwoDimensionalArray(2, 2);
        int[][] array = { { 1, 2 }, { 3, 4 } };

        tdArray.insertRow(new int[] { 1, 2 });
        tdArray.insertRow(new int[] { 3, 4 });

        System.out.println("Original Array:");
        tdArray.traverse();
        System.out.println();
        tdArray.removeRow(0);
        tdArray.traverse();

        System.out.println("\nTranspose of the Array:");
        int[][] transpose = tdArray.transposeMatrix(array);
        for (int i = 0; i < transpose.length; i++) {
            System.out.println(Arrays.toString(transpose[i]));
        }
    }
}
