class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fast=l1 ; 
        ListNode slow=l2;
        ListNode head=null , last=null;
        int carry=0;

        while(fast!=null || slow!=null){
            int sum=carry;
            if(fast!=null){
                sum+=fast.val;//indivsualy adding like sum= 0+2=2
                fast=fast.next;
            }
             if(slow!=null){
                sum+=slow.val;//sum=2+5=7
                slow=slow.next;
            }
            int val=sum%10;
            carry=sum/10;

            if(head==null){
                head=new ListNode(val);
                last=head;
            }
            else{
                last.next=new ListNode(val);
                last=last.next;
            }
        }
        if(carry>0){
            last.next=new ListNode(carry);
            last=last.next;
        }
        return head;
    }
}
