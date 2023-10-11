package org.example.Medium;

public class Add_Two_Numbers {
    public static void main(String[] arg){
        String haystack= "abc";
        String needle = "c";
        ListNode listNode = new ListNode(9);
        ListNode listNode2 = new ListNode(1,new ListNode(9,new ListNode(9,new ListNode(9))));
        ListNode test2 = new ListNode(9);
        ListNode test = new ListNode(1,test2);
        for(int i=0;i<9;i++){
            ListNode listNode3 = new ListNode(9);
            test2.next=listNode3;
            test2=test2.next;
        }
        System.out.println(addTwoNumbers(listNode,test));









    }
    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
     public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
