#include <iostream>

using namespace std;

void search(string text, string pattern) {
    int m = pattern.size();
    int n = text.size();

    for (int i = 0; i <= n - m; i++) {
        int j;
        for (j = 0; j < m; j++) {
            if (text[i + j] != pattern[j]) {
                break;
            }
        }

        if (j == m) {
            cout << "Pattern found at index " << i << endl;
        }
    }
}

int main() {
    string text = "Hello, world!";
    string pattern = "world";

    search(text, pattern);

    return 0;
}
