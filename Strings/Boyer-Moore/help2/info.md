
At a high level, the Boyer-Moore Algorithm utilizes two heuristics, known as the Bad Character Rule and the Good Suffix Rule, to skip unnecessary comparisons and quickly determine potential matching positions. By analyzing the pattern from right to left, the algorithm aims to skip as many characters as possible, reducing the number of necessary comparisons

To understand the **Strong Good Suffix Rule**, let’s first explore the **basic Good Suffix Rule**. The Good Suffix Rule aims to find a suffix of the pattern that matches a substring occurring to the left of the mismatched position. This allows for a shift in the pattern, aligning it with the mismatched position and potentially skipping several characters.

**However**, the basic Good Suffix Rule does not consider situations where there is another occurrence of the same suffix within the pattern. This is where the Strong Good Suffix Rule comes into play. It extends the functionality of the basic Good Suffix Rule by considering **additional occurrences** of the same suffix within the pattern

## Applying the Strong Good Suffix Rule

When a mismatch occurs in the Boyer-Moore Algorithm, the Strong Good Suffix Rule helps determine the optimal shift distance. It involves three cases:

1.  **Case 1**: If there is no occurrence of the mismatched suffix within the pattern, the algorithm can shift the pattern by the length of the pattern, effectively skipping the entire pattern.
2.  Case 2: If there is one occurrence of the mismatched suffix within the pattern, the algorithm can shift the pattern to align the last occurrence of the suffix with the current position, effectively skipping a portion of the pattern.
3.  Case 3: If there are multiple occurrences of the mismatched suffix within the pattern, the algorithm checks for the longest suffix that is also a prefix of the pattern. It then shifts the pattern to align the last occurrence of this longest suffix with the current position.

By considering these cases, the Strong Good Suffix Rule allows the Boyer-Moore Algorithm to skip unnecessary comparisons and make optimal shifts, resulting in improved performance for text searching and pattern matching tasks.


At a high level, the Boyer-Moore Algorithm utilizes two heuristics, known as the Bad Character Rule and the Good Suffix Rule, to skip unnecessary comparisons and quickly determine potential matching positions. By analyzing the pattern from right to left, the algorithm aims to skip as many characters as possible, reducing the number of necessary comparisons

To understand the **Strong Good Suffix Rule**, let’s first explore the **basic Good Suffix Rule**. The Good Suffix Rule aims to find a suffix of the pattern that matches a substring occurring to the left of the mismatched position. This allows for a shift in the pattern, aligning it with the mismatched position and potentially skipping several characters.

**However**, the basic Good Suffix Rule does not consider situations where there is another occurrence of the same suffix within the pattern. This is where the Strong Good Suffix Rule comes into play. It extends the functionality of the basic Good Suffix Rule by considering **additional occurrences** of the same suffix within the pattern

## Applying the Strong Good Suffix Rule

When a mismatch occurs in the Boyer-Moore Algorithm, the Strong Good Suffix Rule helps determine the optimal shift distance. It involves three cases:

1.  **Case 1**: If there is no occurrence of the mismatched suffix within the pattern, the algorithm can shift the pattern by the length of the pattern, effectively skipping the entire pattern.
2.  Case 2: If there is one occurrence of the mismatched suffix within the pattern, the algorithm can shift the pattern to align the last occurrence of the suffix with the current position, effectively skipping a portion of the pattern.
3.  Case 3: If there are multiple occurrences of the mismatched suffix within the pattern, the algorithm checks for the longest suffix that is also a prefix of the pattern. It then shifts the pattern to align the last occurrence of this longest suffix with the current position.

By considering these cases, the Strong Good Suffix Rule allows the Boyer-Moore Algorithm to skip unnecessary comparisons and make optimal shifts, resulting in improved performance for text searching and pattern matching tasks.

The bad character rule has the runtime O(n/m) in the best case and O(nm) in the worst case. The worst case occurs when the character of the original string and the string to be found are the same. The best case occurs when all the characters of the original string and the string to be matched are different.

[Interactive Demo of the Boyer-Moore String Search Algorithm (dwnusbaum.github.io)](https://dwnusbaum.github.io/boyer-moore-demo/)


While the bad character rule exploits a single character that is in the text but not in the pattern, the good suffix rule exploits **multiple** contiguous characters that appear in both the text and the pattern.
