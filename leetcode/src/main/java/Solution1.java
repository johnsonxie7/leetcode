

import java.util.HashMap;
/**
 * 
 * @author xiefeng
 *	描述：判断数组中，是否存在两个数之和为目标数字。
 */
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> tractor = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(tractor.containsKey(nums[i])){
            	Integer left = tractor.get(nums[i]);
            	return new int[]{left,i};
            }else{
            	tractor.put(target-nums[i], i);
            }
        }
        return new int[2];
    }
    public static void main(String[] args) {
    	int[] a = {2,7,17};
		a = new Solution1().twoSum(a,9);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}