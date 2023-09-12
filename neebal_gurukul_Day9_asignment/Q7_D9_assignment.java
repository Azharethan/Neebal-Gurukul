public class Q7_D9_assignment {
    public static void main(String[] args) {
        String s="abcd";
        String s5="cdab";
        int i=0;
        while(i<s.length()/2){
        String s1=s.substring(0, s.length()-1);
        char s2=s.charAt(s.length()-1);
        s=s2+s1;  
        i++;
        }
        System.out.println(s.equals(s5));
    }
}
