public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m = FindNodeLength(headA);
        int n = FindNodeLength(headB);
        ListNode fp = headA, sp = headB;

        if (m < n) {
            for (int i = 0; i < n - m; i++) {
                sp = sp.next;
            }
        } else if (m > n) {
            for (int i = 0; i < m - n; i++) {
                fp = fp.next;
            }
        }

        return FindSameNode(fp, sp);
    }

    //first helper fun i.e finding length
    private int FindNodeLength(ListNode head) {
        int length = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

    //second helper fun i.e check same or not like a1==b1 /a1==b2
    private ListNode FindSameNode(ListNode fp, ListNode sp) {
        while (fp != null && sp != null) {
            if (fp == sp) {
                return fp;
            }
            fp = fp.next;
            sp = sp.next;
        }
        return null;
    }
}
