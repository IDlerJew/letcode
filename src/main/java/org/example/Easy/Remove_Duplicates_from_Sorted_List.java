package org.example.Easy;

public class Remove_Duplicates_from_Sorted_List {
    public static void main(String[] arg){
        ListNode listtest=  new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3)))));
        System.out.println((deleteDuplicates(listtest)));
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return  head;
        }
        ListNode listNode1= head;
        ListNode listNode2 = head.next;
        while(listNode2!=null){
            if (listNode1.val==listNode2.val){
                listNode1.next=listNode2.next;
                listNode2=listNode1.next;
                continue;
            }
            else {
                listNode1=listNode2;
                listNode2=listNode2.next;
            }
        }
        return head;
    }
    public static class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
