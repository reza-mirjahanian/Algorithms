def naive_search(txt, pat):
    M = len(pat)
    N = len(txt)
    res = []

    # A loop to slide pat[] one by one
    for i in range(N - M + 1):
        j = 0

        # For current index i, check for pattern match
        while(j < M):
            if (txt[i + j] != pat[j]):
                break
            j += 1

        if (j == M):  # if pat[0...M-1] = txt[i, i+1, ...i+M-1]
            res.append(i)

    return res



# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    txt = "ABABDABACDABABCABAB"
    pat = "ABABCABAB"
    print("Pattern found at index: ", naive_search(txt, pat))



# In this code, naive_search is a function that takes a text txt and a pattern pat as input. It searches for
# occurrences of the pattern in the text and returns the starting indices of all occurrences. The function uses a
# sliding window approach to move the pattern over the text one character at a time and checks for a match. If a
# match is found, it adds the starting index of the match to the result list res. Finally, it prints the indices
# where the pattern is found in the text. The time complexity of this algorithm is O((N-M+1)*M) where N is length of
# text and M is length of pattern.
