//Naive Algorithm for Pattern Searching
public class Main {

    // determine   whether pattern occurs within          text
    // Complexity:
    // *           Time    -       O(nm)  (asymptotically tight if finding all  occurrences) Since all windows tested
    // *           Space   -       O(1)   since  no additional space   used

    public static boolean naiveTextSearch(String pat, String txt) {
        boolean contains;
        for (int i = 0; i <= txt.length() - pat.length(); i++) {
            contains = txt.startsWith(pat, i);
            if (contains) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        long start = System.nanoTime();

        String txt = "awefdwefwfef";
        String pat = "fwef";

        boolean ans = naiveTextSearch(pat, txt);
        System.out.println(ans);
        System.out.println("\n" + ((System.nanoTime() - start) * 1E-6) + " ms");
    }
}