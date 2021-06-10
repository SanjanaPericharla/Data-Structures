// FIRST APPROACH 
// TAKE TWO POINTERS H1 AND H2 COMPARE THEM AND STORE IT BY CREATING NEW DUMMY NODES AND STORE IT IN IT
// TC - O(N1 + N2)
// SC - O(N1 + N2)


// OPTIMAL APPROACH
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        if(l1.val > l2.val){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
         ListNode res = l1;
        while(l1 != null && l2 != null){
            ListNode temp = null;
            while(l1 != null && l1.val<=l2.val){
                temp = l1;
                 l1 = l1.next;
            }
            temp.next = l2;
             temp = l1;
             l1 = l2;
            l2 = temp;
        }
        return res;
    }
}
