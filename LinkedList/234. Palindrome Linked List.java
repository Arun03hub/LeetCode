class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        //find the middle 
        ListNode slow=head;
        ListNode fast=head;
        while(slow!=null && fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
        }
            //revers the second half list
            ListNode secondHalfList=reverseList(slow);

            //compare the first and second half
            ListNode firstHalfNode=head;
            ListNode second=secondHalfList;
            while(second!=null){
                if(firstHalfNode.val!= second.val){
                    return false;
                }
                firstHalfNode=firstHalfNode.next;
                second=second.next;
            }
            return true;
    }
    private ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
