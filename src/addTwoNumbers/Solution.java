package addTwoNumbers;

import utils.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }

    private ListNode add(ListNode l1, ListNode l2, int carry){
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;

        int sum = val1 + val2 + carry;
        int newCarry = sum/10;

        ListNode node = new ListNode(sum%10);

        ListNode next1 = (l1 != null) ? l1.next : null;
        ListNode next2 = (l2 != null) ? l2.next : null;

        node.next = add(next1, next2, newCarry);

        return node;
    }

    public static void printList(ListNode list) {
        ListNode current = list;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode list1_case1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode list2_case1 = new ListNode(5, new ListNode(6, new ListNode(7)));

        System.out.print("Result: ");
        ListNode merged1 = solution.addTwoNumbers(list1_case1, list2_case1);
        printList(merged1);
    }
}
