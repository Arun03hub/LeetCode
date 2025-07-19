class Solution {
    public void reorderList(ListNode head) {
        //Edge case , because we are using 2 pointer algm
        if(head==null || head.next==null){
            return ;
        }
        //step1: Find the middle
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //Srep2: divide into 2 halves
        ListNode secondHalf=slow.next;
        slow.next=null;
        //Step3: Reverse the secondHalf
        secondHalf=reverseList(secondHalf);
        //Step4: compare/merge
        ListNode current=head;
        while(secondHalf!=null){
        ListNode nextfirst=current.next;
        ListNode nextsecond=secondHalf.next;

        current.next=secondHalf;
        secondHalf.next=nextfirst;

        current=nextfirst;
        secondHalf=nextsecond;
        }
    }
    private ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}
