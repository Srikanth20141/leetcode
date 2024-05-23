package exercise;

public class LC_01_TwoSum {
	
//	Example 1:
//
//		Input: nums = [2,7,11,15], target = 9
//		Output: [0,1]
//		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

	public static void main(String[] args) {
		
		int number[] = {2,7,11,15};
		int target = 9;
		
		for(int i = 0; i < number.length ; i++) {

			System.out.println(number[i]);
			for(int j =i+1;j<number.length;j++) {
				
				if(target == number[i] + number[j]) {
					System.out.println("["+i+","+j+"]");
				}
			}
		}

	}

}
