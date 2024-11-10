## Recurrence Relations in Lab Sheet 2 - Array and String Algorithms
Lab Sheet 2 also features primarily iterative solutions, but for some string pattern matching and array traversal algorithms, recurrence relations can provide insight if recursion is used instead.

### KMP Pattern Matching (Recursive Analysis)
- **Recursive KMP Pattern Matching**:
   - **Recurrence Relation**: \( T(n) = T(n-m) + O(m) \)
   - **Explanation**: In this recursive version of the KMP algorithm, each matching attempt processes \( m \) characters (where \( m \) is the pattern length) in constant time due to the precomputed LPS (Longest Prefix Suffix) array.
   - **Solution**: This simplifies to \( O(n) \), indicating linear time complexity.

### Matrix Transpose (Recursive)
- **Recursive Matrix Transpose**:
   - **Recurrence Relation**: \( T(n * m) = T(n-1 * m) + O(m) \)
   - **Explanation**: For each recursive step, the algorithm processes one row or column of \( m \) elements.
   - **Solution**: This recurrence simplifies to \( T(n * m) = O(n * m) \), which is consistent with the time complexity of the iterative approach.

### Run Length Encoding (RLE) (Recursive)
- **Recursive Run Length Encoding**:
   - **Recurrence Relation**: \( T(n) = T(n-1) + O(1) \)
   - **Explanation**: Each recursive call processes one character, moving to the next.
   - **Solution**: Solving this recurrence gives \( T(n) = O(n) \), confirming linear time complexity.
