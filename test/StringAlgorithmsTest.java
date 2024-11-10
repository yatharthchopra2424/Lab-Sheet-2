package test;

import source.StringAlgorithms;

public class StringAlgorithmsTest {
    public static void main(String[] args) {
        StringAlgorithms sa = new StringAlgorithms();
        System.out.println("KMP Match Index: " + sa.knuthMorrisPratt("abxabcabcaby", "abcaby"));
        System.out.println("RLE: " + sa.runLengthEncoding("aaabbbcccaaa"));
    }
}
