public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode startindex=head;
                while(startindex!=slow){
                    startindex=startindex.next;
                    slow=slow.next;
                }
                return startindex;
            }
        }
        return null;
    }
}
