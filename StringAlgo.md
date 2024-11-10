# StringAlgorithms Class

This class provides various string manipulation algorithms including the Knuth-Morris-Pratt (KMP) string matching algorithm, building the Longest Prefix Suffix (LPS) array, and Run-Length Encoding (RLE). Below, we break down the time and space complexities for each method.

## 1. Knuth-Morris-Pratt (KMP) Algorithm
### Method: `knuthMorrisPratt(String text, String pattern)`

The Knuth-Morris-Pratt (KMP) algorithm is an efficient string-matching algorithm that improves the brute-force approach by utilizing information from previously matched characters to avoid redundant comparisons.

### Time Complexity:
- **Best Case**: O(n) — When the `pattern` is a perfect match or doesn't match at all with `text`.
- **Worst Case**: O(n + m) — Where `n` is the length of `text` and `m` is the length of `pattern`. The worst case occurs when the `pattern` and `text` partially match, requiring the use of the LPS array to optimize the search.
- **Average Case**: O(n + m) — Typically, the search will take linear time in both the text and the pattern.

### Space Complexity:
- **O(m)** — The space complexity is determined by the `LPS` array which is of size `m` (the length of the `pattern`). This array stores the longest prefix which is also a suffix for every prefix of the `pattern`.

### Explanation:
- The KMP algorithm uses the LPS array to skip re-evaluating previously matched characters, resulting in more efficient matching, especially for large strings.

## 2. Building Longest Prefix Suffix (LPS) Array
### Method: `buildLPS(String pattern)`

This method builds the Longest Prefix Suffix (LPS) array used by the KMP algorithm. The LPS array holds the lengths of the longest proper prefix which is also a suffix for each prefix of the `pattern`.

### Time Complexity:
- **O(m)** — The LPS array is built by iterating through the `pattern` string once, where `m` is the length of the `pattern`.

### Space Complexity:
- **O(m)** — The space complexity is O(m) because the method creates an integer array of length `m` to store the LPS values.

### Explanation:
- The LPS array is central to the efficiency of the KMP algorithm. It allows the pattern to be shifted without needing to recheck matched characters.

## 3. Run-Length Encoding (RLE)
### Method: `runLengthEncoding(String text)`

Run-Length Encoding (RLE) is a simple form of data compression where consecutive repeated characters are stored as a single character and a count.

### Time Complexity:
- **O(n)** — The method iterates over the entire input string `text`, where `n` is the length of the string. For each character, it compares it with the previous one, which is a constant-time operation.

### Space Complexity:
- **O(n)** — In the worst case, where no characters repeat (e.g., all characters in `text` are distinct), the encoded string would be at least as long as the original string, leading to a space complexity of O(n).

### Explanation:
- The method builds the encoded string by counting the consecutive occurrences of each character. If there are long sequences of repeated characters, the resulting encoded string will be shorter.

---

## Summary of Complexities

| Method                       | Time Complexity        | Space Complexity     |
|------------------------------|------------------------|----------------------|
| `knuthMorrisPratt`            | O(n + m)               | O(m)                 |
| `buildLPS`                    | O(m)                   | O(m)                 |
| `runLengthEncoding`           | O(n)                   | O(n)                 |

Where:
- `n` is the length of the `text` string.
- `m` is the length of the `pattern` string.

---

### Conclusion

The `StringAlgorithms` class provides efficient string manipulation algorithms. The KMP algorithm significantly improves the time complexity of string matching, and both the LPS array and RLE techniques optimize space and time when handling large strings.
