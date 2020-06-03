package leetcode.linkedlist;

/**
 * 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class LeetCode2 {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        ListNode curResultNode = resultNode;
        ListNode cur1 = l1, cur2 = l2;
        int add = 0;
        while (cur1 != null || cur2 != null) {
            int num1 = cur1 == null ? 0 : cur1.val;
            int num2 = cur2 == null ? 0 : cur2.val;

            int sum = num1 + num2 + add;
            add = sum / 10;
            curResultNode.next = new ListNode(sum % 10);
            curResultNode = curResultNode.next;
            if (cur1 != null) {
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                cur2 = cur2.next;
            }
        }

        if (add != 0) {
            curResultNode.next = new ListNode(add);
        }

        return resultNode.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}