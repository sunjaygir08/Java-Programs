public class A1 {

    // Length of string
    public static int length(String s) {
        int len = 0;
        while (len < s.length()) {
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        // Test cases for Length
        System.out.println("Length: " + length("A computer is an idiot machine"));
        System.out.println("Length: " + length("Data Structures is a prerequisite for compiler construction"));
    }
}
