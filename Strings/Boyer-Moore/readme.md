
	 Problem (informal): Given strings text and pattern, determine wheter pattern occurs within text
	 
	 Algorithm: Instead of searching left to right, align window and search right to left; if mismatch, shift optimally based on precomputed table
	 
	 Complexity:
	 	* Time - O(n+m) if pattern absent, unless counting all occurances in which case O(nm) if string is repeated character
	 	* Space - O(k) where k is the number of distinct characters in the pattern string
	 	
	 Functions Defined:
	 	* boyer_moore() - Boyer-Moore algorithm

	 Note:
	 	* Although KMP is asymptotically faster, Boyer-Moore is sublinear in practice due to natural ordering of letters


Here is an explanation of the Boyer-Moore algorithm for pattern searching:

The Boyer-Moore algorithm is an efficient string searching algorithm that outperforms simpler algorithms like brute force. It improves search performance by skipping ahead and avoiding matching characters that we know will fail.

The main ideas behind Boyer-Moore:

-   Bad Character Shift: When a mismatch occurs, align the pattern to skip maximum characters based on the mismatched character. This uses a bad character rule table.
-   Good Suffix Shift: When a partial match occurs but mismatch at end, shift the pattern by the maximum overlap amount to avoid re-matching suffixes. This uses a good suffix rule table.

The algorithm has two phases:

1.  Preprocessing Phase:

-   Construct bad character shift table. For each char C in pattern, store the last occurrence index.
-   Construct good suffix shift table. For each suffix, store the overlap amount.

2.  Searching Phase:

-   Align end of pattern to right of text.
-   Check characters from right to left.
-   If mismatch, use bad character rule to shift.
-   If partial match, use good suffix rule to shift.
-   Repeat steps until match found or end reached.

The shifting rules allow skipping characters that we know will not match, making it very efficient. Some optimizations like the Sunday algorithm also exist.

The beauty of Boyer-Moore is its simplicity and use of information from mismatches to improve speed. This allows sub-linear time searches in the best case.