/**
 * Created by Administrator on 6/20/2017.
 */
public class Solution203 {


    // Definition for singly- linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode node = head;
        while (node != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(0);
        ListNode b = a;
        for (int i : new int[]{1, 2, 6, 3, 4, 5, 6}) {
            b.next = new ListNode(i);
            b = b.next;
        }
        removeElements(a, 6);
    }
}
