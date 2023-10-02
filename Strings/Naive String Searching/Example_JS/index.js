function naivePatternSearch(text, pattern) {

    let M = pattern.length;
    let N = text.length;

    for (let i = 0; i <= N - M; i++) {

        let j;
        for (j = 0; j < M; j++) {
            if (text[i+j] !== pattern[j])
                break;
        }

        if (j === M) {
            console.log("Pattern found at index "+ i);
        }
    }
}

let text = "AABAACAADAABAABA";
let pattern = "AABA";

naivePatternSearch(text, pattern);

// Output:
// Pattern found at index 0
// Pattern found at index 9
// Pattern found at index 12