public class Q2_D11_Assignment {
    public static void main(String[] args) {
        String s = "Hello";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("number of vowels are: " + count);
    }
}
