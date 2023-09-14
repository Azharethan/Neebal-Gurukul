class NoMatchException extends Exception{

}
public class Q1_D11_assignment {
    public static void main(String[] args) {
        try {
            String s="Bharat";
            if(!s.equals("India")){
                throw new NoMatchException();
            } else{
                System.out.println("string is india");
            }
        } catch (NoMatchException e) {
            System.out.println("String is not india: "+e);
        } 
    }
}
