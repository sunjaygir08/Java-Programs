public class findindices {
    public static void findIndices(String S, char a) {
    for (int i = 0; i < S.length(); i++) {
        if (S.charAt(i) == a) {
            System.out.println("Found at index: " + i);
        }
    }
}

public static void main(String[] args) {
    findIndices("Programming", 'm'); 
}
}
