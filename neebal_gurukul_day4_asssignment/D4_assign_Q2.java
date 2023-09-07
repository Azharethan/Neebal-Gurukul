public class D4_assign_Q2 {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }

        }
        double attendance=count;
        double percentageOfAttendance=(attendance/(arr.length))*100;
        System.out.println("attendance percentage of this student: "+percentageOfAttendance);
    }
}
