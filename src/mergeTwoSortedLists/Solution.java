package mergeTwoSortedLists;

import utils.ListNode;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 * Return the head of the merged linked list.
 */

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode list1_case1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2_case1 = new ListNode(1, new ListNode(3, new ListNode(4)));

        System.out.print("Result: ");
        ListNode merged1 = solution.mergeTwoLists(list1_case1, list2_case1);
        System.out.println(merged1);

        ListNode list1_case2 = null;
        ListNode list2_case2 = null;

        System.out.print("Result: ");
        ListNode merged2 = solution.mergeTwoLists(list1_case2, list2_case2);
        System.out.println(merged2);

        ListNode list1_case3 = null;
        ListNode list2_case3 = new ListNode(0);

        System.out.print("Result: ");
        ListNode merged3 = solution.mergeTwoLists(list1_case3, list2_case3);
        System.out.println(merged3);
    }
}
