import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			if(numbers.containsKey(target - nums[i])) {
				return new int[]{numbers.get(target - nums[i]), i};
			}numbers.put(nums[i], i);
		}
		return null;
    }

}
