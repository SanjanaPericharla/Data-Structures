class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
        while(head != null){
            if(head.next != null && head.val == head.next.val){
              // skip the values if head is equal to head.next.
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
            }
            else{
                prev = prev.next;
            }
             head = head.next;
        }
        return dummy.next;
    }
}
// time complexity : o(n)
// sc - O(n)
