public class A3 {
    // A3: Substring
public static String substring(String s, int ip, int len) {
    return s.substring(ip, ip + len);
}

public static void main(String[] args) {
    System.out.println("Substring: " + substring("Cray is a supercomputer", 16, 8));
    System.out.println("Substring: " + substring("Unix is a multi-user operating system", 24, 6));
}
}
