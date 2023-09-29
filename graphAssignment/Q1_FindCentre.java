package graphAssignment;

public class Q1_FindCentre {
	public static void main(String[] args) {
		int[][] edge= {{1,2},{2,3},{4,2}};
//		int[][] edge= {{1,2},{5,1},{1,3}};
		
		int ans=findCentre(edge);
		System.out.println(ans);
	}
	static int findCentre(int[][] edge) {
		if(edge[0][0]==edge[1][0] || edge[0][0]==edge[1][1]) {
			return edge[0][0];
		} else {
			return edge[0][1];
		} 
	}
}
