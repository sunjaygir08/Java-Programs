public class insert {
    // Insert string P into text T at position ip
    public static String performInsert(String T, int ip, String P) {
        String temp1 = T.substring(0, ip);                  // substring before ip
        String temp2 = T.substring(ip);                     // substring after ip
        return temp1 + P + temp2;                           // concatenate all
    }

    public static void main(String[] args) {
        // Test case for Insert
        String T = "The founder of our country was Quaid-e-Azam";
        int ip = 12;
        String P = "and first Governor General ";
        String result = performInsert(T, ip, P);
        System.out.println("After Insert: " + result);
    }
}
