public class concate {
    public static String repeatConcat(String S, int n) {
    String result = S;
    while (result.length() < n) {
        result += S;
    }
    return result;
}

public static void main(String[] args) {
    System.out.println("Repeat Concat: " + repeatConcat("abc", 10));
}
}
