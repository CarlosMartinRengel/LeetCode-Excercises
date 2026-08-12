package removeDuplicatesFromSortedList;

import utils.ListNode;

/**
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode list1_case1 = new ListNode(1, new ListNode(1, new ListNode(2)));
        ListNode list2_case1 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));

        System.out.println("Lista original: " + list1_case1);
        System.out.print("Result: ");
        ListNode deleted1 = solution.deleteDuplicates(list1_case1);
        System.out.println(deleted1);

        System.out.println("Lista original: " + list2_case1);
        System.out.print("Result: ");
        ListNode deleted2 = solution.deleteDuplicates(list2_case1);
        System.out.println(deleted2);
    }
}
