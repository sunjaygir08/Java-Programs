public class DSAlab2 {
    // ---------------- Lab 2a Functions ----------------

    // A1: Length of string
    public static int length(String s) {
        int len = 0;
        while (len < s.length()) {
            len++;
        }
        return len;
    }

    // A2: Concatenation
    public static String concatenate(String s1, String s2) {
        return s1 + s2;
    }

    // A3: Substring
    public static String substring(String s, int ip, int len) {
        return s.substring(ip, ip + len);
    }

    // A4: Index (Pattern Matching)
    public static int index(String T, String P) {
        int t = T.length();
        int p = P.length();
        int max = t - p + 1;

        for (int i = 0; i < max; i++) {
            int j;
            for (j = 0; j < p; j++) {
                if (P.charAt(j) != T.charAt(i + j)) break;
            }
            if (j == p) return i; // match found
        }
        return -1; // no match
    }

    // Task (e): Concatenate until length ≥ n
    public static String repeatConcat(String S, int n) {
        String result = S;
        while (result.length() < n) {
            result += S;
        }
        return result;
    }

    // Task (f): Display indices of all occurrences of a character
    public static void findIndices(String S, char a) {
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == a) {
                System.out.println("Found at index: " + i);
            }
        }
    }

    // ---------------- Lab 2b Functions ----------------

    // A1: Insert
    public static String insert(String T, int ip, String P) {
        String temp1 = T.substring(0, ip);
        String temp2 = T.substring(ip);
        return temp1 + P + temp2;
    }

    // A2: Delete
    public static String delete(String T, int ip, int L) {
        String temp1 = T.substring(0, ip);
        String temp2 = T.substring(ip + L);
        return temp1 + temp2;
    }

    // ---------------- Main Method ----------------
    public static void main(String[] args) {
        // Lab 2a Tests
        System.out.println("Length: " + length("A computer is an idiot machine"));
        System.out.println("Length: " + length("Data Structures is a prerequisite for compiler construction"));

        System.out.println("Concatenation: " + concatenate("But", "ter"));
        System.out.println("Concatenation: " + concatenate("Symmetric", "Multiprocessing"));

        System.out.println("Substring: " + substring("Cray is a supercomputer", 16, 8));
        System.out.println("Substring: " + substring("Unix is a multi-user operating system", 24, 6));

        System.out.println("Index: " + index("Hello World", "World"));
        System.out.println("Index: " + index("Data Structures", "Algo"));

        System.out.println("Repeat Concat: " + repeatConcat("abc", 10));

        findIndices("Programming", 'm');

        // Lab 2b Tests
        String T1 = "The founder of our country was Quaid-e-Azam";
        System.out.println("After Insert: " + insert(T1, 12, "and first Governor General "));

        String T2 = "Database Management Systems";
        System.out.println("After Delete: " + delete(T2, 9, 10));
    }
}
