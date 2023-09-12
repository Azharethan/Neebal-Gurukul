public class Q9_D9_assignment {
    public static void main(String[] args) {
        String s="helloWorld";
        int count=0;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)>=65&&s.charAt(i)<91){
                count++;
            }
        }
        System.out.println(count);
       

    }
}
