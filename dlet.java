public class dlet {
    // Delete substring of length L starting at position ip
    public static String delete(String T, int ip, int L) {
        String temp1 = T.substring(0, ip);                   // substring before ip
        String temp2 = T.substring(ip + L);                  // substring after deleted part
        return temp1 + temp2;                                // concatenate remaining parts
    }

    public static void main(String[] args) {
        // Test case for Delete
        String T = "Database Management Systems";
        int ip = 9;
        int L = 10;
        String result = delete(T, ip, L);
        System.out.println("After Delete: " + result);
    }
}
