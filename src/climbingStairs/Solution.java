package climbingStairs;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

public class Solution {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n==2)
            return 2;

        int two_behind = 1;
        int one_behind = 2;
        int now = 0;

        for (int i = 3; i < n + 1; i++){
            now = two_behind + one_behind;

            two_behind = one_behind;
            one_behind = now;
        }
        return now;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.climbStairs(2));
        System.out.println(solution.climbStairs(3));
        System.out.println(solution.climbStairs(5));

    }
}
