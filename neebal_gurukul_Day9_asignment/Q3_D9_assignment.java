public class Q3_D9_assignment {
    public static void main(String[] args) {
    String s="())(";
       int count1=0;
       int count2=0;
        for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i)==('(')){
                count1++;
            } else {
                count2++;
            }
        }
       
        if(count1==count2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
}
       
}
