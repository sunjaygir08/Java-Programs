public class A3 {
    public static String substring(String s, int ip, int len) {
        int end = Math.min(ip + len, s.length());
        return s.substring(ip, end);
    }
    public static void main(String[] args) {
        System.out.println("Substring: " + substring("Cray is a supercomputer", 16, 8));
        System.out.println("Substring: " + substring("Unix is a multi-user operating system", 24, 6));
    }
}
