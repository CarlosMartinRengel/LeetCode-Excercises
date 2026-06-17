package removeDuplicatesFromSortedArray;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
 * Consider the number of unique elements in nums to be k. After removing duplicates, return the number of unique elements k.
 * The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
 */

public class Solution {

    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 1, 2};
        System.out.println(solution.removeDuplicates(nums1));
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(solution.removeDuplicates(nums2));

    }

}
