fn naive_search(text: &str, pattern: &str) {

    let n = text.len();
    let m = pattern.len();

    for i in 0..n-m+1 {
        let mut j = 0;
        while j < m {
            if text.as_bytes()[i+j] != pattern.as_bytes()[j] {
                break;
            }
            j += 1;
        }

        if j == m {
            println!("Pattern found at index {}", i);
        }
    }
}

fn main() {
    let text = "AABAACAADAABAABA";
    let pattern = "AABA";

    naive_search(text, pattern);
}