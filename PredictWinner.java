package recursionTest;

//Question 2 .predict The winner player between player 1 and player 2
public class PredictWinner {
	public static void main(String[] args) {
		int[] n= {1,5,233,7};
		boolean result=canPlayerWin(n,0,n.length-1)>=0;
		System.out.println(result);
	}
	
	static int canPlayerWin(int[] nums,int left,int right) {
		if(left==right) 
			return nums[left];
		
		int chooseLeft = nums[left] - canPlayerWin(nums,left+1,right);
		int chooseRight = nums[right] - canPlayerWin(nums,left,right-1);
		
		return Math.max(chooseLeft, chooseRight);
	}

}

