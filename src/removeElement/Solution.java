package removeElement;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * <p>Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:</p>
 * <ul>
 * <li>Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.</li>
 * <li>Return k.</li>
 * </ul>
 */

public class Solution {

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        System.out.println(solution.removeElement(nums1, val1));
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println(solution.removeElement(nums2, val2));
    }

}
