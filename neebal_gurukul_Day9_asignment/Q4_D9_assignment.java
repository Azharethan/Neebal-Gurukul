public class Q4_D9_assignment {
    public static void main(String[] args) {
        String s =" Hello World"  ;
        s=s.trim();

        int wordCount=1;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                wordCount++;
            }
        }
        System.out.println(wordCount);
        
           
    }
}
