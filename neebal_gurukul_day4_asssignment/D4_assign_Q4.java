public class D4_assign_Q4 {
    public static void main(String[] args) {
        int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
        int sum=0;//to calculate the total running time i substract the value of on time from off time. and add it then i get the value of total running time 
        for(int i=0,j=1; i<ev.length;i=i+2,j=j+2){
            sum = sum +(ev[j]-ev[i]);
        }
        int runningTime=sum;
        int runningTimeInHours=runningTime/100;
        int runningTimeInMinutes=runningTime%100;


        System.out.println("total running time: "+runningTimeInHours+"hr "+runningTimeInMinutes+"min");
    }
}
