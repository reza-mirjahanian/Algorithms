public class Main {
    public static void main(String[] args) {
        String txt = "ABAAABCD";
        String pat = "ABC";
        int index = search(txt, pat);

        if(index == -1) {
            System.out.println("Pattern not found");
        } else {
            System.out.println("Pattern found at index: " + index);
        }
    }


    public static int search(String txt, String pat) {
        int m = pat.length();
        int n = txt.length();

        int[] badChar = new int[256];

        // Preprocess
        for(int i = 0; i < 256; i++) {
            badChar[i] = -1;
        }

        for(int i = 0; i < m; i++) {
            badChar[pat.charAt(i)] = i;
        }

        int s = 0;
        while(s <= n - m) {
            int j = m - 1;

            while(j >= 0 && pat.charAt(j) == txt.charAt(s+j)) {
                j--;
            }

            if (j < 0) {
                return s; // match
            }

            // Bad character heuristic
            s += Math.max(1, j - badChar[txt.charAt(s+j)]);
        }
        return -1;
    }

}