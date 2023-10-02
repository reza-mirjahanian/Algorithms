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


function findAllOccurrences(fullString, substring) {

    let indices = [];

    // Loop through full string
    for(let i = 0; i < fullString.length; i++) {

        // Check if substring matches at position i
        if(fullString.substring(i, i + substring.length) === substring) {
            indices.push(i);
        }
    }

    console.log("-> findAllOccurrences()", indices);
    return indices;
}

function findIndices(str, subStr) {
    const indices = [];
    let index = -1;
    while ((index = str.indexOf(subStr, index + 1)) !== -1) {
        indices.push(index);
    }


    console.log("-> findIndices()", indices);
    return indices;
}


const findIndicesRegex = (str, searchStr) => {
    const indices = [...str.matchAll(new RegExp(searchStr, 'gi'))].map(a => a.index);
    //Todo findIndicesRegex() [ 0, 9 ] , regex doesn't look back
    console.log("-> findIndicesRegex()", indices);
    return indices;
};



//////////////////////////
let text = "AABAACAADAABAABA";
let pattern = "AABA";

naivePatternSearch(text, pattern);
console.log('--------------------------------------------------------------')

findAllOccurrences(text, pattern);
console.log('--------------------------------------------------------------')

findIndices(text, pattern);
console.log('--------------------------------------------------------------')


findIndicesRegex(text, pattern);
console.log('--------------------------------------------------------------')
// Output:
// Pattern found at index 0
// Pattern found at index 9
// Pattern found at index 12