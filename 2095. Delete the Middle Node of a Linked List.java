/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null){
            return null;
        }
        else if(head.next == null) {
            return null;
        }
        else if( head.next.next == null){
            head.next = null;
            return head;
        }
        else{
            ListNode save = head;
            ListNode pre = head;
            int ok = 1;
            while(save.next != null){
                save = save.next;
                ok++;
            }
            save = head;
            int delel = ok/2;
            for(int i = 0 ; i < delel ; i++){
                pre = save;
                save = save.next;
            }
            pre.next = save.next;
            save.next = null;
            return head;
        }
    }
}
