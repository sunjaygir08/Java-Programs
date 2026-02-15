public class A4 {
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

public static void main(String[] args) {
    System.out.println("Index: " + index("Hello World", "World")); // Output: 6
    System.out.println("Index: " + index("Data Structures", "Algo")); // Output: -1
}
}
